package main.Tests;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LHash {
    public static void main(String args[])
    {
        LinkedHashSet<Integer> LH1 = new LinkedHashSet<Integer>();
        LH1.add(100);
        LH1.add(101);
        LH1.add(102);
        LH1.add(103);
        LH1.add(104);

        Iterator ITR = LH1.iterator();
        while (ITR.hasNext())
        {
            System.out.println(ITR.next());
        }
    }
}
