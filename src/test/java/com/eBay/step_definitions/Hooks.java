package com.eBay.step_definitions;

import com.eBay.utilities.BrowserUtilities;
import com.eBay.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtilities.sleep(1);
        Driver.closeDriver();
        System.out.println("===Closing browser using cucumber @After");
        System.out.println("===Scenario ended / Take screenshot if failed");

    }
}