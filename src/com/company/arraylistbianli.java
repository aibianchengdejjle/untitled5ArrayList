package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylistbianli {
    public static void main(String[] args) {
        ArrayList<String>a=new ArrayList<>();
        /*Scanner sc=new Scanner(System.in);
        a.add(sc.next());
       */
       a.add("张a");
       a.add("ba");
       a.add("ca");
       for(int i=0;i<a.size();i++)
       {
           String  s= a.get(i);
           if(s.startsWith("a",0))
           System.out.println(s);
       }

    }
}
