package org.example;

import java.util.Scanner;

class StepTracker {
    MonthData[] monthToData = new MonthData[12];
    Scanner scan;
    int goalByStepPerDay = 10000;


    StepTracker(Scanner scan) {
        this.scan = scan;
        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    public void addNewNumberStepsPerDay() {

        System.out.println("Введите месяц от 1 до 12");
        int month = scan.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("Неверный месяц");
            return;
        }
        MonthData currentMonth = monthToData[month - 1];
        System.out.println("Введите день от 1 до 30");
        int day = scan.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("Неверный день");
            return;
        }
        int[] days = currentMonth.getDays();
        System.out.println("Введите количество шагов");
        int steps = scan.nextInt();
        if (steps < 1) {
            System.out.println("Неверное количество шагов");
            return;
        }
        days[day - 1] = steps;

    }
}