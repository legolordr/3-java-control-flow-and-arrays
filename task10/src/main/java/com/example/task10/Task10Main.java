package com.example.task10;

import java.lang.reflect.Array;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        int[] arr = {7, 5, 9};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr){
            if (n < min) min = n;
        }

        for (int i = arr.length - 1; i > 0; i--){
            int value = Array.getInt(arr,i);
            if (value == min) return i;
        }
        return 0;
    }

}