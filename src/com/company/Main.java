package com.company;

public class Main {

    public static void main(String[] args) {
	    String first_value;
	    final int NUM = 14;
	    String word = "Word";
	    first_value = NUM + " " + word;

        System.out.println("Первая переменная: " + first_value
                + " Вторая переменная: " + NUM
                + " Третья переменная: " + word);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное значение");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное значение");
        } else if (NUM == 0) {
            System.out.println("Вы сохранили ноль");
        } else {
            System.out.println("Нет никаких значений");
        }
    }
}
