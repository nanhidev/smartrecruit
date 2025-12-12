package com.smartrecruit.stepdefinitions;

import com.smartrecruit.utils.ElementUtils;
import org.junit.Assert;
import com.smartrecruit.driverfactory.DriverFactory;
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
        loginPage.navigateToLoginScreen();
    }

    @When("I enter {string}")
    public void i_enter_email(String emailID) {
        loginPage.enterEmail(emailID);
    }

    @When("I enter {string} in the Password field")
    public void i_enter_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click the 'Login' button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }

    @When("I wait for the system to process the login request")
    public void i_wait_for_the_system_to_process_the_login_request() {
        loginPage.waitForLoginProcessing();
    }

    @Then("the dashboard should be displayed")
    public void the_dashboard_should_be_displayed() {
        Assert.assertTrue("Dashboard is not displayed", loginPage.isDashboardDisplayed());
    }

    @Then("the Login button should be enabled")
    public void the_login_button_should_be_enabled() {
        Assert.assertTrue("Login button is not enabled", loginPage.isLoginButtonEnabled());
    }

    @When("I click the 'Show Password' option")
    public void i_click_the_show_password_option() {
        loginPage.clickShowPassword();
    }

    @Then("the password should be visible")
    public void the_password_should_be_visible() {
        Assert.assertTrue("Password is not visible", loginPage.isPasswordVisible());
    }

    @When("I click the 'Hide Password' option")
    public void i_click_the_hide_password_option() {
        loginPage.clickHidePassword();
    }

    @Then("the password should be hidden")
    public void the_password_should_be_hidden() {
        Assert.assertFalse("Password is still visible", loginPage.isPasswordVisible());
    }

    @Then("an error message {string} is displayed")
    public void an_error_message_is_displayed(String errorMessage) {
        Assert.assertEquals("Error message does not match", errorMessage, loginPage.getErrorMessage());
    }

    @When("the user checks the 'Remember Me' option")
    public void the_user_checks_the_remember_me_option() {
        loginPage.checkRememberMe();
    }

    @Then("the email ID should be pre-filled in the Email ID field")
    public void the_email_id_should_be_pre_filled_in_the_email_id_field() {
        Assert.assertEquals("Email ID field is not pre-filled", "krishna@gmail.com", loginPage.getEmailFieldValue());
    }

    @Then("the email ID field should be empty")
    public void the_email_id_field_should_be_empty() {
        Assert.assertTrue("Email ID field is not empty", loginPage.isEmailFieldEmpty());
    }

    @When("I leave the Email ID field empty")
    public void i_leave_the_email_id_field_empty() {
        loginPage.leaveEmailFieldEmpty();
    }

    @When("I leave the Password field empty")
    public void i_leave_the_password_field_empty() {
        loginPage.leavePasswordFieldEmpty();
    }

    @When("I repeat the login attempt for a total of {int} times")
    public void i_repeat_the_login_attempt_for_a_total_of_times(int attempts) {
        for (int i = 0; i < attempts; i++) {
            loginPage.clickLoginButton();
        }
    }

    @Then("the account should be locked after the {int}th attempt")
    public void the_account_should_be_locked_after_the_th_attempt(int attempt) {
        Assert.assertTrue("Account is not locked after " + attempt + " attempts", loginPage.isAccountLocked());
    }

    @When("I simulate a slow network connection")
    public void i_simulate_a_slow_network_connection() {
        loginPage.simulateSlowNetwork();
    }

    @Then("the dashboard should be displayed after a delay")
    public void the_dashboard_should_be_displayed_after_a_delay() {
        Assert.assertTrue("Dashboard is not displayed after delay", loginPage.isDashboardDisplayedAfterDelay());
    }

    @When("the user attempts to access the dashboard")
    public void the_user_attempts_to_access_the_dashboard() {
        loginPage.accessDashboard();
    }

    @Then("the user should be redirected to the login screen")
    public void the_user_should_be_redirected_to_the_login_screen() {
        Assert.assertTrue("User is not redirected to the login screen", loginPage.isOnLoginScreen());
    }

    @When("the user enters {string} in the Email ID field")
    public void the_user_enters_in_the_email_id_field(String email) {
        loginPage.enterEmail(email);
    }

    @When("the user enters {string} in the Password field")
    public void the_user_enters_in_the_password_field(String password) {
        loginPage.enterPassword(password);
    }

    @When("the user clicks on the 'Forgot Password?' link")
    public void the_user_clicks_on_the_forgot_password_link() {
        loginPage.clickForgotPassword();
    }

    @Then("the password reset screen is displayed")
    public void the_password_reset_screen_is_displayed() {
        Assert.assertTrue("Password reset screen is not displayed", loginPage.isPasswordResetScreenDisplayed());
    }

    @When("the user enters a valid email ID {string}")
    public void the_user_enters_a_valid_email_id(String email) {
        loginPage.enterEmail(email);
    }

    @When("the user clicks the 'Send Reset Link' button")
    public void the_user_clicks_the_send_reset_link_button() {
        loginPage.clickSendResetLink();
    }

    @Then("a success message is displayed")
    public void a_success_message_is_displayed() {
        Assert.assertTrue("Success message is not displayed", loginPage.isSuccessMessageDisplayed());
    }

    @When("the user attempts to use an invalid reset link")
    public void the_user_attempts_to_use_an_invalid_reset_link() {
        loginPage.useInvalidResetLink();
    }

    @Then("an error message indicating the link is invalid is displayed")
    public void an_error_message_indicating_the_link_is_invalid_is_displayed() {
        Assert.assertTrue("Invalid link error message is not displayed", loginPage.isInvalidLinkErrorDisplayed());
    }

    @When("the user attempts to use the same reset link again")
    public void the_user_attempts_to_use_the_same_reset_link_again() {
        loginPage.useSameResetLinkAgain();
    }

    @Then("an error message is displayed")
    public void an_error_message_is_displayed() {
        Assert.assertTrue("Error message is not displayed", loginPage.isErrorMessageDisplayed());
    }
}