package com.epamjavaweb.task10class.task1004;
/*
Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления. Создайте данные в
массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов. Добавьте
возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив
по пункту назначения, причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */

import java.util.Arrays;

public class Train implements Comparable <Train> {
    private String dest;
    private Integer numTrain;
    private Integer timeTr;

    public Train(String dest, int numTrain, int timeTr) {
        this.dest = dest;
        this.numTrain = numTrain;
        this.timeTr = timeTr;
    }

    public Integer getNumTrain() {
        return numTrain;
    }

    public void printTr (int numTrain) {
        System.out.printf("Пункт назначения %s; Номер поезда %s; Время отправления %d : %d\n",
                dest, numTrain, timeTr/100, timeTr%100);
    }

    @Override
    public int compareTo (Train obj) {
        int res = this.dest.compareTo(obj.dest);
        if (res == 0) {
            res = this.timeTr.compareTo(obj.timeTr);
        }
        return res;
    }

}
