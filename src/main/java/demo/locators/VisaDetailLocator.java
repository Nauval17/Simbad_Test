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
    By VISA_CONFIRM = By.xpath("//strong[contains(text(),'Visa Submitted')]");
    By VIEW_INVOICE = By.xpath("//a[contains(text(),'View Invoice')]");

    By INVOICE_DETAIL = By.xpath("//span[contains(text(),'Booking Details')]");
    By FIRST_NAME_CONFIRM  = By.xpath("//li[1]/span[2]");
    By LAST_NAME_CONFIRM  = By.xpath("//li[2]/span[2]");
    By PHONE_NUMBER_CONFIRM  = By.xpath("//li[3]/span[2]");
    By FROM_CONFIRM  = By.xpath("//li[4]/span[2]");
    By TO_CONFIRM  = By.xpath("//li[5]/span[2]");
    By DATE_CONFIRM  = By.xpath("//li[7]/span[2]");
}
