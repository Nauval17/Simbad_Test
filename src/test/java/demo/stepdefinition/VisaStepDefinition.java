package demo.stepdefinition;

import demo.pages.VisaInvoicePage;
import org.junit.Assert;

import demo.pages.VisaPage;
import demo.pages.WebHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisaStepDefinition {
    VisaPage visaPage = new VisaPage();
    WebHomepage homepage = new WebHomepage();
    VisaInvoicePage invoicePage = new VisaInvoicePage();

    @When("User input origin country {string}")
    public void userInputOriginCountry(String origin) {
        homepage.clickVisa();
        homepage.chooseOrigin(origin);
    }

    @And("User input destination country {string}")
    public void userInputDestinationCountry(String destination) {
        homepage.chooseDestination(destination);
    }

    @And("User input date {string}")
    public void userInputDate(String date) {
        homepage.chooseVisaDate(date);
    }

    @And("User click submit")
    public void userClickSubmit() {
        homepage.submitButton();
    }

    @Then("User is at visa detail form page")
    public void userIsAtVisaDetailFormPage() {
        Assert.assertTrue(visaPage.onVisaPage());
    }

    @When("User input name {string} {string}")
    public void userInputName(String first_name, String last_name) {
        visaPage.inputFirstName(first_name);
        visaPage.inputLastName(last_name);
    }

    @And("User input email {string}")
    public void userInputEmail(String email) {
        visaPage.inputEmail(email);
        visaPage.confirmEmail(email);
    }

    @And("User input contact number {string}")
    public void userInputContactNumber(String phone_number) {
        visaPage.inputPhoneNumber(phone_number);
    }

    @And("User submit data")
    public void userSubmitData() {
        visaPage.clickSubmit();
    }

    @Then("User see confirmation page")
    public void userSeeConfirmationPage() {
        Assert.assertTrue(invoicePage.onConfirmPage());
    }

    @When("User go to invoice detail page")
    public void userGoToInvoiceDetailPage() {
        invoicePage.clickInvoice();
    }

    @And("User see invoice detail")
    public void userSeeInvoiceDetail() {
        Assert.assertTrue(invoicePage.onInvoicePage());
    }

    @Then("User compare data {string} {string} {string} {string} {string} {string}")
    public void userCompareData(String firstName, String lastName, String phoneNumber,
                                String origin, String destination, String date) {
        Assert.assertEquals(invoicePage.confirmFirstName(),firstName);
        Assert.assertEquals(invoicePage.confirmLastName(),lastName);
        Assert.assertEquals(invoicePage.confirmPhoneNumber(),phoneNumber);
        Assert.assertEquals(invoicePage.confirmOrigin(),origin);
        Assert.assertEquals(invoicePage.confirmDestination(),destination);
        Assert.assertEquals(invoicePage.confirmDate(),date);
    }
}
