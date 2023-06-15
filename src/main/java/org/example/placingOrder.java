package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class placingOrder {
    public static ArrayList<Object> Quant(ArrayList<Object> order){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Quantity Needed-");
        int q=sc.nextInt();
        order.add(q);
        String n= (String) order.get(2);
        int p= Integer.parseInt(n);
        int total=p*q;
        order.add(total);
        return order;
    }
}
