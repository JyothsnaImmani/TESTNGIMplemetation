package main.Tests;

import java.util.HashMap;
import java.util.Map;

public class InsertHashmapelements {
    public static void main(String args[])
    {
        HashMap<String,Integer> Object = new HashMap<String, Integer>();
        Object.put("Jyo",29);
        Object.put("Sat",30);
        Object.put("Gowtham",34);
        Object.put("Janaki",20);
        System.out.println("Before adding the elements");
        for(Map.Entry O:Object.entrySet())
        {
            System.out.println(O.getValue()+" "+O.getKey());
        }
        Object.putIfAbsent("Hans",35);

            System.out.println("elements are added");

        for(Map.Entry O:Object.entrySet())
        {
            System.out.println(O.getValue()+" "+O.getKey());
        }
        HashMap<String,Integer> Object2 = new HashMap<String, Integer>();
        Object2.put("Clippers",108);
        Object2.putAll(Object);
        System.out.println("Invoking all teh elements");
        for(Map.Entry O1:Object2.entrySet())
        {
            System.out.println(O1.getValue()+" "+O1.getKey());
        }
    }
}
