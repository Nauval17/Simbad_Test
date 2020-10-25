package demo.pages;

import pageobjects.WebPageObject;

public class VisaPage {
    WebPageObject pageObject = new WebPageObject();

    public boolean onVisaPage(){
        return pageObject.waitUntilDisplayed();
    }
    public void inputFirstName(String first_name){
        pageObject.typeOn(, first_name);
    }
    public void inputLastName(String last_name){
        pageObject.typeOn(, last_name);
    }
    public void inputEmail(String email){
        pageObject.typeOn(, email);
    }
    public void confirmEmail(String confirm_email){
        pageObject.typeOn(, confirm_email);
    }
    public void inputPhoneNumber(String phone_number){
        pageObject.typeOn(, phone_number);
    }
    public void clickSubmit(){
        pageObject.clickOn();
    }
}
