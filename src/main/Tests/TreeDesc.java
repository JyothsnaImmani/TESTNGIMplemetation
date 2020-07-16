package main.Tests;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeDesc {
    public static void main(String args[])
    {
    TreeSet<String> T1 = new TreeSet<String>();
    T1.add("Monday");
    T1.add("Tuesday");
    T1.add("Wednesday");
    T1.add("Thursday");
    T1.add("Friday");

        Iterator T2 = T1.descendingIterator();
        while (T2.hasNext())
        {
            System.out.println(T2.next());
        }
    }}

