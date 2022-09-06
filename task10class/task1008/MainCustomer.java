package com.epamjavaweb.task10class.task1008;

import com.epamjavaweb.task10class.task1004.Train;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class MainCustomer {
    public static void main(String[] args) {
        Customer[] customers = new Customer[5];
        String[] nameCus = {"Петров", "Сидоров", "Иванов", "Первый", "Второй"};
        Random r = new Random();
        String s;

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Customer();
            customers[i].setId(i + 1);
            customers[i].setSecondName(nameCus[i]);
            s = Integer.toString(r.nextInt(700000000, Integer.MAX_VALUE));
            customers[i].setNumCard(s);
        }

        Arrays.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getSecondName().compareTo(o2.getSecondName());
            }
        });
        System.out.println("List of customers in alphabetical order");
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

}
