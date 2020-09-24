package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class zidingyi {
    public static void main(String[] args) {
        ArrayList<student>a=new ArrayList<>();
        int i;
        student []x=new student[4];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<4;i++)
        {
            x[i]=new student(sc.next(),sc.nextInt());
            a.add(x[i]);
        }
        for(i=0;i<4;i++)
        {
            student s=a.get(i);
            System.out.println(s.getName()+"----"+s.getAge());
        }
    }
}
