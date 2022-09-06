package com.epamjavaweb.task10class.task1005;
/*
Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу
в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
Написать код, демонстрирующий все возможности класса.
 */

public class Counter {
    private int count;
    private int minCount;
    private int maxCount;

    public Counter() {
        this.count = 1;
    }

    public void rangeCount(int minCount, int maxCount) {

        if (minCount >= 0 & minCount < Integer.MAX_VALUE) {
            this.minCount = minCount;
        } else {
            System.out.println("Incorrect value of the lower border!");
        }
        if (maxCount > 0 & maxCount > minCount & maxCount <= Integer.MAX_VALUE) {
            this.maxCount = maxCount;
        } else {
            System.out.println("Incorrect value of the upper boundary!");
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 0 & count < Integer.MAX_VALUE) {
            this.count = count;
        } else {
            this.count = 1;
        }
    }

    public int incCount() {
        if (count >= maxCount) {
            System.out.println("Stop count");
            return count;
        } else {
            return count++;
        }
    }

    public int decCount() {
        if (count <= minCount | count > maxCount) {
            System.out.println("Stop count");
            return count;
        } else {
            return this.count--;
        }
    }

    public void printCounter() {
        System.out.println(count);
    }
}
