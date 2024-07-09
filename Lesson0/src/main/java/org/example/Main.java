package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(sc);


        boolean running = true;
        while (running) {
            printMenu();
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Выполняется команда 1");
                    stepTracker.addNewNumberStepsPerDay();
                    break;
                case 2:
                    System.out.println("Выполняется команда 2");
                    break;
                case 3:
                    System.out.println("Выполняется команда 3");
                    break;
                case 4:
                    System.out.println("Пока!");
                    running = false;
                    break;
                default:
                    System.out.println("Такой команды нет");

            }

        }
        sc.close();

    }
    public static void printMenu() {
            System.out.println("1. Для внесения количества шагов за определённый день введите 1");
            System.out.println("2. Для изменения цели по количеству шагов в день введите 2");
            System.out.println("3. Для печати статистики за определённый месяц введите 3");
            System.out.println("4. Для выхода из приложения введите 4");
    }
}