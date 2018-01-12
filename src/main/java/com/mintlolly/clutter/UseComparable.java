package com.mintlolly.clutter;

/**
 * Create by jag on 2018/1/5
 */

public class UseComparable {
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0)
                ++count;
        }
        return count;
    }
    public static void main(String[] args){

        int[] array = new int[]{1,2,3,4,5,6,7,8,9};
        int elem = 3;

    }
}


