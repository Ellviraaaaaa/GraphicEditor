package com.example.graphiceditor.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

@Entity
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String format; // bmp, png, jpg
    private byte[] data;
    private String type;

    // Поле для зберігання пікселів (не зберігається в базі)
    private transient int[][] pixels;

    public Image() {}

    public Image(String name, String format, byte[] data) {
        this.name = name;
        this.format = format;
        this.data = data;
        this.pixels = extractPixelsFromData(); // Ініціалізуємо пікселі з наявних даних
    }

    // Геттер для пікселів
    public int[][] getPixels() {
        if (pixels == null) {
            pixels = extractPixelsFromData(); // Генеруємо пікселі, якщо вони ще не ініціалізовані
        }
        return pixels;
    }

    // Сеттер для пікселів
    public void setPixels(int[][] pixels) {
        this.pixels = pixels;
        this.data = generateDataFromPixels(); // Оновлюємо поле data після зміни пікселів
    }


    public int getId() {
        return id;
    }

    // Сеттер для поля id
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public byte[] getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void setData(byte[] data) {
        this.data = data;
        this.pixels = extractPixelsFromData(); // Оновлюємо пікселі після зміни даних
    }

    // Метод для перетворення byte[] data у двовимірний масив пікселів
    private int[][] extractPixelsFromData() {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(data);
            BufferedImage bufferedImage = ImageIO.read(bais);

            int width = bufferedImage.getWidth();
            int height = bufferedImage.getHeight();
            int[][] pixels = new int[height][width];

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    pixels[y][x] = bufferedImage.getRGB(x, y); // Отримання кольору пікселя
                }
            }
            return pixels;
        } catch (IOException e) {
            throw new RuntimeException("Error while extracting pixels from data", e);
        }
    }

    // Метод для перетворення двовимірного масиву пікселів у byte[]
    private byte[] generateDataFromPixels() {
        try {
            if (pixels == null) {
                throw new IllegalStateException("Pixels data is not initialized");
            }

            int height = pixels.length;
            int width = pixels[0].length;
            BufferedImage bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    bufferedImage.setRGB(x, y, pixels[y][x]); // Встановлення кольору пікселя
                }
            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, format, baos);
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("Error while generating data from pixels", e);
        }
    }
}
