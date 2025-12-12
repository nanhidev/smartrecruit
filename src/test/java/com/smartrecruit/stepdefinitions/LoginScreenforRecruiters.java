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
LoginScreenforRecruitersPage loginScreenforRecruitersPage = new LoginScreenforRecruitersPage(driver);
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
driver = DriverFactory.getDriver();
loginScreenforRecruitersPage.navigateToLoginScreen();
}
@When("I enter {string}")
public void i_enter_email(String emailID) {
loginScreenforRecruitersPage.enterEmail(emailID);
}
@When("I enter {string} in the Password field")
public void i_enter_password(String password) {
loginScreenforRecruitersPage.enterPassword(password);
}
@When("I click the 'Login' button")
public void i_click_the_login_button() {
loginScreenforRecruitersPage.clickLoginButton();
}
@When("I wait for the system to process the login request")
public void i_wait_for_the_system_to_process_the_login_request() {
loginScreenforRecruitersPage.waitForLoginProcessing();
}
@Then("the dashboard should be displayed")
public void the_dashboard_should_be_displayed() {
"Dashboard is not displayed", loginScreenforRecruitersPage.isDashboardDisplayed();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
"Login button is not enabled", loginScreenforRecruitersPage.isLoginButtonEnabled();
}
@When("I click the 'Show Password' option")
public void i_click_the_show_password_option() {
loginScreenforRecruitersPage.clickShowPassword();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginScreenforRecruitersPage.isPasswordVisible();
}
@When("I click the 'Hide Password' option")
public void i_click_the_hide_password_option() {
loginScreenforRecruitersPage.clickHidePassword();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginScreenforRecruitersPage.isPasswordVisible();
}
@Then("an error message {string} is displayed")
public void an_error_message_is_displayed(String errorMessage) {
Assert.assertEquals("Error message does not match", errorMessage, loginScreenforRecruitersPage.getErrorMessage());
}
@When("the user checks the 'Remember Me' option")
public void the_user_checks_the_remember_me_option() {
loginScreenforRecruitersPage.checkRememberMe();
}
@Then("the email ID should be pre-filled in the Email ID field")
public void the_email_id_should_be_pre_filled_in_the_email_id_field() {
Assert.assertEquals("Email ID field is not pre-filled", "krishna@gmail.com", loginScreenforRecruitersPage.getEmailFieldValue());
}
@Then("the email ID field should be empty")
public void the_email_id_field_should_be_empty() {
"Email ID field is not empty", loginScreenforRecruitersPage.isEmailFieldEmpty();
}
@When("I leave the Email ID field empty")
public void i_leave_the_email_id_field_empty() {
loginScreenforRecruitersPage.leaveEmailFieldEmpty();
}
@When("I leave the Password field empty")
public void i_leave_the_password_field_empty() {
loginScreenforRecruitersPage.leavePasswordFieldEmpty();
}
@When("I repeat the login attempt for a total of {int} times")
public void i_repeat_the_login_attempt_for_a_total_of_times(int attempts) {
for (int i = 0; i < attempts; i++) {
loginScreenforRecruitersPage.clickLoginButton();
}
}
@Then("the account should be locked after the {int}th attempt")
public void the_account_should_be_locked_after_the_th_attempt(int attempt) {
"Account is not locked after " + attempt + " attempts", loginScreenforRecruitersPage.isAccountLocked();
}
@When("I simulate a slow network connection")
public void i_simulate_a_slow_network_connection() {
loginScreenforRecruitersPage.simulateSlowNetwork();
}
@Then("the user should remain on the dashboard")
public void the_user_should_remain_on_the_dashboard() {
"User is not on the dashboard", loginScreenforRecruitersPage.isDashboardDisplayed();
}
@When("the user clicks on the 'Forgot Password?' link")
public void the_user_clicks_on_the_forgot_password_link() {
loginScreenforRecruitersPage.clickForgotPassword();
}
@Then("the password reset screen is displayed")
public void the_password_reset_screen_is_displayed() {
"Password reset screen is not displayed", loginScreenforRecruitersPage.isPasswordResetScreenDisplayed();
}
@When("the user enters a valid email ID {string}")
public void the_user_enters_a_valid_email_id(String email) {
loginScreenforRecruitersPage.enterEmail(email);
}
@When("the user clicks the 'Send Reset Link' button")
public void the_user_clicks_the_send_reset_link_button() {
loginScreenforRecruitersPage.clickSendResetLink();
}
@Then("a success message is displayed")
public void a_success_message_is_displayed() {
"Success message is not displayed", loginScreenforRecruitersPage.isSuccessMessageDisplayed();
}
@When("the user attempts to use an invalid reset link")
public void the_user_attempts_to_use_an_invalid_reset_link() {
loginScreenforRecruitersPage.useInvalidResetLink();
}
@Then("an error message indicating the link is invalid is displayed")
public void an_error_message_indicating_the_link_is_invalid_is_displayed() {
"Invalid link error message is not displayed", loginScreenforRecruitersPage.isInvalidLinkErrorDisplayed();
}
@When("the user attempts to use the same reset link again")
public void the_user_attempts_to_use_the_same_reset_link_again() {
loginScreenforRecruitersPage.useSameResetLinkAgain();
}
@Then("an error message is displayed")
public void an_error_message_is_displayed() {
"Error message is not displayed", loginScreenforRecruitersPage.isErrorMessageDisplayed();
}

