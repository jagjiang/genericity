package com.mintlolly.TreeSet;

import java.util.Comparator;

/**
 * Create by jag on 2018/1/11
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    Person(){

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Person o) {
        int temp = this.age - o.age;
        return temp == 0 ? this.name.compareTo(o.name) : temp;
    }
}
