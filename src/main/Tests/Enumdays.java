package main.Tests;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public enum Enumdays {
    //enum for specific days
    Sunday,monday,tuesday,wednesday,thursday,friday,saturday;

    public static void main(String args[])
    {
        Set<Enumdays> E1 = EnumSet.of(Enumdays.wednesday,Enumdays.Sunday);
        Iterator ITR = E1.iterator();
        while(ITR.hasNext())
        {
            System.out.println(ITR.next());
        }


    }
    }
