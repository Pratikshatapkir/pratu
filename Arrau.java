package com.company;
import java.util.Scanner;
public class Arrau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String name[]=new String[size];
        for(int i=0;i<size;i++){
            name[i]=sc.next();
        }
        for(int i=0;i<name.length;i++){
            System.out.println("names"+(i+1)+"is"+name[i]);
        }
    }
}


