package com.hydrocarbon.thealgorithm.sort;

import java.util.Scanner;

/**
 * @author HydroCarbon
 * @date 2020/9/13
 * 选择排序
 * 核心思想就是每轮将可排序的数据中最小者选择出来，
 * 将其交换至对应的位置，比如
 * 第一轮下来，最小值就在第一个，第二轮下来，前两个值已经是有序。
 * 如此往复 N 轮，整个数据都是有序的。
 */
public class Selection {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        sort(input);
        assert SortUtil.isSorted(input);
        SortUtil.show(input);
    }

    /**
     * 对数组 a 进行排序操作。
     * 使用选择排序的方法，对输入的数组 a 进行排序。
     *
     * @param a 需要进行排序的输入的数组
     */
    @SuppressWarnings("all")
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (SortUtil.less(a[j], a[min]))
                    min = j;
                SortUtil.exCh(a, i, min);
            }
        }
    }
}
