package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int input = 0;
        System.out.println("Выберите действие");

        while (input != 5) {

            System.out.println("""
                    1.Сложение
                    2.Вычитание
                    3.Умножение
                    4.Деление
                    5.Выход из программы""");

            input = scn.nextInt();

            switch (input) {
                case 1 -> {
                    System.out.println("Введите 1-ю цифпу");
                    int a = scn.nextInt();
                    if (a > 10 || a < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    System.out.println("Введите 2-ю цифру");
                    int b = scn.nextInt();
                    if (b > 10 || b < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    int result = a + b;
                    System.out.println("Результат = " + result);
                }
                case 2 -> {
                    System.out.println("Введите 1-ю цифпу");
                    int a = scn.nextInt();
                    if (a > 10 || a < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    System.out.println("Введите 2-ю цифру");
                    int b = scn.nextInt();
                    if (b > 10 || b < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    int result = a - b;
                    System.out.println("Результат = " + result);
                }
                case 3 -> {
                    System.out.println("Введите 1-ю цифпу");
                    int a = scn.nextInt();
                    if (a > 10 || a < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    System.out.println("Введите 2-ю цифру");
                    int b = scn.nextInt();
                    if (b > 10 || b < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    int result = a * b;
                    System.out.println("Результат = " + result);
                }
                case 4 -> {
                    System.out.println("Введите 1-ю цифпу");
                    int a = scn.nextInt();
                    if (a > 10 || a < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    System.out.println("Введите 2-ю цифру");
                    int b = scn.nextInt();
                    if (b > 10 || b < 1) {
                        System.out.println("Некорректное значение");
                        break;
                    }
                    int result = a / b;
                    System.out.println("Результат = " + result);
                }
                case 5 -> System.out.println("До свидания!");


            }
        }

    }
}