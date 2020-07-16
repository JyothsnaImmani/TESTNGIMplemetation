package main.Tests;

import java.util.Set;
import java.util.TreeSet;
import java.lang.*;
import java.lang.Comparable;

public class TComapre1 implements Comparable <TComapre1>{

    String name, country;
    int id;

    public TComapre1(String name, String country, int id)
    {
        this.name = name;
        this.country = country;
        this.id = id;
    }
    public int compareTo(TComapre1 C1)
    {
        if(id>C1.id)
        {
            return 1;
        }
        else if (id<C1.id)
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Set<TComapre1> Object = new TreeSet<TComapre1>();
        TComapre1 object2 = new TComapre1("Copenhagen","denmark",9);
        TComapre1 object3 = new TComapre1("Swiss","Zurick",10);
        Object.add(object2);
        Object.add(object3);

        for (TComapre1 C1:Object)
        {
            System.out.println(C1.name +" "+C1.country +" "+C1.id);
        }
    }
}
