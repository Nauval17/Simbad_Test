package demo.pages;

import demo.locators.VisaDetailLocator;
import pageobjects.WebPageObject;

public class VisaInvoicePage implements VisaDetailLocator {
    WebPageObject pageObject = new WebPageObject();

    public boolean onConfirmPage(){
        return pageObject.waitUntilDisplayed(VISA_CONFIRM);
    }
    public void clickInvoice(){
        pageObject.clickOn(VIEW_INVOICE);
    }
    public boolean onInvoicePage(){
       return pageObject.waitUntilDisplayed(INVOICE_DETAIL);
    }
    public String confirmFirstName(){
       return pageObject.textGetter(FIRST_NAME_CONFIRM);
    }
    public String confirmLastName(){
        return pageObject.textGetter(LAST_NAME_CONFIRM);
    }
    public String confirmDate(){
        return pageObject.textGetter(DATE_CONFIRM);
    }
    public String confirmPhoneNumber(){
        return pageObject.textGetter(PHONE_NUMBER_CONFIRM);
    }
    public String confirmOrigin(){
        return pageObject.textGetter(FROM_CONFIRM);
    }
    public String confirmDestination(){
       return pageObject.textGetter(TO_CONFIRM);
    }
}
