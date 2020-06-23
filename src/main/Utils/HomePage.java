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

    @FindBy(how = How.XPATH, using = "//*[@id=\"user_full_name\"]")
    private WebElement Fullname;

    @FindBy(how = How.ID, using = "user_email_login")
    private WebElement Email;

    @FindBy(how = How.ID, using = "user_password")
    private WebElement Pass;

    @FindBy(how = How.ID, using = "tnc_checkbox")
    private WebElement check;

    @FindBy(how = How.ID, using = "user_submit")
    private WebElement Signme;


    Actions actions = new Actions(BaseSelenium.driver);
    By xpath = By.xpath("//*[@id=\"signupModalButton\"]");

    // By id = By.id("tnc_checkbox");


    public void get_free1() throws Throwable
    {
        PageFactory.initElements(BaseSelenium.driver, this);
        actions.moveToElement(BaseSelenium.driver.findElement(xpath)).click().build().perform();
        actions.click();

    }


    public void launchpage() throws Throwable {
        if (BaseSelenium.driver != null) {
            Thread.sleep(2000);

            //String path1 = "/html/body/div[1]/header/div/div/div/a[1]/svg";
            String path1 = "//*[@id=\"signupModalButton\"]";
            if (!BaseSelenium.driver.findElement(By.xpath(path1)).isDisplayed()) {
                throw new IllegalStateException("Home page not loaded properly");
            }
        }}

        public void signup(String name, String pass, String email)throws Throwable
        {
            PageFactory.initElements(BaseSelenium.driver, this);

            Fullname.sendKeys(name);
            Pass.sendKeys(pass);
            Email.sendKeys(email);
            check.click();
            Signme.submit();

        }
}

