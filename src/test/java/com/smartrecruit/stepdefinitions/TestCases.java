package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.smartrecruit.pages.TestCasesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class TestCases extends DriverFactory {
TestCasesPage testCasesPage = new TestCasesPage(driver);
// DUPLICATE: @Given("the user is on the Login Page")
public void the_user_is_on_the_login_page() {
testCasesPage.navigateToLoginPage();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_email(String email) {
testCasesPage.enterEmail(email);
}
// DUPLICATE: @When("I enter {string} in the Password field")
public void i_enter_password(String password) {
testCasesPage.enterPassword(password);
}
// DUPLICATE: @When("I click the 'Login' button")
public void i_click_the_login_button() {
testCasesPage.clickLoginButton();
}
@Then("the 'Show/Hide Password' option should be available")
public void the_show_hide_password_option_should_be_available() {
testCasesPage.isShowHidePasswordOptionAvailable();
}
@Then("the user should be redirected to the dashboard URL")
public void the_user_should_be_redirected_to_the_dashboard_url() {
Assert.assertEquals("Expected Dashboard URL", testCasesPage.getCurrentUrl());
}
@Then("the dashboard should display the recruiter's name")
public void the_dashboard_should_display_the_recruiters_name() {
testCasesPage.isRecruiterNameDisplayed();
}
// DUPLICATE: @Then("the password should be visible")
public void the_password_should_be_visible() {
testCasesPage.isPasswordVisible();
}
// DUPLICATE: @Then("the password should be hidden")
public void the_password_should_be_hidden() {
testCasesPage.isPasswordVisible();
}
// DUPLICATE: @Then("an error message {string} is displayed")
public void an_error_message_is_displayed(String errorMessage) {
Assert.assertEquals(errorMessage, testCasesPage.getErrorMessage());
}
@Then("the 'Login' button should be disabled")
public void the_login_button_should_be_disabled() {
testCasesPage.isLoginButtonEnabled();
}
@Given("the user leaves the Email ID field empty")
public void the_user_leaves_the_email_id_field_empty() {
testCasesPage.leaveEmailFieldEmpty();
}
@Given("the user leaves the Password field empty")
public void the_user_leaves_the_password_field_empty() {
testCasesPage.leavePasswordFieldEmpty();
}
@Given("I enter {string} in the Email ID field")
public void i_enter_in_the_email_id_field(String email) {
testCasesPage.enterEmail(email);
}
@Given("I enter {string} in the Password field")
public void i_enter_in_the_password_field(String password) {
testCasesPage.enterPassword(password);
}
@Given("the Email ID field is {string}")
public void the_email_id_field_is(String emailField) {
testCasesPage.setEmailField(emailField);
}
@Given("the Password field is {string}")
public void the_password_field_is(String passwordField) {
testCasesPage.setPasswordField(passwordField);
}
// DUPLICATE: @Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
testCasesPage.navigateToLoginPage();
}
@When("I enter {string} in the Email ID field")
public void i_enter_in_the_email_id_field_again(String email) {
testCasesPage.enterEmail(email);
}
@When("I enter {string} in the Password field again")
public void i_enter_in_the_password_field_again(String password) {
testCasesPage.enterPassword(password);
}
@Given("I enter {string} in the Email ID field for SQL injection")
public void i_enter_in_the_email_id_field_for_sql_injection(String email) {
testCasesPage.enterEmail(email);
}
@When("I enter {string} in the Password field for SQL injection")
public void i_enter_in_the_password_field_for_sql_injection(String password) {
testCasesPage.enterPassword(password);
}