package demo.pages;

import demo.locators.VisaDetailLocator;
import pageobjects.WebPageObject;

public class VisaPage implements VisaDetailLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean onVisaPage(){
        return pageObject.waitUntilDisplayed(HEADER_PAGE);
    }
    public void inputFirstName(String first_name){
        pageObject.typeOn(FIRST_NAME, first_name);
    }
    public void inputLastName(String last_name){
        pageObject.typeOn(LAST_NAME, last_name);
    }
    public void inputEmail(String email){ pageObject.typeOn(EMAIL, email); }
    public void confirmEmail(String confirm_email){
        pageObject.typeOn(CONFIRM_EMAIL, confirm_email);
    }
    public void inputPhoneNumber(String phone_number){
        pageObject.typeOn(CONTACT_NUMBER, phone_number);
    }
    public void clickSubmit(){
        pageObject.clickOn(SUBMIT_BUTTON);
    }
}
