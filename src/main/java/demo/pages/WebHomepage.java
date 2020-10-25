package demo.pages;

import pageobjects.WebPageObject;

public class WebHomepage {
    WebPageObject pageObject = new WebPageObject();
    public void openPage(String url){
        pageObject.openUrl(url);
    }
    public boolean isOnPage(){
        return pageObject.waitUntilDisplayed();
    }
    public void chooseHotel(){
        pageObject.clickOn();
    }
    public void clickVisa(){
        pageObject.clickOn();
    }
    public void chooseLocation(String destination){
        pageObject.typeOn( ,destination);
    }
    public void checkInDate(String checkIn){

    }
    public void checkOutDate(String checkOut){

    }
    public void chooseAdult(int adult){

    }
    public void chooseChildren(int child){

    }
    public void clickSearch(){

    }
    public void clickLogin(){

    }
    public void chooseOrigin(String origin){
        pageObject.typeOn(,origin);
    }
    public void chooseDestination(String destination){
        pageObject.typeOn(,destination);
    }
    public void submitButton(){
        pageObject.clickOn();
    }
}
