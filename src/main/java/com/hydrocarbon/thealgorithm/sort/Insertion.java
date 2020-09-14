package com.hydrocarbon.thealgorithm.sort;

import java.util.Scanner;

/**
 * @author HydroCarbon
 * @date 2020/9/14
 * 插入排序
 * 插入排序在整个循环过程中，左侧的项始终是有序的，
 * 如果后续循环到的项的顺序是在左侧中的，那么需要插入左侧元素中
 * 所以叫做循环排序。这和抽取卡牌的时候插入已有的牌中使其有序很像。
 * 插入排序对越有序的数据进行排序效率越高。
 * 但是对无序甚至逆序的数据进行排序时，效率则会很低。
 */
public class Insertion {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        sort(input);
        assert SortUtil.isSorted(input);
        SortUtil.show(input);
    }

    /**
     * 对数组 a 进行插入排序。
     *
     * @param a 输入的数组
     */
    @SuppressWarnings("all")
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++)
            /*
            将遍历到的值从当前一项向前顺序比较，如果需要交换则将其进行交换。
            直到交换至有序的位置。
            保证已经遍历的前 i 项数据是有序的。
             */
            for (int j = i; j > 0 && SortUtil.less(a[j], a[j - 1]); j--)
                SortUtil.exCh(a, j, j - 1);
    }
}
