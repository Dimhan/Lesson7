package com.epamjavaweb.task10class.task1005;

public class MainCounter {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.printCounter();
        c1.rangeCount(10, 500);
        c1.setCount(77777777);
        c1.printCounter();
        c1.incCount();
        c1.printCounter();
        c1.decCount();
        c1.printCounter();

    }
}
