package main.Tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Htest1 {
    public static void main(String args[])
    {
        ArrayList<String> A1 = new ArrayList<String>();
        A1.add("Monday");
        A1.add("Tuesday");
        A1.add("Wednesday");
        A1.add("Thuursday");
        A1.add("Friday");
        HashSet<String> H1 = new HashSet<String>(A1);
        H1.add("Saturday");
        H1.add("Sunday");
        Iterator ITR = H1.iterator();
        while(ITR.hasNext())
        {
            System.out.println(ITR.next());
        }

    }
}
