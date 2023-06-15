package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class filter {
    public static <Sring> void filtering(ArrayList<Object> menu){
        String line="";
        Scanner sc=new Scanner(System.in);
        String filePath="/Users/balvindersingh/Documents/Intellij/Java/sharda_Swiggy/Res_ID.csv";
        ArrayList<String> restaurant = new ArrayList<String>();
        ArrayList<String> sub_Menu = new ArrayList<String>();
        try {

            BufferedReader reader=new BufferedReader(new FileReader(filePath));
            while((line =reader.readLine())!= null){
                String[] row=line.split(",");
                for (String i: row){
                    System.out.printf("%-30s",i);
                    restaurant.add(i);
                }
                System.out.println();
            }
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Enter Your Preferred Restaurant Id-");
        String res=sc.next();
        int res_index=restaurant.indexOf(res);
        res_index=res_index+1;
        String res_Choice=restaurant.get(res_index);
        int k=0;
        for (int i=0;i<menu.size();i++ ){
            if(res_Choice.equalsIgnoreCase((String) menu.get(i))){
                k=i-3;
                for (int j = k; j<=i; j++){
                    String inf= (String) menu.get(j);
                    sub_Menu.add(inf);
                }
            }
        }
        int flag=0;
        for (int i=0;i<sub_Menu.size();i++){
            System.out.printf("%-30s",sub_Menu.get(i));
            flag=flag+1;
            if (flag%4==0){
                System.out.println();
            }
        }
    }
}
