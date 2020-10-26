package demo.stepdefinition;

import demo.pages.LoginPage;
import demo.pages.WebHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeStepDefinition {
    WebHomepage homepage = new WebHomepage();
    LoginPage loginPage = new LoginPage();

    @Given("User is at home page")
    public void userIsAtHomePage() {
        homepage.isOnPage();
    }

    @When("User choose to login")
    public void userChooseToLogin() {
        homepage.clickLogin();
    }

    @And("User input credential {string} {string}")
    public void userInputCredential(String email, String password) throws InterruptedException {
        Assert.assertTrue(loginPage.onLoginPage());
        Thread.sleep(3000);
        loginPage.inputEmail(email);
        loginPage.inputPassword(password);
    }

    @And("User click login")
    public void userClickLogin() throws InterruptedException {
        loginPage.clickSubmit();
        loginPage.onAccount();
        Thread.sleep(3000);
        loginPage.clickHome();
    }

    @Given("User open website {string}")
    public void userOpenWebsite(String url) {
        homepage.openPage(url);
    }
}
