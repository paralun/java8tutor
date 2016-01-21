package com.paralun.app;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author James Kusmambang
 * @Since 21/01/2016
 */
public class Waktu {

    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Waktu sekarang : " + dateTime);

        LocalDateTime ldtm = LocalDateTime.of(2014, 3, 30, 12, 30);
        System.out.println("Custom : " + ldtm);

        LocalDateTime ldts = LocalDateTime.of(2014, 3, 30, 12, 30, 23);
        System.out.println("Custom : " + ldts);

        int tanggal = dateTime.getDayOfMonth();
        System.out.println("Bulan : " + tanggal);

        DayOfWeek hari = dateTime.getDayOfWeek();
        System.out.println("Hari : " + hari);

        int tanggal2 = dateTime.getDayOfYear();
        System.out.println("Tanggal : " + tanggal2);

        int jam = dateTime.getHour();
        System.out.println("Jam : " + jam);

        int bulan = dateTime.getMonthValue();
        System.out.println("Bulan : " + bulan);

        Month month = dateTime.getMonth();
        System.out.println("Month : " + month);

        //creates a new date time copy after subtracting 10 days from the date time.
        LocalDateTime ldtmd = dateTime.minusDays(10);
        System.out.println("date time after subtracting days is : " + ldtmd.toString());
        //creates a new date time copy after subtracting 10 hours from the date time.
        LocalDateTime ldtmh = dateTime.minusHours(10);
        System.out.println("date time after subtracting hours is : " + ldtmh.toString());
        //creates a new date time copy after subtracting 21 minutes from the date time.
        LocalDateTime ldtmm = dateTime.minusMinutes(21);
        System.out.println("date time after subtracting minutes is : " + ldtmm.toString());
        //creates a new date time copy after subtracting 2 months from the date time.
        LocalDateTime ldtmmm = dateTime.minusMonths(2);
        System.out.println("date time after subtracting months is : " + ldtmmm.toString());
        //creates a new date time copy after subtracting 3 years from the date time.
        LocalDateTime ldtmy = dateTime.minusYears(3);
        System.out.println("date time after subtracting years is : " + ldtmy.toString());
        //creates a new date time copy after subtracting 32 weeks from the date time.
        LocalDateTime ldtmw = dateTime.minusWeeks(32);
        System.out.println("date time after subtracting weeks is : " + ldtmw.toString());
        //creates a new date time copy after subtracting 1200 seconds from the date time.
        LocalDateTime ldtms = dateTime.minusSeconds(1200);
        System.out.println("date time after subtracting secs is : " + ldtms.toString());
        //creates a new date time copy after subtracting 12000 nano seconds from the date time.
        LocalDateTime ldtmn = dateTime.minusNanos(12000);
        System.out.println("date time after subtracting nanos is : " + ldtmn.toString());

        LocalDateTime ldtmddm = dateTime.withDayOfMonth(10); // sets the day of the month to 10.
        System.out.println("date time after adding modifying day of the month is : " + ldtmddm.toString());
        LocalDateTime ldtmddy = dateTime.withDayOfYear(12);//sets the day of year to 12.
        System.out.println("date time after adding modifying day of the year is : " + ldtmddy.toString());
        LocalDateTime ldtmdh = dateTime.withHour(12);//sets the hour of the day to 12. The other date time fields are not modified.
        System.out.println("date time after adding modifying hour is : " + ldtmdh.toString());
        LocalDateTime ldtmdmm = dateTime.withMinute(12);//sets the minute of the hour to 12. The other date time fields are not modified.
        System.out.println("date time after adding modifying minutes is : " + ldtmdmm.toString());
        LocalDateTime ldtmdm = dateTime.withMonth(4);//sets the month to 4. The other date time fields are not modified.
        System.out.println("date time after adding modifying month is : " + ldtmdm.toString());
        LocalDateTime ldtmdy = dateTime.withYear(2011);//sets the year to 2012. The other date time fields are not modified.
        System.out.println("date time after adding modifying year  is : " + ldtmdy.toString());
        LocalDateTime ldtmds = dateTime.withSecond(12);//sets the seconds of the minute to 12. The other date time fields are not modified.
        System.out.println("date time after adding modifying seconds is : " + ldtmds.toString());
        LocalDateTime ldtmdn = dateTime.withNano(120000);//sets the nano seconds of seconds to 120000. The other date time fields are not modified.
        System.out.println("date time after adding modifying nanos is : " + ldtmdn.toString());

        LocalDate ld = dateTime.toLocalDate();//gets the date value(LocalDate) from the date time. A LocalDate with same year, month and day as this LocalDateTime object will be returned.
        System.out.println("The date field from the date time object is : " + ld.toString());
        LocalTime lt = dateTime.toLocalTime();// gets the time value(LocalTime) from the date time. returns a LocalTime with the same hour, minute, second and nanosecond as this date-time.
        System.out.println("The time field from the date time object is : " + lt.toString());

    }

}
