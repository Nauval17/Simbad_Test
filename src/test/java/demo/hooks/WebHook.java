package demo.hooks;

import io.cucumber.java.After;
import demo.drivers.WebDriverInstance;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebHook {

    @Before(value = "@Web")
    public void initializeWebDriver(){
        WebDriverInstance.initialize();
    }
    @After(value = "@Web")
    public void quitWebDriver(Scenario scenario){
        if(scenario.isFailed()){
            scenario
                    .attach(((TakesScreenshot) WebDriverInstance.driver)
                    .getScreenshotAs(OutputType.BYTES),"image/png","Proof of Failure");
        }
        WebDriverInstance.quit();
    }
}
