package com.company;

public class student {
    private  int age;
    private  String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public student(String name,int age){
        this.age=age;
        this.name=name;
    }
}
