package main.Tests;
import java.util.*;

public enum Enumbers1 {

    Sunday,monday,tuesday,wednesday,thursday,friday,saturday;
    public static void main(String args[])
    {
        Set<Enumbers1> E1 = EnumSet.allOf(Enumbers1.class);
        System.out.println("Weekdays" +E1);

Set<Enumbers1> E2 = EnumSet.noneOf(Enumbers1.class);
System.out.println(E1);
        }
    }

