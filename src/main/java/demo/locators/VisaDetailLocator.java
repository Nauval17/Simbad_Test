package demo.locators;

import org.openqa.selenium.By;

public interface VisaDetailLocator {
    By HEADER_PAGE = By.xpath("//a[contains(text(),'Visa Booking')]");
    By FIRST_NAME = By.xpath("//input[@name=\"first_name\"]");
    By LAST_NAME = By.xpath("//input[@name=\"last_name\"]");
    By EMAIL = By.xpath("//input[@name=\"email\"]");
    By CONFIRM_EMAIL = By.xpath("//input[@name=\"confirmemail\"]");
    By CONTACT_NUMBER = By.xpath("//input[@name=\"phone\"]");
    By SUBMIT_BUTTON = By.xpath("//button[@id='sub']");
}
