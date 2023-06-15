package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Dishes {
    public static ArrayList<Object> info(String filePath) {
        String line="";
        ArrayList<Object> Dishes = new ArrayList<Object>();
        try {
            BufferedReader reader=new BufferedReader(new FileReader(filePath));
            while((line =reader.readLine())!= null){
                String[] row=line.split(",");
                for (String i: row){
                    System.out.printf("%-30s",i);
                    Dishes.add(i);
                }
                System.out.println();
            }
        }

        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Dishes;
    }
}
