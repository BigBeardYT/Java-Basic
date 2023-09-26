package com.yt.intro;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int [] arr = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println("原数组顺序为: " + Arrays.toString(arr));
        System.out.println("冒泡排序结果(从小到大): " + Arrays.toString(bubbleSort(arr)));
        System.out.println("冒泡排序结果(从小到大)-优化版: " + Arrays.toString(bubbleSortPlus(arr)));
    }
    /* 冒泡排序 */
    private static int [] bubbleSort(int [] arr) {
        // [ 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 ]
        // 冒泡排序的核心思想是从第一个到最后一个元素，不断将较大（或较小）者移动到后面，类似于鱼在水里吐泡泡的过程
        // 并且每一次排序完都有个元素被排好了位置
        int n = arr.length;
        for(int i = 0;i < n;i++) {
            for(int j = 1;j < n - i;j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.printf("第%d次冒泡排序", i+1);
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
    /* 冒泡排序的优化版 */
    private static int [] bubbleSortPlus(int [] arr) {
        int n = arr.length;
        // 从上面我们可以看到，如果在第二轮循环中没有发生位置交换，即if操作，说明数组已经有序，可以直接终止循环返回答案
        // 因此我们只需要在内层循环之前加上一个标志数表示是否发生交换即可
        for(int i = 0;i < n;i++){
            int flag = 0;
            for(int j = 0;j < n-i-1;j++){
                if(arr[j] > arr[j+1]) {
                    flag = -1;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                System.out.printf("第%d次冒泡排序-优化版", i+1);
                System.out.println(Arrays.toString(arr));
                if(flag != -1){
                    break;
                }

            }
        }
        return arr;
    }
    /* 插入排序（直接插入排序） */
    private static int[] InsertSort(int [] arr) {
        int n = arr.length;
        // 核心思想：定义前后两段数组，前一段时已经排序好的，后一段是待排序的
        int start = arr[0];
        for(int i = 1;i < n;i++) {
            if(start > arr[i]) {

            }

        }
        return arr;
    }
    /* 二分排序 */
    private static int[] BiSort(int [] arr) {
        // 二分排序的核心思想：定义左右两个指针，初始时指向第一个和最后一个元素，然后定义一个mid指针，指向low和high的中间位置
        // 然后判断arr[mid]和左右两边指针的大小，
        int n = arr.length;
        int low = 0, high = n-1;

        while(low < high) {
            int mid = (low + high) / 2;

        }

        return arr;
    }
}
