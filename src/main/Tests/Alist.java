package main.Tests;

import java.util.ArrayList;
import java.util.*;

public class Alist {

    public static void main(String args[])
    {
        ArrayList<String> name = new ArrayList<String>();
        name.add("jyothsna");
        name.add("Saha");
        name.add("Jyo");
        name.add("Anna");
    Iterator ITR = name.iterator();

    while(ITR.hasNext())
    {
        System.out.println(ITR.next());
    }
    }
}

