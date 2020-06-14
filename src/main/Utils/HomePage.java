package main.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    WebDriver driver;

    @FindBy(how = How.LINK_TEXT, using = "Get started free")
    private WebElement Link;


    public void launchpage() throws Throwable {
        if (BaseSelenium.driver != null) {

            String path1 = "/html/body/div[1]/header/div/div/div/a[1]/svg";
            if (BaseSelenium.driver.findElement(By.xpath(path1)).isDisplayed()) {
                throw new IllegalStateException("Home page loaded properly");
            }
        }}


    public HomePage get_free(WebElement element, String Link) {
        element.click();
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
        return this;
    }

    public void get_free1() throws Throwable
    {
        PageFactory.initElements(BaseSelenium.driver, this);
        Link.click();
    }

}

