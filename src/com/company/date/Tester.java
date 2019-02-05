package com.company.date;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2018,1,1);


        Period period = Period.of(1,2,3);

        System.out.println(date.plus(period.plusYears(2)));

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;

        System.out.println(formatter.format(date));

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(date.format(f));

        LocalTime.now();

        Duration d = Duration.ofDays(2);

    }

    static void method() {

    }
}
