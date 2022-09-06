package com.epamjavaweb.task10class.task1006;
/*
Составьте описание класса для представления времени. Предусмотрите возможности установки времени и изменения его
отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае недопустимых значений
полей поле устанавливается в значение 0. Создать методы изменения времени на заданное количество часов, минут и секунд.
 */

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeSet {
    private int hour;
    private int minute;
    private int second;
    public final int MAX_TIME = 59;
    public final int MAX_HOUR = 23;

    public TimeSet() {
        this.hour = 1;
        this.minute = 1;
        this.second = 1;
    }

    public void setHour(int hour) {
        if (hour <= MAX_HOUR) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute <= MAX_TIME) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second <= MAX_TIME) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public int getSecond() {
        return second;
    }

    public void chageHour(int h) {
        LocalTime lt1 = LocalTime.of(hour, minute, second);
        ;
        if (h <= 0) {
            lt1 = lt1.minusHours(Math.abs(h));
        } else {
            lt1 = lt1.plusHours(h);
        }
        hour = lt1.getHour();
    }

    public void chageMinute(int m) {
        LocalTime lt1 = LocalTime.of(hour, minute, second);
        ;
        if (m <= 0) {
            lt1 = lt1.minusMinutes(Math.abs(m));
        } else {
            lt1 = lt1.plusMinutes(m);
        }
        hour = lt1.getHour();
        minute = lt1.getMinute();
    }

    public void chageSec(int sec) {
        LocalTime lt1 = LocalTime.of(hour, minute, second);
        ;
        if (sec <= 0) {
            lt1 = lt1.minusSeconds(Math.abs(sec));
        } else {
            lt1 = lt1.plusSeconds(sec);
        }
        hour = lt1.getHour();
        minute = lt1.getMinute();
        second = lt1.getSecond();
    }

    public void printTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH-mm-ss");
        String textSet = dtf.format(LocalTime.of(hour, minute, second));
        System.out.println(textSet);
        String textNow = dtf.format(LocalTime.now());
        System.out.println(textNow);
    }
}
