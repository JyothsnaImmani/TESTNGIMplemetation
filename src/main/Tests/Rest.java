package main.Tests;
import io.restassured.specification.RequestSpecification;
//import org.openqa.selenium.remote.Response;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import io.restassured.*;
import io.restassured.response.Response;
import io.restassured.http.Method;

public class Rest {

    @Test
public void M1()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jyothsna.immani\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        RestAssured.baseURI= "/https://dsternlicht.github.io/RESTool/#/characters?search=";
        //specify the base URL to teh restful webservice
        //get the specification of the request that u want to send to the server - the server is specified by the BASE URI that we have specified this step
        RequestSpecification httprequest = RestAssured.given();
        Response response = httprequest.get();


    }

}
