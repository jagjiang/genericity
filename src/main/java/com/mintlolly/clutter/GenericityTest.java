package com.mintlolly.clutter;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by jag on 2018/1/11
 */
public class GenericityTest {
    static class Species{}
    static class Human extends Species{}
    static class Man extends Human{}
    static class Women extends Human{}

    public static void main(String[] args){
        List<Human> list = new ArrayList<Human>();
        list.add(new Man());
        list.add(new Women());

        Man man = (Man) list.get(0);//这不能保证转型成功，也不是泛型的初衷

        List<? extends Human> list1 = new ArrayList<Human>();
//        list1.add(new Object()); //编译错误： 这不能写入元素，类型校验失败
//        list1.add(new Species()); //编译错误： 这不能写入元素，类型校验失败
//        list1.add(new Human()); //编译错误： 这不能写入元素，类型校验失败
//        list1.add(new Man()); //编译错误： 这不能写入元素，类型校验失败
//        list1.add(new Women()); //编译错误： 这不能写入元素，类型校验失败
//        Man man1 = list1.get(0);//这不能保证转型成功，也不是泛型的初衷
        Human man2 = list1.get(0);

        List<? super Human> list2 = new ArrayList<Human>();
//        list2.add(new Object());// 编译错误：这不能写入元素，类型校验失败
//        list2.add(new Species());// 编译错误：这不能写入元素，类型校验失败
        list2.add(new Human());
        list2.add(new Man());
    }
}
