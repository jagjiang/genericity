package com.mintlolly.clutter;

/**
 * Create by jag on 2018/1/5
 */
public class Box1Test {
    public static void main(String[] args){
        Box1<Integer> integerBox1 = new Box1<Integer>();
        Box1<String> stringBox1 = new Box1<String>();
        Box1<Double> doubleBox1 = new Box1<Double>();
        integerBox1.set(2);
        System.out.println(integerBox1.get());
        stringBox1.set("字符串");
        System.out.println(stringBox1.get());
    }
}
