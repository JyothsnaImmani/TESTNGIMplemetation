package main.Tests;

import java.util.HashMap;
import java.util.Map;

public class Rplacehashmaps {

    public static void main(String args[])
    {
    HashMap<Integer,String> Object = new HashMap<Integer, String>();
        Object.put(100,"Jyo");
        Object.put(102,"Sana");
        Object.put(103,"Gowtham");
        Object.put(104,"Janaki");
        System.out.println("Before adding the elements");

        for(Map.Entry E:Object.entrySet())
        {
            System.out.println(E.getKey()+" "+E.getValue());
        }
        Object.replace(102,"Sanskriti");
        System.out.println("Value 102 replaced with Sanskriti name :");

        for(Map.Entry E:Object.entrySet())
        {
            System.out.println(E.getKey()+" "+E.getValue());
        }
        System.out.println("New Updated list");
        Object.replace(100,"Jyo","Jyothsna");

        for(Map.Entry E:Object.entrySet())
        {
            System.out.println(E.getKey()+" "+E.getValue());
        }
System.out.println("New List");

        Object.replaceAll((k,v)->"Sahasra");

            for(Map.Entry E:Object.entrySet())
            {
                System.out.println(E.getKey()+" "+E.getValue());
            }

}}
