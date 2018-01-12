package com.mintlolly.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Create by jag on 2018/1/11
 */
public class TreeSetTest {

    public static void main(String[] args){
//        TreeSet<Person> treeSet = new TreeSet<Person>();
        TreeSet<Person> treeSet = new TreeSet<Person>(new CompareByName());
        treeSet.add(new Person("wangliang",21));
        treeSet.add(new Person("wanghong",22));
        treeSet.add(new Person("wangqing",23));

        Iterator<Person> it = treeSet.iterator();

        while (it.hasNext()){
            Person p = it.next();
            System.out.println(p);
        }
    }


}
