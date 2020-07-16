package main.Tests;

import java.util.Map;
import java.util.TreeMap;

public class Tmap1 {
    public static void main(String args[])
    {
        TreeMap<Integer,String > T1 = new TreeMap<Integer, String>();
        T1.put(104,"one");
        T1.put(101,"Two");
        T1.put(102,"Three");
        T1.put(100,"Alpha");
        for(Map.Entry E1:T1.entrySet())
        {
            System.out.println(E1.getKey()+""+E1.getValue());
        }

    }
}
