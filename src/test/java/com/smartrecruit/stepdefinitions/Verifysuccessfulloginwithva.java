package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class Verifysuccessfulloginwithva extends DriverFactory {
private LoginPage loginPage;
public Verifysuccessfulloginwithva() {
this.loginPage = new LoginPage();
}
// DUPLICATE: @Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
loginPage.navigateToLoginScreen();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_email(String email) {
loginPage.enterEmail(email);
}
@When("And I enter {string}")
public void and_i_enter_password(String password) {
loginPage.enterPassword(password);
}
@When("And the user clicks the Login button")
public void and_the_user_clicks_the_login_button() {
loginPage.clickLoginButton();
}
@When("And the system processes the login request")
public void and_the_system_processes_the_login_request() {
// Assuming there's a method to wait for the login process to complete
loginPage.waitForLoginToComplete();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
String currentUrl = driver.getCurrentUrl();
Assert.assertEquals("Expected URL after login", "http://example.com/dashboard", currentUrl);
}