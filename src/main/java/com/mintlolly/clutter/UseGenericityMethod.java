package com.mintlolly.clutter;

/**
 * Create by jag on 2018/1/5
 */
public class UseGenericityMethod {
    public static void main(String[] args){
        Pair<String,String> p1 = new Pair<String, String>();
        Pair<String,String> p2 = new Pair<String, String>("name","wang");
        p1.setKey("name");
        p1.setValue("wang");
        boolean same =GenericityMethod.compare(p1,p2);
        System.out.println(same);

        InterImpl inter = new InterImpl();
        inter.show("aaaa");
        InterImpl2<Integer> interImpl2 = new InterImpl2<Integer>();
        interImpl2.show(47);
    }
}
