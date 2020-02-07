package com.algorithm.paixu;

import java.util.Arrays;

public class JiShu {

    /**
     * 计数排序
     */
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 8, 1, 11, 8};
        int[] results = CountingSort(arr);
        for (int item : results) {
            System.out.print(item + "   ");
        }
    }

    public static int[] CountingSort(int[] array) {
        if (array.length == 0) return array;
        int bias, min = array[0], max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        bias = 0 - min;
        int[] bucket = new int[max - min + 1];
        Arrays.fill(bucket, 0);
        for (int i = 0; i < array.length; i++) {
            bucket[array[i] + bias]++;
        }
        int index = 0, i = 0;
        while (index < array.length) {
            if (bucket[i] != 0) {
                array[index] = i - bias;
                bucket[i]--;
                index++;
            } else
                i++;
        }
        return array;
    }
}
