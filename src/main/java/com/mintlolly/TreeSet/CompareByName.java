package com.mintlolly.TreeSet;

import java.util.Comparator;

/**
 * Create by jag on 2018/1/11
 */
public class CompareByName implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        int temp = o1.getName().compareTo(o2.getName());
//        return temp ==0 ? o1.getAge()-o2.getAge():temp;
        return temp;
    }
}
