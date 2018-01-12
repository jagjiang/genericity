package com.mintlolly.clutter;

/**
 * Create by jag on 2018/1/5
 */
public class GenericityMethod {
    /*
        静态方法不能访问类上定义的泛型
        如果静态方法使用泛型 则定义在方法上
     */
    public static <T> void show(T t){
        System.out.println("show" + t.toString());
    }

    public static <K,V> boolean compare(Pair<K,V> p1,Pair<K,V> p2){
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
class Pair<K,V>{
    private K key;
    private V value;

    public Pair(){

    }

    public Pair(K key,V value){
        this.key = key;
        this.value =value;
    }

    public void setKey(K key){
        this.key = key;
    }
    public void setValue(V value){
        this.value = value;
    }

    public K getKey(){
        return key;
    }
    public V getValue(){
        return value;
    }
}
