package com.example.task11;

import java.lang.reflect.Array;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) return;

        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) min = n;
        }
        int indexMin = 0;
        for (int i = arr.length - 1; i > 0; i--) {
            int value = Array.getInt(arr, i);
            if (value == min) indexMin = i;
        }
        int firstEl = arr[0];
        arr[0] = min;
        arr[indexMin] = firstEl;
    }

}