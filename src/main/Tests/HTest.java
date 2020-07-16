package main.Tests;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HTest {
    public static void main(String args[])

    {
        HashSet<String> S1 = new HashSet<String>();
        S1.add("Jyo");
        S1.add("Saha");
        S1.add("sailaja");
        S1.add("Jyo");
        Iterator ITR = S1.iterator();
        while(ITR.hasNext())
        {
            System.out.println(ITR.next());
        }
    }
}
