package demo.locators;

import org.openqa.selenium.By;

public interface HomeLocator {
    By WEBSITE_LOGO = By.xpath("//header//div[@class = \"header-logo go-right\"]");
    By TAB_HOTEL = By.xpath("//a[@data-name=\"hotels\"]");
    By TAB_VISA = By.xpath("//a[@data-name=\"visa\"]");
    By CHECKIN_DATE = By.xpath("//input[@id='checkin']");
    By CHECKOUT_DATE = By.xpath("//input[@id='checkout']");
    By ACCOUNT_MENU = By.xpath("//*[@class=\"mini-menu\"]/ul/li[3]");
    By LOGIN_MENU = By.xpath("//*[@class=\"mini-menu\"]/ul/li[3]/div/div//a[1]");

    By VISA_ORIGIN = By.xpath("//*[@id='visa']//*[@class='form-inner']/div/div[1]//a");
    By INPUT_ORIGIN = By.xpath("//*[@id='visa']//*[@class='form-inner']/div/div[1]//input");
    By SELECT_ORIGIN = By.xpath("//*[@id='visa']//*[@class='form-inner']/div/div[1]//li");
    By VISA_DESTINATION = By.xpath("//*[@id='visa']//*[@class='form-inner']/div/div[2]//a");
    By INPUT_DESTINATION = By.xpath("//*[@id='visa']//*[@class='form-inner']/div/div[2]//input");
    By SELECT_DESTINATION = By.xpath("//*[@id='visa']//*[@class='form-inner']/div/div[2]//li");
    By INPUT_DATE = By.xpath("//input[@placeholder=\"Date\"]");
    By SUBMIT_BUTTON = By.xpath("//button[@id='sub']");

    By INPUT_EMAIL = By.xpath("//input[@name='username']");
    By PASSWORD = By.xpath("//input[@name='password']");
    By LOGIN_BUTTON = By.xpath("//button[contains(text(),'Login')]");
    By HOME_BUTTON = By.xpath("//a[contains(text(),'Home')]");
}
