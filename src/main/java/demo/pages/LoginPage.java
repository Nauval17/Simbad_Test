package demo.pages;

import demo.locators.HomeLocator;
import pageobjects.WebPageObject;

public class LoginPage implements HomeLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean onLoginPage(){
        return pageObject.waitUntilDisplayed(HOME_BUTTON);
    }
    public void inputEmail(String email){
        pageObject.typeOn(INPUT_EMAIL, email);
    }
    public void inputPassword(String password){
        pageObject.typeOn(PASSWORD, password);
    }
    public void clickSubmit(){
        pageObject.clickOn(LOGIN_BUTTON);
    }
    public void onAccount(){
        pageObject.waitUntilDisplayed(HOME_BUTTON);
        pageObject.clickOn(HOME_BUTTON);
    }
}
