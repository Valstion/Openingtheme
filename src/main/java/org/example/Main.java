package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DayOfWeek actualWeekDay = LocalDate.now().getDayOfWeek();
        System.out.println(actualWeekDay);
        try {

            int i;
            for (i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("Timer" + (i + 1));
            }}
         catch (InterruptedException e){

            System.out.println("Interupted exseption invoced");}
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}






