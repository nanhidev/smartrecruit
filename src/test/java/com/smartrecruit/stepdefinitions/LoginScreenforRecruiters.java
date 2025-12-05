package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
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
public void i_enter_email(String email) {
loginPage.enterEmail(email);
}
@When("I enter {string} in the Password field")
public void i_enter_password(String password) {
loginPage.enterPassword(password);
}
@When("I click the 'Show Password' option")
public void i_click_show_password() {
loginPage.clickShowPassword();
}
@When("I click the Login button")
public void i_click_login_button() {
loginPage.clickLoginButton();
}
@Then("the system processes the login request")
public void the_system_processes_the_login_request() {
"Login request was not processed", loginPage.isLoginProcessed();
}
@Then("the URL changes to the dashboard URL")
public void the_url_changes_to_dashboard_url() {
Assert.assertEquals("Expected dashboard URL does not match", "expected_dashboard_url", driver.getCurrentUrl());
}
@Then("the dashboard elements are visible and accessible")
public void the_dashboard_elements_are_visible_and_accessible() {
"Dashboard elements are not visible", loginPage.areDashboardElementsVisible();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
"Login button is not enabled", loginPage.isLoginButtonEnabled();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginPage.isPasswordVisible();
}
@Then("the password should not be visible")
public void the_password_should_not_be_visible() {
"Password is still visible", loginPage.isPasswordVisible();
}
@When("the user enters a new password {string}")
public void the_user_enters_new_password(String newPassword) {
loginPage.enterNewPassword(newPassword);
}
@Then("the new password should be visible")
public void the_new_password_should_be_visible() {
"New password is not visible", loginPage.isNewPasswordVisible();
}
@Then("the Email ID field is pre-filled with {string}")
public void the_email_id_field_is_pre_filled_with(String emailID) {
Assert.assertEquals("Email ID field is not pre-filled correctly", emailID, loginPage.getEmailFieldValue());
}
@Then("the password reset request is submitted successfully")
public void the_password_reset_request_is_submitted_successfully() {
"Password reset request was not submitted successfully", loginPage.isPasswordResetRequestSuccessful();
}
@Then("the page response should be observed")
public void the_page_response_should_be_observed() {
"Page response was not observed", loginPage.isPageResponseObserved();
}
@Then("the user should still be logged in")
public void the_user_should_still_be_logged_in() {
"User is not logged in", loginPage.isUserLoggedIn();
}
@Then("the job posting details should be displayed correctly")
public void the_job_posting_details_should_be_displayed_correctly() {
"Job posting details are not displayed correctly", loginPage.isJobPostingDetailsDisplayed();
}
@Then("the profile settings page is displayed correctly")
public void the_profile_settings_page_is_displayed_correctly() {
"Profile settings page is not displayed correctly", loginPage.isProfileSettingsPageDisplayed();
}
@Then("the profile information is displayed accurately")
public void the_profile_information_is_displayed_accurately() {
"Profile information is not displayed accurately", loginPage.isProfileInformationAccurate();
}
@Then("the notifications panel is displayed")
public void the_notifications_panel_is_displayed() {
"Notifications panel is not displayed", loginPage.isNotificationsPanelDisplayed();
}
@Then("the help resources page is displayed")
public void the_help_resources_page_is_displayed() {
"Help resources page is not displayed", loginPage.isHelpResourcesPageDisplayed();
}
@Then("the settings page is displayed correctly")
public void the_settings_page_is_displayed_correctly() {
"Settings page is not displayed correctly", loginPage.isSettingsPageDisplayed();
}
@Then("the feedback form is displayed")
public void the_feedback_form_is_displayed() {
"Feedback form is not displayed", loginPage.isFeedbackFormDisplayed();
}
@Then("the activity log page is displayed correctly")
public void the_activity_log_page_is_displayed_correctly() {
"Activity log page is not displayed correctly", loginPage.isActivityLogPageDisplayed();
}
@Then("the preferences page is displayed correctly")
public void the_preferences_page_is_displayed_correctly() {
"Preferences page is not displayed correctly", loginPage.isPreferencesPageDisplayed();
}
@Then("the roles page is displayed correctly")
public void the_roles_page_is_displayed_correctly() {
"Roles page is not displayed correctly", loginPage.isRolesPageDisplayed();
}
@Then("the permissions page is displayed correctly")
public void the_permissions_page_is_displayed_correctly() {
"Permissions page is not displayed correctly", loginPage.isPermissionsPageDisplayed();
}
@Then("the notifications page is displayed correctly")
public void the_notifications_page_is_displayed_correctly() {
"Notifications page is not displayed correctly", loginPage.isNotificationsPageDisplayed();
}