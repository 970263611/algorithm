package com.algorithm.chaozhao;

public class ErFen {

    /**
     * 二分查找
     */
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 1, 8, 1, 11, 8};
        int results1 = BinarySearch1(arr, 8, arr.length - 1);
        int results2 = BinarySearch2(arr, 11, 0, arr.length - 1);
        System.out.print(results1 + "   ");
        System.out.print(results2 + "   ");
    }

    //二分查找，非递归版本
    public static int BinarySearch1(int a[], int value, int n) {
        int low, high, mid;
        low = 0;
        high = n - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == value)
                return mid;
            if (a[mid] > value)
                high = mid - 1;
            if (a[mid] < value)
                low = mid + 1;
        }
        return -1;
    }

    //二分查找，递归版本
    public static int BinarySearch2(int a[], int value, int low, int high) {
        int mid = low + (high - low) / 2;
        if (a[mid] == value)
            return mid;
        if (a[mid] > value)
            return BinarySearch2(a, value, low, mid - 1);
        if (a[mid] < value)
            return BinarySearch2(a, value, mid + 1, high);
        return -1;
    }
}
