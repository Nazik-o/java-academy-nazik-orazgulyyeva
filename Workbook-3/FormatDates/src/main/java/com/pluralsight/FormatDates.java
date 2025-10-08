package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalTime time = LocalTime.now();//Current time in GMT
        ZonedDateTime nowGMT = ZonedDateTime.now(ZoneOffset.UTC);//Current time in computer’s timezone
        ZonedDateTime nowLocal = ZonedDateTime.now(ZoneId.systemDefault());//

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(today.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(today.format(format2));

        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(today.format(format3));

        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        System.out.println(nowGMT.format(format4) + " GMT");

        //Challenge
        DateTimeFormatter format5 = DateTimeFormatter.ofPattern("H:mm 'on' dd-MMM-yyyy");
        System.out.println(nowLocal.format(format5));

    }
}
