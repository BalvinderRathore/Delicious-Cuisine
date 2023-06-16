package org.example;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to Sharda Swiggy");
        System.out.println("What would you like to have");
        String Category[]={"1. VEG","2. NON-VEG","3. BREADS","4. APPETIZERS","5. DESERT","6. DRINKS"};
        for (int i=0;i< Category.length;i++){
            System.out.println(Category[i]);
        }
        System.out.println("Enter Your Choice:");
        Scanner sc=new Scanner(System.in);
        int c= sc.nextInt();
        System.out.println("Today's Special");
        ArrayList<Object> Userorder=new ArrayList<Object>();
        ArrayList<Object> Menu= new ArrayList<Object>();
        switch (c){
            case 1:
                Menu=Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/vegMenu.csv");
                System.out.println("Want To Filter out on the basis of Restaurants?");
                String y=sc.next();
                if(y.equalsIgnoreCase("y")){
                    filter.filtering(Menu);
                    Order.clientOrder(Userorder,Menu);
                    for (int i=0;i<Userorder.size();i++) {
                        System.out.println(Userorder.get(i));
                    }
                    break;
                }
                Order.clientOrder(Userorder,Menu);
                for (int i=0;i<Userorder.size();i++) {
                    System.out.println(Userorder.get(i));
                }
                break;
            case 2:
                Menu=Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/nonMenu.csv");
                Order.clientOrder(Userorder,Menu);
                for (int i=0;i<3;i++) {
                    System.out.println(Userorder.get(i));
                }
                break;
            case 3:
                Menu=Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/breadsMenu.csv");
                Order.clientOrder(Userorder,Menu);
                for (int i=0;i<3;i++) {
                    System.out.println(Userorder.get(i));
                }
                break;
            case 4:
                Menu=Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/snacksMenu.csv");
                Order.clientOrder(Userorder,Menu);
                for (int i=0;i<3;i++) {
                    System.out.println(Userorder.get(i));
                }
                break;
            case 5:
                Menu=Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/desertMenu.csv");
                Order.clientOrder(Userorder,Menu);
                for (int i=0;i<3;i++) {
                    System.out.println(Userorder.get(i));
                }
                break;
            case 6:
                Menu=Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/drinksMenu.csv");
                Order.clientOrder(Userorder,Menu);
                for (int i=0;i<3;i++) {
                    System.out.println(Userorder.get(i));
                }
                break;

        }

        /*System.out.println("Select your Dish:");
        String dish=sc.nextLine();
        if (dish.equalsIgnoreCase("Dal Makhni")){
            System.out.println("Here's the List of Some Famous Restaurants:");
            Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/rest_D.csv");
        }else if(dish.equalsIgnoreCase("Butter Chicken")){
            Dishes.info("/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/rest_C.csv");
        }
        System.out.println("Select the Restaurant");
        String res=sc.nextLine();*/


        placingOrder.Quant(Userorder);
        for (int i=0;i<Userorder.size();i++) {
            System.out.println(Userorder.get(i));
        }
        System.out.println("Enter the Payment Mode-");
        System.out.println("1. Google Pay\n2. Paytm\n3. PayPal");
        int way=sc.nextInt();
        System.out.println("Your Payment is being Processed");
        int i = 0;
        while(i < 21) {
            System.out.print("[");
            for (int j=0;j<i;j++) {
                System.out.print("#");
            }

            for (int j=0;j<20-i;j++) {
                System.out.print(" ");
            }

            System.out.print("] "+  i*5 + "%");
            if(i<20) {
                System.out.print("\r");
                Thread.sleep(300);
            }
            i++;
        }
        System.out.println();
        System.out.println("Your Order is being Placed");
        i = 0;
        while(i < 21) {
            System.out.print("[");
            for (int j=0;j<i;j++) {
                System.out.print("#");
            }

            for (int j=0;j<20-i;j++) {
                System.out.print(" ");
            }

            System.out.print("] "+  i*5 + "%");
            if(i<20) {
                System.out.print("\r");
                Thread.sleep(300);
            }
            i++;
        }
        System.out.println();
        System.out.println("Your order will be ready in 20 minutes");

    }

}