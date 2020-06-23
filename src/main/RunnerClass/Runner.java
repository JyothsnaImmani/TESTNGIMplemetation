package main.RunnerClass;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)

@CucumberOptions(features={"src/main/Features/Signmeup.feature"}, glue={"main/Utils","main/Tests"})

public class Runner extends AbstractTestNGCucumberTests {
    //Runner for Testng Cucumber .

}
