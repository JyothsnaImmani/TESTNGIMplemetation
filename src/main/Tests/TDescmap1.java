package main.Tests;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TDescmap1 {
    public static void main(String args[])
    {
        NavigableMap<Integer, String> T1 = new TreeMap<Integer, String>();
        T1.put(104, "one");
        T1.put(101, "Two");
        T1.put(102, "Three");
        T1.put(100, "Alpha");
        System.out.println("Descending Map" +T1.descendingMap());
    }
}