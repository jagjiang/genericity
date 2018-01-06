package com.mintlolly;

/**
 * Create by jag on 2018/1/5
 */
/*
    坏处 Box里面只能装入String类型
 */
public class Box {
    private String object;

    public void set(String object){
        this.object = object;
    }
    public String get(){
        return object;
    }
}
