package com.yt.intro;

import java.util.Arrays;

public class MySort {
    public static void main(String[] args) {
        int [] arr = {28, 12, 89, 73, 65, 18, 96, 50, 8, 36};
        System.out.println("原数组顺序为: " + Arrays.toString(arr));
//        System.out.println("冒泡排序结果(从小到大): " + Arrays.toString(bubbleSort(arr)));
//        System.out.println("冒泡排序结果(从小到大)-优化版: " + Arrays.toString(bubbleSortPlus(arr)));
        System.out.println("插入排序: " + Arrays.toString(InsertSort(arr)));
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
        int j;
        int temp;
        for(int i = 1;i < n;i++) {
            if(arr[i-1] > arr[i]) {
                // 把arr[i]暂时存储下来
                temp = arr[i];
                for(j = i-1;j >= 0;j--){
                    if(temp < arr[j]) {
                        // 交换
                        arr[j+1] = arr[j];
                    }else {
                        // 一个容易犯的小错误，这里如果不在if中写上&&temp < arr[j]，那些这里就要加上else和break
                        break;
                    }
                }
                arr[j+1] = temp;
                // 循环结束，另j处空出的位置为temp
                System.out.printf("第%d次插入排序", i);
                System.out.println(Arrays.toString(arr));
            }
        }
        return arr;
    }
    /* 二分排序 */
    private static int[] BiSort(int [] arr) {
        // 二分排序的核心思想：二分法插入排序是在插入第i个元素时，对前面的0～i-1元素进行折半，先跟他们中间的那个元素比，
        // 如果小，则对前半再进行折半，否则对后半进行折半，直到left>right，然后再把第i个元素前1位与目标位置之间的所有元素后移，
        // 再把第i个元素放在目标位置上。二分排序中，关键字的比较次数采用折半查找，数量级为O(nlogn)，
        // 但是元素移动次数为O(n^2)，因此时间复杂度为O(n^2)。
        int n = arr.length;
        int left, right, mid, temp;
        for(int i = 1;i < n;i++) {
            left = 0;   // 初始化指向左边第一个元素
            right = n-1;
            temp = arr[i];  // 记录要排序的元素
            while(left <= right) {
                mid = (left + right) / 2;
                if(arr[mid] > temp) {   // 如果中间元素大于temp，则temp应该被放在mid的左侧，所以另右指针减小
                    right = mid + 1;
                }


            }
        }
        return arr;
    }
}
