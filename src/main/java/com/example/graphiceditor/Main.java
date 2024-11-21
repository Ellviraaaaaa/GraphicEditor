package com.example.graphiceditor;

import com.example.graphiceditor.proxy.ImageProxy;
import com.example.graphiceditor.proxy.ImageProxyImpl;

// Тестування роботи патерну Proxy
public class Main {
    public static void main(String[] args) {
        ImageProxy image1 = new ImageProxyImpl("photo1", "jpg");
        ImageProxy image2 = new ImageProxyImpl("photo2", "png");

        System.out.println("Отримуємо назви зображень:");
        System.out.println("Зображення 1: " + image1.getName());
        System.out.println("Зображення 2: " + image2.getName());

        System.out.println("\nВідображення зображень:");
        image1.display();
        image2.display();
    }
}

