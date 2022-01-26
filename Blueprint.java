package com.company;

public class Blueprint {
    public static void main(String[] args) {
        Person p1 = new Person() ;
            p1.name="raju";
            p1.age=23;
            Person p2=new Person();
            p2.name="tapkir";
            p2.age=34;
       // System.out.println(p1.name+" "+p1.age);
       // System.out.println(p2.name+" "+p2.age);
        p1.walk(2);
        p1.walk();
        //p2.eat();
        }
    }

class Person {
    String name;
    int age;

    void walk(){
        System.out.println(name+" "+"can walk");
    }
    void eat(){
        System.out.println(name+" "+"can eat");
    }
    void walk(int steps){
        System.out.println(name+" "+"walked"+" "+steps+"steps");
    }
}
