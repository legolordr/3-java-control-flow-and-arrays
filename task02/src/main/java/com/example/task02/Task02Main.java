package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {

        switch (monthNumber) {
            case 1, 2, 12:
                return "зима";
            case 3, 4, 5:
                return "весна";
            case 6, 7, 8:
                return "лето";
            case 9, 10, 11:
                return "осень";
            default:
                return "";

        }
    }
}