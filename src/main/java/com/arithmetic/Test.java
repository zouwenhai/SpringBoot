package com.arithmetic;

public class Test {


    /**
     * 选择排序法
     */
    @org.junit.Test
    public void test1() {

        int[] array = new int[]{1,3,2};
/*
        funSelectionSort(array);
*/

        funMergeSort(array);

    }


    /**
     * 选择排序法
     *
     * @param array
     */
    static void funSelectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int mink = i;

            // 每次从未排序数组中找到最小值的坐标
            for (int j = i + 1; j < array.length; j++) {

                if (array[j] < array[mink]) {
                    mink = j;
                }
            }

            // 将最小值放在最前面
            if (mink != i) {
                int temp = array[mink];
                array[mink] = array[i];
                array[i] = temp;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }


    /**
     * arraycopy的用法
     * 　Object src : 原数组
     * int srcPos : 从元数据的起始位置开始
     * 　　Object dest : 目标数组
     * 　　int destPos : 目标数组的开始起始位置
     * 　　int length  : 要copy的数组的长度
     *
     * @param array
     */
    //归并排序时间复杂度nlogn
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


    public static void mergeSort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }


    public static void sort(int[] arr, int L, int R) {
        if (L == R) {
            return;
        }
        int mid = L + ((R - L) >> 1);
        sort(arr, L, mid);
        sort(arr, mid + 1, R);
        merge(arr, L, mid, R);
    }

    public static void merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while (p1 <= mid && p2 <= R) {
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for (i = 0; i < temp.length; i++) {
            arr[L + i] = temp[i];
        }
    }


    @org.junit.Test
    public void test2() {

        int[] array = new int[]{1, 3, 4, 4, 5, 7, 8};
        int data = 3;
        System.out.println(funBinSearch(array, data));

    }


    /**
     * 二分查找
     * 给定有序查找表array 二分查找给定的值data
     * 查找成功返回下标 查找失败返回-1
     *
     * @param array
     * @param data
     * @return
     */
    static int funBinSearch(int[] array, int data) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (data == array[mid]) {
                return mid;
            } else if (data < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }


    public void test3() {


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
