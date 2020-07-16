package main.Tests;

import java.util.Iterator;
import java.util.LinkedList;

public class lList {
    public static void main(String args[])
    {
        LinkedList<String> Link1 = new LinkedList<String>();
        Link1.add("Jyothsna");
        Link1.add("Sahasra");
        Link1.add("Sailaja");
        Link1.add("Sahasra");
        Iterator<String> ITR = Link1.iterator();
        while(ITR.hasNext())
        {
        System.out.println(ITR.next());
        }

    }
}
