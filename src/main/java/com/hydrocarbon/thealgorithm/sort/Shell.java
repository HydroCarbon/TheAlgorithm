package com.hydrocarbon.thealgorithm.sort;

import java.util.Scanner;

/**
 * @author HydroCarbon
 * @date 2020/9/14
 * 希尔排序
 */
public class Shell {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        sort(input);
        assert SortUtil.isSorted(input);
        SortUtil.show(input);
    }

    @SuppressWarnings("all")
    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && SortUtil.less(a[j], a[j - h]); j -= h)
                    SortUtil.exCh(a, j, j - h);
            }
            h /= 3;
        }
    }
}
