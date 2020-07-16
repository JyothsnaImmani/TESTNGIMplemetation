package main.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class SelAlist {
    WebDriver driver;
    WebElement element;
    public void Method1()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyothsna.immani\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void Method2()
    {
        List<WebElement> e3 = driver.findElements(By.tagName("a"));
        System.out.println("Size of the list:" + e3.size());
        ArrayList<String> A1 = new ArrayList<String>();
        for (WebElement E1 : e3) {
            try
            {
                A1.add(E1.getText());
            } catch (Exception E)
            {
                System.out.println("Exception E");
            }
    }
    System.out.println("*********************");
        System.out.println("Size of the arraylist" +A1.size());
        int i = 1;
        for(String S:A1)
        {
        System.out.println(i+ "Arraylist Text" +S);
        i++;
        }
    }




    public static void main(String args[])
    {
SelAlist S1 = new SelAlist();
S1.Method1();
S1.Method2();

    }
}

