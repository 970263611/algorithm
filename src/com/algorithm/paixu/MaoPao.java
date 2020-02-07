package com.algorithm.paixu;


public class MaoPao {

    /**
     * 冒泡排序
     */
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 8, 1, 11, 8};
        int[] results = bubbleSort(arr);
        for (int item : results) {
            System.out.print(item + "   ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tem = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }
        return arr;
    }
}
