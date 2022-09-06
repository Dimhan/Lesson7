package com.epamjavaweb.task10class.task1004;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MainTr {
    public static void main(String[] args) {
        Train[] trains = new Train[5];

        trains[0] = new Train("Moscow", 2525, 1001);
        trains[1] = new Train("Moscow", 1010, 2005);
        trains[2] = new Train("Gomel", 5151, 1900);
        trains[3] = new Train("Brest", 8181, 900);
        trains[4] = new Train("Madrid", 1515, 100);

        System.out.println("Enter the train number ");

        Scanner numTrain = new Scanner(System.in);
        int trNumber = numTrain.nextInt();
        boolean noTrain = false;

        for (int i = 0; i < trains.length; i++) {
            if (trNumber == trains[i].getNumTrain()) {
                trains[i].printTr(trNumber);
            }
        }
        if (!noTrain) {
            System.out.println("The train not found");
        }
        Arrays.sort(trains);
        System.out.println("Sorting by destination");
        for (int j = 0; j < trains.length; j++) {
            trains[j].printTr(trains[j].getNumTrain());
        }
        Arrays.sort(trains, new Comparator<Train>() {
            @Override
            public int compare(Train o1, Train o2) {
                return o1.getNumTrain().compareTo(o2.getNumTrain());
            }
        });
        System.out.println("Sorting by train number");
        for (int jj = 0; jj < trains.length; jj++) {
            trains[jj].printTr(trains[jj].getNumTrain());
        }
    }
}
