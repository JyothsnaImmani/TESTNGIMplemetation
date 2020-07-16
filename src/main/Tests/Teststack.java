package main.Tests;

import java.util.Iterator;
import java.util.Stack;

public class Teststack {
    public static void main(String args[])
    {
        Stack<String> s1 = new Stack<>();
        s1.push("Jyothsna");
        s1.push("Saha");
        s1.push("Saila");
        s1.push("gowtham");
        s1.pop();
        Iterator<String> ITR = s1.iterator();
        while(ITR.hasNext())
        {
            System.out.println(ITR.next());
        }
    }
}
