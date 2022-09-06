package com.epamjavaweb.task10class.task1008;
/*
Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */

import com.epamjavaweb.task10class.task1004.Train;

public class Customer {
    private int id;
    private String secondName;
    private String name;
    private String address;
    private String numCard;
    private String numAccount;


    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "id " + id + "  Second name " + secondName;
    }
}
