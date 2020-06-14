package main.Utils;

import main.UIProperties.Elements;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.core.internal.gherkin.ast.Scenario;
import main.Utils.BaseSelenium;
import main.Utils.Drivers;


import java.util.concurrent.TimeUnit;

public class Basebrowser {

        @Before
        public void beforeScenario(Scenario scenario) {
            // init driver
            System.setProperty(Elements.DRIVER_TYPE, Elements.DRIVER_PATH);
            BaseSelenium.driver = Drivers.getSeleniumDriver(Elements.APPLICATION_TEST_BROWSER);

            // open and maximize
            BaseSelenium.driver.get(Elements.URL);
            BaseSelenium.driver.manage().window().maximize();
            BaseSelenium.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

        @After
        public void afterScenario(Scenario scenario) throws InterruptedException{
            Thread.sleep(5000);
            BaseSelenium.driver.quit();
        }
}


