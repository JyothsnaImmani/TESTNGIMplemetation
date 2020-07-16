package main.Tests;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;

public class Hmap {

    public static void main(String args[])
    {
        HashMap<String,Integer> Name = new HashMap<String, Integer>();
        Name.put("Arna",6);
        Name.put("Jyo",29);
        Name.put("Saila",30);
        Name.put("Saha",8);
        Name.put("Sans",7);
        Name.put("Saty",31);
        System.out.println("The elements are listed");
        for(Map.Entry M:Name.entrySet())
        {
            System.out.println(M.getValue()+" "+M.getKey());


        }
    }
}
