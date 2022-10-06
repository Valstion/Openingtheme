package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DayOfWeek actualWeekDay = LocalDate.now().getDayOfWeek();
        System.out.println(actualWeekDay);
    }
}