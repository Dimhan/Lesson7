package com.epamjavaweb.task10class.task1003;
/*
Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость
(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода
фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.
 */


public class Students {
    private String studentName;
    private String studentGroup;
    private int[] stProgressArr = new int[5];

    public int[] getStProgressArr() {
        return stProgressArr;
    }

    public void setStProgressArr(int[] stProgressArr) {
        this.stProgressArr = stProgressArr;
    }

    public void setStProgressArr(int stProgressInd, int progress) {
        this.stProgressArr[stProgressInd] = progress;
    }

    public String getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(String studentGroup) {
        this.studentGroup = studentGroup;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void printStRating(Students stud) {
        int i = 0;
        while (i != 5 && stud.stProgressArr[i] >= 9) {
            i++;
        }
        if (i == 5) {
            System.out.printf("Students name: %s; Group number: %s\n", stud.studentName, stud.studentGroup);
        }
    }
}
