package main.Tests;

import io.cucumber.java8.Th;
import main.Utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Firstpage {


    HomePage Page = new HomePage();

    //@Test(groups = {"smoke"})
    @Given("I navigate to browserstack page$")
    public void getpage()throws Throwable
    {
        Page.launchpage();
        System.out.println("Page launched");
    }

    //@Test(groups = {"smoke"})
    @Then("I click on Getfreebutton$")
    public void iClickOnGetfreebutton() throws Throwable
    {
        Thread.sleep(1000);
        Page.get_free1();
        System.out.println("Button clicked");
    }
}
