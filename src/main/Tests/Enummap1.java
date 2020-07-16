package main.Tests;

import io.cucumber.java8.En;

import java.util.EnumMap;
import java.util.Map;

public class  Enummap1 {
     public enum days{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};

     public static void main(String args[])
     {
         EnumMap<days,String> EN1 = new EnumMap<days,String>(days.class);
         EN1.put(days.Monday,"01");
         EN1.put(days.Tuesday,"02");
         EN1.put(days.Wednesday,"03");
         EN1.put(days.Thursday,"04");
         EN1.put(days.Friday,"05");
         EN1.put(days.Saturday,"06");
         EN1.put(days.Sunday,"07");
         for(Map.Entry E1:EN1.entrySet())
         {
             System.out.println(E1.getKey()+" "+E1.getValue());
         }

     }
}
