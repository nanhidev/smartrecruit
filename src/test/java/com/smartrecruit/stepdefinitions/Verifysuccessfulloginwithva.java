package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com.smartrecruit.driverfactory.DriverFactory; // Ensure this is the correct package name
import com.smartrecruit.pages.VerifysuccessfulloginwithvaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Verifysuccessfulloginwithva extends DriverFactory {
VerifysuccessfulloginwithvaPage loginPage = new VerifysuccessfulloginwithvaPage(driver);
// DUPLICATE: @Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginPage.navigateToLoginScreen();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_email(String email) {
loginPage.enterEmail(email);
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_password(String password) {
loginPage.enterPassword(password);
}
@And("the user clicks the Login button")
public void the_user_clicks_the_login_button() {
loginPage.clicksLoginButton();
}
@And("the system processes the login request")
public void the_system_processes_the_login_request() {
loginPage.processLoginRequest();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
loginPage.isUserRedirectedToDashboard();
}