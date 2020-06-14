package main.RunnerClass;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)

@CucumberOptions(features={"src/main.Features/Browserstackpage.feature"}, glue={"main/Utils","Testcases"})

public class Runner extends AbstractTestNGCucumberTests {

}
