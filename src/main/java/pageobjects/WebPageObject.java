package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static demo.drivers.WebDriverInstance.driver;

public class WebPageObject {

    public void waitUntilEnabled(By id){
        WebDriverWait wait = new WebDriverWait(driver,30);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(id));
        element.isEnabled();
    }

    public boolean waitUntilDisplayed(By id){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(id));
        return element.isDisplayed();
    }

    public void clickOn(By id){
        waitUntilEnabled(id);
        WebElement button = driver.findElement(id);
        button.click();
    }

    public void typeOn(By id, String text){
        waitUntilDisplayed(id);
        WebElement type = driver.findElement(id);
        type.clear();
        type.sendKeys(text);
    }

    public void submitText(By id, String text){
        waitUntilDisplayed(id);
        WebElement type = driver.findElement(id);
        type.clear();
        type.sendKeys(text,Keys.ENTER);
    }

    public boolean checkElement(By locator){
        List<WebElement> elements = driver.findElements(locator);
        return elements.size() > 0;
    }

    public void openUrl(String url){
        driver.get(url);
    }

    public String textGetter(By locator){
        WebElement element = driver.findElement(locator);
        return element.getText();
    }

    public void chooseMultipleID(String args, By locator){
        List<WebElement> elements = driver.findElements(locator);
        for(WebElement key:elements){
            if(key.getText().equalsIgnoreCase(args)){
                key.click();
                break;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
