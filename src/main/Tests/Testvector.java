package main.Tests;

import java.util.Vector;

public class Testvector {

    public static void main(String args[])
    {
        Vector<String> vlist =  new Vector<String>(4);
        vlist.add("jyothsna");
        vlist.add("Sahasra");
        vlist.add("Sailaja");
        vlist.add("Satya");
        System.out.println("The Size is" + vlist.size());
        System.out.println("Default capacity is" +vlist.capacity());
        System.out.println("Vector elements is " +vlist);
        vlist.addElement("Gowtham");
        vlist.addElement("Katie");
        vlist.addElement("Aldrin");
        System.out.println(vlist.size() +" "+ vlist.capacity() + " " + vlist);

        System.out.println("-------------------------------------------------------------------");

        if(vlist.contains("jyothsna"))
        {
            System.out.println("Jyothsna is present at index" + vlist.indexOf("jyothsna"));
        }
        else
        {
            System.out.println("Jyothsna is not present");
        }
        System.out.println("The first element is" + vlist.firstElement());
        System.out.println("The Last element is" +vlist.lastElement());
    }
}
