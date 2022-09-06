package com.epamjavaweb.task10class.task1003;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Students[] studentsList = new Students[10];
        Random pr = new Random();
        String[] nameSt = {"Петров", "Сидоров", "Иванов", "Первый", "Второй", "Третий", "Четвертый", "Пятый",
                "Шестой", "Седьмой"};

        for (int i = 0; i < studentsList.length; i++) {
            studentsList[i] = new Students();
            studentsList[i].setStudentName(nameSt[i]);
            studentsList[i].setStudentGroup("MD-JE1");
            for (int j = 0; j < studentsList[i].getStProgressArr().length; j++) {
                studentsList[i].setStProgressArr(j, pr.nextInt(9, 11));
            }

        }

        for (Students students : studentsList) {
            students.printStRating(students);
        }

    }
}
