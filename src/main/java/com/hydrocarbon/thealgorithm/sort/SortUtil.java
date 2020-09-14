package com.hydrocarbon.thealgorithm.sort;

import java.util.Scanner;

/**
 * @author HydroCarbon
 * @date 2020/9/13
 * 排序的通用工具类，定义了一些需要使用的通用的排序中需要的方法
 */
@SuppressWarnings("all")
public class SortUtil {

    /**
     * 对传入的两个参数进行比较，如果 v < w，返回 true，否则返回 false
     *
     * @param v 需要比较的第一个值
     * @param w 需要比较的第二个值
     * @return 比较的结果，v < w 为 true，否则为 false
     */
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * 交换传入的两个索引所在的值
     *
     * @param a 元素的数组
     * @param i 需要交换的第一个值的索引
     * @param j 需要交换的第二个值的索引
     */
    public static void exCh(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * 输出数组
     *
     * @param a 需要输出的数组
     */
    public static void show(Comparable[] a) {
        for (Comparable i : a)
            System.out.print(i + " ");
        System.out.println();
    }

    /**
     * 判断数组是否是有序的（升序）
     *
     * @param a 需要判断的数组
     * @return 数组有序返回 true，否则返回 false
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1]))
                return false;
        return true;
    }
}
