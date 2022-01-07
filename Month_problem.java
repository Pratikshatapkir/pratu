package com.company;
import java.util.*;
public class Month_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        //int b=sc.nextInt();
       // int c=sc.nextInt();
        switch(month){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            default:
                System.out.println("invalid month");
        }

    }
}
