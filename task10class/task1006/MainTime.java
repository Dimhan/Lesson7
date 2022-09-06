package com.epamjavaweb.task10class.task1006;

public class MainTime {
    public static void main(String[] args) {
        TimeSet tt = new TimeSet();
        tt.setHour(21);
        tt.setMinute(21);
        tt.setSecond(21);
        tt.printTime();
        tt.chageHour(5);
        tt.chageMinute(62);
        tt.chageSec(30);
        tt.printTime();
    }
}
