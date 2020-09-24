package com.company;

import java.util.ArrayList;
/*
*  学习arraylist的相关操作，添加元素 add
*  删除元素
* */
public class arraylist {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<String>();
        a.add("hello");
        a.add("workd");
        a.add(1,"dada");
        System.out.println(a);
        //获取元素
        System.out.println(a.get(1));
        //集合长度
        System.out.println(a.size());
        //删除元素
        /* System.out.println(a.remove("hello"));*/
        System.out.println(a.remove("dada"));
        System.out.println(a);
        //修改元素    a.set返回的是被修改的元素并且原来的list已经遭到了修改
        System.out.println(a.set(1,"jjl"));
        System.out.println(a);
        System.out.println("下面是遍历");
        //遍历元素
        for(int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+"  ");

        }

    }
}
