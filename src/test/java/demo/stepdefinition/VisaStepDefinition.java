package demo.stepdefinition;

import demo.pages.VisaPage;
import demo.pages.WebHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VisaStepDefinition {
    VisaPage visaPage = new VisaPage();
    WebHomepage homepage = new WebHomepage();

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
    }
}
