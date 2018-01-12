package com.mintlolly.TreeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Create by jag on 2018/1/12
 */
public class GenericUpperLimit {
    public static void main(String[] args){
        ArrayList<String> arrayListString = new ArrayList<String>();
        arrayListString.add("hello");
        arrayListString.add("world");
        ArrayList<Women> womenArrayList = new ArrayList<Women>();
        womenArrayList.add(new Women("王红",22));
        womenArrayList.add(new Women("王清",25));
        TreeSet<Men> menTreeSet = new TreeSet<Men>(new CompareByName());
        menTreeSet.add(new Men("王亮",34));
        menTreeSet.add(new Men("王小明",32));
//        printCollection(arrayListString);
        printCollection(womenArrayList);
        printCollection(menTreeSet);
    }
    public static void printCollection(Collection<? extends Person> people){
        Iterator<? extends Person> iterator = people.iterator();
        while (iterator.hasNext()){
            Person p = iterator.next();
            System.out.print(p);
            System.out.println(p.getName());
        }
    }
}
