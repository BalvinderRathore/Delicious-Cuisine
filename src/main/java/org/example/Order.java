package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public static ArrayList<Object> clientOrder(ArrayList<Object> order, ArrayList<Object> dish){
        System.out.println("Enter the Id of Dish You Would Like to have-");
        Scanner sc=new Scanner(System.in);
        int dChoice=sc.nextInt();
        dChoice=dChoice*4;
        int j=0;
        for (int i=dChoice;i<dChoice+4;i++){
            order.add(dish.get(i));
            j=j+1;
        }
        return order;
    }
}
