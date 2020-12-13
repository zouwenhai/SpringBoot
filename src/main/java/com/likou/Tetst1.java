package com.likou;


import org.junit.Test;

import java.util.Queue;

/**
 * @ClassName Tetst1
 * @Description 寻找两个正序数组的中位数
 * @Author zouwenhai
 * @Date 2020/6/3 22:59
 * @Version 1.0
 */
public class Tetst1 {


    /***
     * 归并排序
     */

    @Test
    public void test() {

        int[] array = new int[]{1, 9, 3};
        funMergeSort(array);


    }


    //归并排序
    static void funMergeSort(int[] array) {

        if (array.length > 1) {

            int length1 = array.length / 2;
            int[] array1 = new int[length1];
            System.arraycopy(array, 0, array1, 0, length1);
            funMergeSort(array1);
            int length2 = array.length - length1;
            int[] array2 = new int[length2];
            System.arraycopy(array, length1, array2, 0, length2);
            funMergeSort(array2);
            int[] datas = merge(array1, array2);
            System.arraycopy(datas, 0, array, 0, array.length);


        }

    }

    //合并两个数组
    static int[] merge(int[] list1, int[] list2) {

        int[] list3 = new int[list1.length + list2.length];

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while (count1 < list1.length && count2 < list2.length) {

            if (list1[count1] < list2[count2]) {
                list3[count3++] = list1[count1++];
            } else {
                list3[count3++] = list2[count2++];
            }
        }

        while (count1 < list1.length) {
            list3[count3++] = list1[count1++];
        }

        while (count2 < list2.length) {
            list3[count3++] = list2[count2++];
        }

        return list3;
    }





    // 快速排序
    static void funQuickSort(int[] mdata, int start, int end) {
        if (end > start) {
            int pivotIndex = quickSortPartition(mdata, start, end);
            funQuickSort(mdata, start, pivotIndex - 1);
            funQuickSort(mdata, pivotIndex + 1, end);
        }
    }

    // 快速排序前的划分
    static int quickSortPartition(int[] list, int first, int last) {

        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {

            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list[high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return first;
        }

    }




}
