package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.smartrecruit.pages.LoginScreenforRecruitersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginScreenforRecruiters extends DriverFactory {
LoginScreenforRecruitersPage loginPage = new LoginScreenforRecruitersPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
}
@Given("I enter {string} in the Email ID field")
public void i_enter_in_the_email_id_field(String email_id) {
loginPage.enterEmailId(email_id);
}
@Given("I enter {string} in the Password field")
public void i_enter_in_the_password_field(String password) {
loginPage.enterPassword(password);
}
@Given("I click on the 'Show Password' option to verify visibility")
public void i_click_on_the_show_password_option_to_verify_visibility() {
loginPage.clickShowPassword();
}
@When("I click the Login button")
public void i_click_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
loginPage.isDashboardDisplayed();
}
@Then("the dashboard loads successfully without errors")
public void the_dashboard_loads_successfully_without_errors() {
loginPage.isDashboardLoadedSuccessfully();
}
@Then("the Login button should be {string}")
public void the_login_button_should_be(String buttonState) {
Assert.assertEquals(buttonState, loginPage.getLoginButtonState());
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
loginPage.isPasswordVisible();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
loginPage.isPasswordVisible();
}
@Given("the recruiter navigates to the login screen")
public void the_recruiter_navigates_to_the_login_screen() {
loginPage.navigateToLoginScreen();
}
@Then("an error message 'Incorrect email ID or password.' is displayed")
public void an_error_message_incorrect_email_id_or_password_is_displayed() {
Assert.assertEquals("Incorrect email ID or password.", loginPage.getErrorMessage());
}
@Then("an error message indicating that both fields are required is displayed")
public void an_error_message_indicating_that_both_fields_are_required_is_displayed() {
Assert.assertEquals("Both fields are required.", loginPage.getErrorMessage());
}
@Then("an error message indicating invalid email format is displayed")
public void an_error_message_indicating_invalid_email_format_is_displayed() {
Assert.assertEquals("Invalid email format.", loginPage.getErrorMessage());
}
@Then("an error message indicating password length requirement is displayed")
public void an_error_message_indicating_password_length_requirement_is_displayed() {
Assert.assertEquals("Password must be at least 8 characters long.", loginPage.getErrorMessage());
}
@Then("an error message indicating email ID exceeds character limit is displayed")
public void an_error_message_indicating_email_id_exceeds_character_limit_is_displayed() {
Assert.assertEquals("Email ID exceeds character limit.", loginPage.getErrorMessage());
}
@Then("the Login button is disabled")
public void the_login_button_is_disabled() {
loginPage.isLoginButtonDisabled();
}
@Then("the email ID is pre-filled in the Email ID field")
public void the_email_id_is_pre_filled_in_the_email_id_field() {
Assert.assertEquals("recruiter@example.com", loginPage.getEmailId());
}
@Given("I check the 'Remember Me' option")
public void i_check_the_remember_me_option() {
loginPage.checkRememberMe();
}
@Then("the user logs out successfully")
public void the_user_logs_out_successfully() {
loginPage.logout();
loginPage.isLoggedOut();
}
@Then("the user closes the browser and reopens it")
public void the_user_closes_the_browser_and_reopens_it() {
driver.quit();
driver = DriverFactory.getDriver();
}
@Then("the login screen is displayed again")
public void the_login_screen_is_displayed_again() {
loginPage.isLoginScreenDisplayed();
}
@Given("the user enters {string}")
public void the_user_enters(String email) {
loginPage.enterEmailId(email);
}
@Then("the user remains on the login screen")
public void the_user_remains_on_the_login_screen() {
loginPage.isLoginScreenDisplayed();
}

@And("the user clicks on the 'hide password' option")
public void the_user_clicks_on_hide_password_option() {
loginPage.clickHidePasswordOption();
}
@When("I enter a valid password {string}")
public void i_enter_a_valid_password(String validPassword) {
loginPage.enterPassword(validPassword);
}
@When("I leave the password field empty")
public void i_leave_the_password_field_empty() {
loginPage.enterPassword("");
}
@When("I enter {string}")
public void i_enter(String input) {
loginPage.enterEmail(input);
}
@Given("the user navigates back to the application")
public void the_user_navigates_back_to_the_application() {
loginPage.navigateToApplication();
}
@Then("the dashboard should load successfully without errors")
public void the_dashboard_should_load_successfully_without_errors() {
"Dashboard did not load successfully", loginPage.isDashboardLoaded();
}
@Then("the user is redirected to the dashboard")
public void the_user_is_redirected_to_the_dashboard() {
"User is not redirected to the dashboard", loginPage.isUserOnDashboard();
}
@And("the user clicks the login button")
public void the_user_clicks_the_login_button() {
loginPage.clickLoginButton();
}
@When("I enter an invalid email format {string}")
public void i_enter_an_invalid_email_format(String invalidEmail) {
loginPage.enterEmail(invalidEmail);
}
@When("I leave the email id field empty")
public void i_leave_the_email_id_field_empty() {
loginPage.enterEmail("");
}
@Then("I should be redirected to the dashboard")
public void i_should_be_redirected_to_the_dashboard() {
"User is not redirected to the dashboard", loginPage.isUserOnDashboard();
}
@When("I enter a valid password {string} in the password field")
public void i_enter_a_valid_password_in_the_password_field(String validPassword) {
loginPage.enterPassword(validPassword);
}
@When("I leave both the email id password fields empty")
public void i_leave_both_the_email_id_password_fields_empty() {
loginPage.enterEmail("");
loginPage.enterPassword("");
}
@And("the user clicks on the 'show password' option")
public void the_user_clicks_on_show_password_option() {
loginPage.clickShowPasswordOption();
}
}