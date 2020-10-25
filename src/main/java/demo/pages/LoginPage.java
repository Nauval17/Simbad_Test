package demo.pages;

import pageobjects.WebPageObject;

public class LoginPage {
    WebPageObject pageObject = new WebPageObject();

    public void onLoginPage(){
        pageObject.waitUntilDisplayed();
    }
    public void inputEmail(String email){
        pageObject.typeOn(, email);
    }
    public void clickSubmit(){
        pageObject.clickOn();
    }
    public void onAccount(){
        pageObject.waitUntilDisplayed();
    }
}
