package com.example.project;
import java.util.Random;
import java.util.Scanner;
public class Day1{
    private static String[] elf_names = {"Glitter", "Chocolate","Tiny","Snowflake","Frosty"};

    public static String generateElfName(String name){
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Random rand = new Random();
        String elfName = elf_names[rand.nextInt(elf_names.length)];
        
        return elfName + " " + name;
    }

}