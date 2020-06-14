package main.Tests;

import main.Utils.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Firstpage {

    HomePage Page = new HomePage();

    @Given("I navigate to browserstack page$")
    public void getpage()throws Throwable
    {
        Page.launchpage();
    }

    @Then("I click on Getfreebutton$")
    public void iClickOnGetfreebutton() throws Throwable
    {
        Page.get_free1();
    }
}
