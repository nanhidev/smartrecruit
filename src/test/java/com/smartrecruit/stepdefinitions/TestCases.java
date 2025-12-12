package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
public class TestCases extends DriverFactory {
private LoginPage loginPage;
public TestCases() {
this.loginPage = new LoginPage();
}
// DUPLICATE: @Given("the user is on the Login Page")
public void the_user_is_on_the_Login_Page() {
loginPage.navigateToLoginPage();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter(String email) {
loginPage.enterEmail(email);
}
// DUPLICATE: @When("I enter {string} in the Password field")
public void i_enter_in_the_Password_field(String password) {
loginPage.enterPassword(password);
}
// DUPLICATE: @When("I click the 'Login' button")
public void i_click_the_Login_button() {
loginPage.clickLoginButton();
}
@Then("the 'Show/Hide Password' option should be available")
public void the_Show_Hide_Password_option_should_be_available() {
"Show/Hide Password option is not available", loginPage.isShowHidePasswordOptionAvailable();
}
@Then("the user should be redirected to the dashboard URL")
public void the_user_should_be_redirected_to_the_dashboard_URL() {
Assert.assertEquals("User is not redirected to the dashboard", "expected_dashboard_url", loginPage.getCurrentUrl());
}
@Then("the dashboard should display the recruiter's name")
public void the_dashboard_should_display_the_recruiter_s_name() {
"Recruiter's name is not displayed", loginPage.isRecruiterNameDisplayed();
}
// DUPLICATE: @Then("an error message {string} is displayed")
public void an_error_message_is_displayed(String errorMessage) {
Assert.assertEquals("Error message is not displayed as expected", errorMessage, loginPage.getErrorMessage());
}
@Then("the 'Login' button should be disabled")
public void the_Login_button_should_be_disabled() {
"Login button is not disabled", loginPage.isLoginButtonEnabled();
}
@When("I verify the state of the 'Login' button")
public void i_verify_the_state_of_the_Login_button() {
// This step is already covered in the assertion step
}
@When("I clearElement the Password field")
public void i_clear_the_Password_field() {
loginPage.clearPasswordField();
}
@When("I enter the Password as {string}")
public void i_enter_the_Password_as(String password) {
loginPage.enterPassword(password);
}
// DUPLICATE: @When("I enter {string} in the Email ID field")
public void i_enter_in_the_Email_ID_field(String emailID) {
loginPage.enterEmail(emailID);
}
@When("I enter the SQL injection string {string}")
public void i_enter_the_SQL_injection_string(String email) {
loginPage.enterEmail(email);
}
//    @When("I enter {string} in the Password field")
@When("I check the 'Show/Hide Password' option")
public void i_check_the_Show_Hide_Password_option() {
loginPage.checkShowHidePasswordOption();
}
@When("I enter an email ID at the maximum allowed length {string}")
public void i_enter_an_email_ID_at_the_maximum_allowed_length(String email) {
loginPage.enterEmail(email);
}
@When("I enter a password at the maximum allowed length {string}")
public void i_enter_a_password_at_the_maximum_allowed_length(String password) {
loginPage.enterPassword(password);
}
@When("I enter an email ID with special characters {string}")
public void i_enter_an_email_ID_with_special_characters(String email) {
loginPage.enterEmail(email);
}
@When("I enter a password with special characters {string}")
public void i_enter_a_password_with_special_characters(String password) {
loginPage.enterPassword(password);
}

public TestCases() {
this.testCasesPage = new TestCasesPage();
}
@Given("the user leaves the email id field empty")
public void theUserLeavesTheEmailIdFieldEmpty() {
testCasesPage.leaveEmailIdFieldEmpty();
}
// DUPLICATE: @When("the user clicks the login button")
public void theUserClicksTheLoginButton() {
testCasesPage.clicksLoginButton();
}
// DUPLICATE: @Then("an error message 'incorrect email id or password.' is displayed")
public void anErrorMessageIncorrectEmailIdOrPasswordIsDisplayed() {
String errorMessage = testCasesPage.getErrorMessage();
Assert.assertEquals("incorrect email id or password.", errorMessage);
}
@When("the user clears the password field")
public void theUserClearsThePasswordField() {
testCasesPage.clearPasswordField();
}
@Then("the user should see the error message 'incorrect email id or password.'")
public void theUserShouldSeeTheErrorMessageIncorrectEmailIdOrPassword() {
String errorMessage = testCasesPage.getErrorMessage();
Assert.assertEquals("incorrect email id or password.", errorMessage);
}
@Then("i verify that the 'show/hide password' option is available")
public void iVerifyThatTheShowHidePasswordOptionIsAvailable() {
testCasesPage.isShowHidePasswordOptionAvailable();
}
@When("the user clicks the 'show/hide password' option")
public void theUserClicksTheShowHidePasswordOption() {
testCasesPage.clicksShowHidePasswordOption();
}
@When("the user enters the password {string}")
public void theUserEntersThePassword(String password) {
testCasesPage.enterPassword(password);
}
@When("the user enters {string} in the email id field")
public void theUserEntersInTheEmailIdField(String email) {
testCasesPage.enterEmailId(email);
}
// DUPLICATE: @Then("the password should be visible")
public void thePasswordShouldBeVisible() {
testCasesPage.isPasswordVisible();
}
// DUPLICATE: @Then("the password should be hidden")
public void thePasswordShouldBeHidden() {
testCasesPage.isPasswordHidden();
}
@When("the user enters an incorrect password {string}")
public void theUserEntersAnIncorrectPassword(String incorrectPassword) {
testCasesPage.enterPassword(incorrectPassword);
}
// DUPLICATE: @When("the user enters a valid password {string}")
public void theUserEntersAValidPassword(String validPassword) {
testCasesPage.enterPassword(validPassword);
}
@When("the user enters a password with special characters {string}")
public void theUserEntersAPasswordWithSpecialCharacters(String specialPassword) {
testCasesPage.enterPassword(specialPassword);
}
@When("the user leaves the password field empty")
public void theUserLeavesThePasswordFieldEmpty() {
testCasesPage.leavePasswordFieldEmpty();
}
@Then("the 'login' button should still be disabled")
public void theLoginButtonShouldStillBeDisabled() {
testCasesPage.isLoginButtonEnabled();
}
@Then("i should be redirected to the dashboard url")
public void iShouldBeRedirectedToTheDashboardUrl() {
String currentUrl = testCasesPage.getCurrentUrl();
Assert.assertEquals("expected_dashboard_url", currentUrl); // Replace with actual expected URL
}
@Then("the dashboard displays the recruiter's name")
public void theDashboardDisplaysTheRecruitersName() {
testCasesPage.isRecruiterNameDisplayed();
}
@When("i enter a password at the maximum allowed length in the password field")
public void iEnterAPasswordAtTheMaximumAllowedLengthInThePasswordField() {
testCasesPage.enterMaxLengthPassword();
}
// DUPLICATE: @Then("the user should be redirected to the dashboard")
public void theUserShouldBeRedirectedToTheDashboard() {
testCasesPage.isDashboardDisplayed();
}
@Then("the email id field is {string}")
public void theEmailIdFieldIs(String email) {
Assert.assertEquals(email, testCasesPage.getEmailId());
}
@Then("the password field is {string}")
public void thePasswordFieldIs(String password) {
Assert.assertEquals(password, testCasesPage.getPassword());
}
}