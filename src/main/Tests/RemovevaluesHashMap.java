package main.Tests;

import org.testng.annotations.Test;

import java.util.HashMap;

public class RemovevaluesHashMap {

    public static void main(String args[])
    {
        HashMap<Integer,String>  name = new HashMap<Integer,String>();
        name.put(100,"Jyo");
        name.put(101,"Sana");
        name.put(102,"Saha");
        name.put(103,"Saila");

               System.out.println("Elemnts are" +name);

        name.remove(100);
        System.out.println("removed elemants" +name);

        name.remove(101);
        System.out.println("Updated list" +name);

        name.remove(102,"Saha");
        System.out.println("removed" +name);


    }

}
