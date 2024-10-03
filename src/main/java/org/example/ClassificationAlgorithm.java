package org.example;

import java.util.Scanner;

public class ClassificationAlgorithm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите информацию для классификации:");
        String information = input.nextLine();

        classifyInformation(information);
    }

    public static void classifyInformation(String information) {
        // считаем количество слов и определяем уровень чувствительности
        String[] words = information.split(" ");
        int wordCount = words.length;

        if (wordCount < 5) {
            System.out.println("Низкий уровень чувствительности");
        } else if (wordCount < 10) {
            System.out.println("Средний уровень чувствительности");
        } else {
            System.out.println("Высокий уровень чувствительности");
        }
    }
}
