package demo.pages;

import demo.locators.HomeLocator;
import pageobjects.WebPageObject;

public class WebHomepage implements HomeLocator {
    WebPageObject pageObject = new WebPageObject();
    public void openPage(String url){
        pageObject.openUrl(url);
    }
    public boolean isOnPage(){
        return pageObject.waitUntilDisplayed(WEBSITE_LOGO);
    }
    public void chooseHotel(){
        pageObject.clickOn(TAB_HOTEL);
    }
    public void clickVisa(){
        pageObject.clickOn(TAB_VISA);
    }
//    public void chooseLocation(String destination){
//        pageObject.typeOn(,destination);
//    }
    public void checkInDate(String checkIn){
        pageObject.typeOn(CHECKIN_DATE, checkIn);
    }
    public void checkOutDate(String checkOut){
        pageObject.typeOn(CHECKOUT_DATE, checkOut);
    }
    public void chooseAdult(int adult){

    }
    public void chooseChildren(int child){

    }
    public void clickSearch(){

    }
    public void clickLogin(){
        pageObject.clickOn(ACCOUNT_MENU);
        pageObject.clickOn(LOGIN_MENU);
    }
    public void chooseOrigin(String origin){
        pageObject.clickOn(VISA_ORIGIN);
        pageObject.typeOn(INPUT_ORIGIN,origin);
        pageObject.chooseMultipleID(origin,SELECT_ORIGIN);
    }
    public void chooseDestination(String destination){
        pageObject.clickOn(VISA_DESTINATION);
        pageObject.typeOn(INPUT_DESTINATION,destination);
        pageObject.chooseMultipleID(destination,SELECT_DESTINATION);
    }
    public void chooseVisaDate(String date){
        pageObject.typeOn(INPUT_DATE, date);
    }
    public void submitButton(){
        pageObject.clickOn(SUBMIT_BUTTON);
    }
}
