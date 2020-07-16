package main.Tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import main.Utils.HomePage;

public class Signme {

    HomePage Page1 = new HomePage();

    @Given("User navigate to browserstack page$")
    public void nav()throws Throwable
    {
        Page1.launchpage();
        Thread.sleep(2000);
        System.out.println("PAge launched");
    }


    @When("click on Getfreebutton$")
    public void clickOnGetfreebutton() throws Throwable
    {
        Page1.get_free1();
        System.out.println("element is clicked");
        Thread.sleep(10000);

    }

    @And("I enter the user details \"(.*?)\"\"(.*?)\"\"(.*?)\" and click on signup$")
    public void iEnterTheUserDetails(String name, String email, String pass) throws Throwable
    {
        Page1.signup(name,pass,email);
        System.out.println("Signed up");
        
    }

    @Then("user is registered")
    public void userIsRegistered()
    {
        System.out.println("USer is signed up");

    }
}