@Given("I navigate to the login screen")
public void i_navigate_to_the_login_screen() {
loginScreenforRecruitersPage.navigateToLoginScreen();
}
@Given("the user leaves the password field empty")
public void the_user_leaves_the_password_field_empty() {
loginScreenforRecruitersPage.leavePasswordFieldEmpty();
}
@Then("the second tab should remain on the login screen")
public void the_second_tab_should_remain_on_the_login_screen() {
loginScreenforRecruitersPage.isSecondTabOnLoginScreen();
}
@Then("the account should be locked")
public void the_account_should_be_locked() {
loginScreenforRecruitersPage.isAccountLocked();
}
@Then("the system processes the request without errors")
public void the_system_processes_the_request_without_errors() {
loginScreenforRecruitersPage.isRequestProcessedWithoutErrors();
}
@Then("an error message 'incorrect email id or password.' is displayed")
public void an_error_message_incorrect_email_id_or_password_is_displayed() {
Assert.assertEquals("incorrect email id or password.", loginScreenforRecruitersPage.getErrorMessage());
}
@When("i attempt to access the dashboard")
public void i_attempt_to_access_the_dashboard() {
loginScreenforRecruitersPage.attemptToAccessDashboard();
}
@When("i refresh the browser")
public void i_refresh_the_browser() {
loginScreenforRecruitersPage.refreshBrowser();
}
@Given("i open the application in {string}")
public void i_open_the_application_in(String url) {
loginScreenforRecruitersPage.openApplication(url);
}
@Then("the dashboard should be displayed in {string}")
public void the_dashboard_should_be_displayed_in(String browser) {
loginScreenforRecruitersPage.isDashboardDisplayed(browser);
}
@Then("the user waits for the system to process the login request")
public void the_user_waits_for_the_system_to_process_the_login_request() {
loginScreenforRecruitersPage.waitForLoginRequestToProcess();
}
@When("the user logs out")
public void the_user_logs_out() {
loginScreenforRecruitersPage.logout();
}
@Then("the dashboard is displayed")
public void the_dashboard_is_displayed() {
loginScreenforRecruitersPage.isDashboardDisplayed();
}
@When("i enter a valid password {string}")
public void i_enter_a_valid_password(String validPassword) {
loginScreenforRecruitersPage.enterValidPassword(validPassword);
}
@When("i use the tab key to focus on the email id field")
public void i_use_the_tab_key_to_focus_on_the_email_id_field() {
loginScreenforRecruitersPage.focusOnEmailIdFieldUsingTab();
}
@When("the user enters {string} in the password field")
public void the_user_enters_in_the_password_field(String password) {
loginScreenforRecruitersPage.enterPassword(password);
}
@When("i enter {string} in the password field using the keyboard")
public void i_enter_in_the_password_field_using_the_keyboard(String password) {
loginScreenforRecruitersPage.enterPasswordUsingKeyboard(password);
}
@Then("the user should see an error message indicating the link has expired")
public void the_user_should_see_an_error_message_indicating_the_link_has_expired() {
loginScreenforRecruitersPage.isLinkExpiredErrorMessageDisplayed();
}
@Then("a success message is displayed confirming the reset link has been sent")
public void a_success_message_is_displayed_confirming_the_reset_link_has_been_sent() {
loginScreenforRecruitersPage.isResetLinkSentSuccessMessageDisplayed();
}
@Then("the system processes the login request")
public void the_system_processes_the_login_request() {
loginScreenforRecruitersPage.isLoginRequestProcessed();
}
@Then("the user should be prompted to change their password")
public void the_user_should_be_prompted_to_change_their_password() {
loginScreenforRecruitersPage.isPromptedToChangePassword();
}
@Then("a password hint is displayed")
public void a_password_hint_is_displayed() {
loginScreenforRecruitersPage.isPasswordHintDisplayed();
}
@Then("the dashboard should be displayed on the mobile device")
public void the_dashboard_should_be_displayed_on_the_mobile_device() {
loginScreenforRecruitersPage.isDashboardDisplayedOnMobile();
}
@When("i repeat the login attempt for a total of 5 times")
public void i_repeat_the_login_attempt_for_a_total_of_5_times() {
loginScreenforRecruitersPage.repeatLoginAttempt(5);
}
@When("the user sets a new password")
public void the_user_sets_a_new_password() {
loginScreenforRecruitersPage.setNewPassword();
}
@When("i enter a valid password in the password field as {string}")
public void i_enter_a_valid_password_in_the_password_field_as(String validPassword) {
loginScreenforRecruitersPage.enterValidPassword(validPassword);
}
@When("i enter a valid email id {string} in the email id field using the keyboard")
public void i_enter_a_valid_email_id_in_the_email_id_field_using_the_keyboard(String email) {
loginScreenforRecruitersPage.enterEmailIdUsingKeyboard(email);
}
@When("the user enters a valid password {string}")
public void the_user_enters_a_valid_password(String validPassword) {
loginScreenforRecruitersPage.enterValidPassword(validPassword);
}
@When("i clickElement the show password option")
public void i_click_the_show_password_option() {
loginScreenforRecruitersPage.clickShowPasswordOption();
}
@When("the user attempts to use the reset link after the expiration period")
public void the_user_attempts_to_use_the_reset_link_after_the_expiration_period() {
loginScreenforRecruitersPage.attemptToUseExpiredResetLink();
}
@When("the user checks the email for a confirmation message")
public void the_user_checks_the_email_for_a_confirmation_message() {
loginScreenforRecruitersPage.checkEmailForConfirmationMessage();
}
@When("the user uses the reset link to change the password")
public void the_user_uses_the_reset_link_to_change_the_password() {
loginScreenforRecruitersPage.useResetLinkToChangePassword();
}
@When("i clickElement the 'login' button using the keyboard")
public void i_click_the_login_button_using_the_keyboard() {
loginScreenforRecruitersPage.clickLoginButtonUsingKeyboard();
}
@When("i press enter to clickElement the 'login' button")
public void i_press_enter_to_click_the_login_button() {
loginScreenforRecruitersPage.pressEnterToClickLoginButton();
}
@When("i enter {string} in the email id field using the keyboard")
public void i_enter_in_the_email_id_field_using_the_keyboard(String email) {
loginScreenforRecruitersPage.enterEmailIdUsingKeyboard(email);
}
@Then("the user should be redirected to the login screen")
public void the_user_should_be_redirected_to_the_login_screen() {
loginScreenforRecruitersPage.isRedirectedToLoginScreen();
}
@When("the user selects the option to recover using security questions")
public void the_user_selects_the_option_to_recover_using_security_questions() {
loginScreenforRecruitersPage.selectRecoverUsingSecurityQuestions();
}
@Then("the dashboard is displayed in firefox")
public void the_dashboard_is_displayed_in_firefox() {
loginScreenforRecruitersPage.isDashboardDisplayedInFirefox();
}
@When("the user changes the password using the link sent to the email")
public void the_user_changes_the_password_using_the_link_sent_to_the_email() {
loginScreenforRecruitersPage.changePasswordUsingEmailLink();
}
@When("i enter a valid email id in the email id field as {string}")
public void i_enter_a_valid_email_id_in_the_email_id_field_as(String email) {
loginScreenforRecruitersPage.enterValidEmailId(email);
}
@Then("the dashboard should be displayed after a delay")
public void the_dashboard_should_be_displayed_after_a_delay() {
loginScreenforRecruitersPage.isDashboardDisplayedAfterDelay();
}
@When("the user returns to the login screen")
public void the_user_returns_to_the_login_screen() {
loginScreenforRecruitersPage.returnToLoginScreen();
}
@When("the user enters a valid email id in the email id field {string}")
public void the_user_enters_a_valid_email_id_in_the_email_id_field(String email) {
loginScreenforRecruitersPage.enterValidEmailId(email);
}
@Then("the user should see a notification confirming the password change")
public void the_user_should_see_a_notification_confirming_the_password_change() {
loginScreenforRecruitersPage.isPasswordChangeNotificationDisplayed();
}
@Then("the email id field is empty")
public void the_email_id_field_is_empty() {
loginScreenforRecruitersPage.isEmailIdFieldEmpty();
}
@When("the user enters wrongpassword in the password field")
public void the_user_enters_wrongpassword_in_the_password_field() {
loginScreenforRecruitersPage.enterWrongPassword();
}
@When("the user clicks the 'login' button in the first tab")
public void the_user_clicks_the_login_button_in_the_first_tab() {
loginScreenforRecruitersPage.clickLoginButtonInFirstTab();
}
@Then("the user should be logged in successfully")
public void the_user_should_be_logged_in_successfully() {
loginScreenforRecruitersPage.isLoggedInSuccessfully();
}
@Then("the user is prompted to change their password")
public void the_user_is_prompted_to_change_their_password() {
loginScreenforRecruitersPage.isPromptedToChangePassword();
}
@When("the user logs in with the new password")
public void the_user_logs_in_with_the_new_password() {
loginScreenforRecruitersPage.loginWithNewPassword();
}
@When("the user logs out returns to the login screen")
public void the_user_logs_out_returns_to_the_login_screen() {
loginScreenforRecruitersPage.logoutAndReturnToLoginScreen();
}
@When("the user enters {string}")
public void the_user_enters(String input) {
loginScreenforRecruitersPage.enterInput(input);
}
@Then("the user verifies that the confirmation message is received")
public void the_user_verifies_that_the_confirmation_message_is_received() {
loginScreenforRecruitersPage.isConfirmationMessageReceived();
}
@When("i enter an xss attempt {string}")
public void i_enter_an_xss_attempt(String xssAttempt) {
loginScreenforRecruitersPage.enterXSSAttempt(xssAttempt);
}
@Then("the dashboard is displayed in chrome")
public void the_dashboard_is_displayed_in_chrome() {
loginScreenforRecruitersPage.isDashboardDisplayedInChrome();
}
@When("the user enters krishna@gmail.com in the email id field")
public void the_user_enters_krishna_gmail_com_in_the_email_id_field() {
loginScreenforRecruitersPage.enterEmailId("krishna@gmail.com");
}
@When("i enter {string} in the email id field")
public void i_enter_in_the_email_id_field(String email) {
loginScreenforRecruitersPage.enterEmailId(email);
}
@Then("the account should be locked after the 5th attempt")
public void the_account_should_be_locked_after_the_5th_attempt() {
loginScreenforRecruitersPage.isAccountLockedAfterAttempts(5);
}
@When("the user answers the security questions correctly")
public void the_user_answers_the_security_questions_correctly() {
loginScreenforRecruitersPage.answerSecurityQuestionsCorrectly();
}
@Then("the screen reader reads the labels for email id password fields")
public void the_screen_reader_reads_the_labels_for_email_id_password_fields() {
loginScreenforRecruitersPage.isScreenReaderReadingLabels();
}
@When("i enter a valid password {string} in the password field using the keyboard")
public void i_enter_a_valid_password_in_the_password_field_using_the_keyboard(String validPassword) {
loginScreenforRecruitersPage.enterValidPasswordUsingKeyboard(validPassword);
}
@Then("the system should display an error message for each failed attempt")
public void the_system_should_display_an_error_message_for_each_failed_attempt() {
loginScreenforRecruitersPage.isErrorMessageDisplayedForFailedAttempts();
}
@Then("the dashboard is displayed successfully")
public void the_dashboard_is_displayed_successfully() {
loginScreenforRecruitersPage.isDashboardDisplayedSuccessfully();
}
@Then("the 'remember me' option is unchecked")
public void the_remember_me_option_is_unchecked() {
loginScreenforRecruitersPage.isRememberMeChecked();
}
@When("i enter a valid email id {string}")
public void i_enter_a_valid_email_id(String email) {
loginScreenforRecruitersPage.enterValidEmailId(email);
}
@Then("the user should be directed to the dashboard after a delay")
public void the_user_should_be_directed_to_the_dashboard_after_a_delay() {
loginScreenforRecruitersPage.isDirectedToDashboardAfterDelay();
}
@Then("the system processes the request")
public void the_system_processes_the_request() {
loginScreenforRecruitersPage.isRequestProcessed();
}
@When("i use a screen reader to read the labels for email id password fields")
public void i_use_a_screen_reader_to_read_the_labels_for_email_id_password_fields() {
loginScreenforRecruitersPage.useScreenReaderToReadLabels();
}
@Then("an error message indicating the link has expired is displayed")
public void an_error_message_indicating_the_link_has_expired_is_displayed() {
loginScreenforRecruitersPage.isLinkExpiredErrorMessageDisplayed();
}
@When("i clickElement the hide password option")
public void i_click_the_hide_password_option() {
loginScreenforRecruitersPage.clickHidePasswordOption();
}
@When("the user enters {string} in the reset field")
public void the_user_enters_in_the_reset_field(String resetInput) {
loginScreenforRecruitersPage.enterResetField(resetInput);
}
@Then("the system should display an appropriate message")
public void the_system_should_display_an_appropriate_message() {
loginScreenforRecruitersPage.isAppropriateMessageDisplayed();
}
@When("i simulate a session timeout")
public void i_simulate_a_session_timeout() {
loginScreenforRecruitersPage.simulateSessionTimeout();
}
@When("i use the tab key to focus on the 'login' button")
public void i_use_the_tab_key_to_focus_on_the_login_button() {
loginScreenforRecruitersPage.focusOnLoginButtonUsingTab();
}
}