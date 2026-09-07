package com.example.task12;

import java.lang.reflect.Array;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));

    }

    static void selectionSort(int[] arr) {
        if (arr == null) return;
        for (int i = 0; i < arr.length; i++){
            int min = Integer.MAX_VALUE;
            int indexMin = 0;
            for (int n = i; n < arr.length; n++){
                if (arr[n] < min) min = Array.getInt(arr,n);
                if (min == arr[n]) indexMin = n;
            }
            int tempArri = arr[i];
            arr[i] = min;
            arr[indexMin] = tempArri;
        }
    }
}