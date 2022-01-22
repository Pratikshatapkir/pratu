package com.company;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}


public class OopsInJava {
    public static void main(String args[]){
        pen pen1=new pen();
        pen1.color="blue";
        pen1.type="gel";

        pen pen2=new pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printColor();
        pen2.printColor();
    }
}
