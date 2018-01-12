package com.mintlolly.clutter;

/**
 * Create by jag on 2018/1/12
 */
public interface Inter<T> {
    public void show(T t);
}

class InterImpl implements Inter<String>{

    public void show(String string) {
        System.out.println("show  " + string);
    }
}

class InterImpl2<T> implements Inter<T>{
    public void show(T t){
        System.out.println("show  " + t.toString());
    }
}