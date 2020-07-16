package main.Tests;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree1 {

    public static void main(String args[])
    {
        TreeSet<String> T1 = new TreeSet<String>();
        T1.add("Saha");
        T1.add("Jyo");
        T1.add("Anna");
        Iterator ITR = T1.iterator();
        while(ITR.hasNext())
        {
            System.out.println(ITR.next());
        }
    }
}
