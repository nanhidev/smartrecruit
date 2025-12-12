package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
public class LoginScreenforRecruiters extends DriverFactory {
private LoginScreenforRecruitersPage loginPage;
public LoginScreenforRecruiters() {
this.loginPage = new LoginScreenforRecruitersPage();
}
@Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
loginPage.navigateToLoginScreen();
}
@When("I enter {string}")
public void i_enter(String emailID) {
loginPage.enterEmail(emailID);
}
@When("I enter {string} in the Password field")
public void i_enter_in_the_password_field(String password) {
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
"Dashboard is not displayed", loginPage.isDashboardDisplayed();
}
@Then("the Login button should be enabled")
public void the_login_button_should_be_enabled() {
"Login button is not enabled", loginPage.isLoginButtonEnabled();
}
@When("I click the 'Show Password' option")
public void i_click_the_show_password_option() {
loginPage.clickShowPassword();
}
@Then("the password should be visible")
public void the_password_should_be_visible() {
"Password is not visible", loginPage.isPasswordVisible();
}
@When("I click the 'Hide Password' option")
public void i_click_the_hide_password_option() {
loginPage.clickHidePassword();
}
@Then("the password should be hidden")
public void the_password_should_be_hidden() {
"Password is still visible", loginPage.isPasswordVisible();
}
@Then("an error message {string} is displayed")
public void an_error_message_is_displayed(String errorMessage) {
Assert.assertEquals("Error message is not as expected", errorMessage, loginPage.getErrorMessage());
}
@When("the user checks the 'Remember Me' option")
public void the_user_checks_the_remember_me_option() {
loginPage.checkRememberMe();
}
@Then("the email ID should be pre-filled in the Email ID field")
public void the_email_id_should_be_pre_filled_in_the_email_id_field() {
Assert.assertEquals("Email ID is not pre-filled", "krishna@gmail.com", loginPage.getEmailFieldValue());
}
@When("the user logs out and returns to the login screen")
public void the_user_logs_out_and_returns_to_the_login_screen() {
loginPage.logout();
loginPage.navigateToLoginScreen();
}
@Then("the email ID field should be empty")
public void the_email_id_field_should_be_empty() {
"Email ID field is not empty", loginPage.getEmailFieldValue().isEmpty();
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
"Account is not locked after " + attempt + " attempts", loginPage.isAccountLocked();
}
@When("I simulate a slow network connection")
public void i_simulate_a_slow_network_connection() {
loginPage.simulateSlowNetwork();
}
@Then("the user should remain on the dashboard")
public void the_user_should_remain_on_the_dashboard() {
"User is not on the dashboard", loginPage.isDashboardDisplayed();
}
@When("I enter a valid email ID {string} in the Email ID field")
public void i_enter_a_valid_email_id_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
@When("I enter a valid password in the Password field as {string}")
public void i_enter_a_valid_password_in_the_password_field_as(String password) {
loginPage.enterPassword(password);
}
@When("I attempt to access the dashboard")
public void i_attempt_to_access_the_dashboard() {
loginPage.accessDashboard();
}
@Then("the user should be redirected to the login screen")
public void the_user_should_be_redirected_to_the_login_screen() {
"User is not redirected to the login screen", loginPage.isLoginScreenDisplayed();
}
@When("I enter {string} in the Email ID field")
public void i_enter_in_the_email_id_field(String email) {
loginPage.enterEmail(email);
}
//    @When("I enter {string} in the Password field")
@When("I simulate a session timeout")
public void i_simulate_a_session_timeout() {
loginPage.simulateSessionTimeout();
}
@When("I refresh the browser")
public void i_refresh_the_browser() {
loginPage.refreshBrowser();
}
//    @Then("the user should remain on the dashboard")
@When("the user clicks on the 'Forgot Password?' link")
public void the_user_clicks_on_the_forgot_password_link() {
loginPage.clickForgotPassword();
}
@Then("the password reset screen is displayed")
public void the_password_reset_screen_is_displayed() {
"Password reset screen is not displayed", loginPage.isPasswordResetScreenDisplayed();
}
@When("the user enters a valid email ID {string} in the reset field")
public void the_user_enters_a_valid_email_id_in_the_reset_field(String email) {
loginPage.enterResetEmail(email);
}
@When("the user clicks the 'Send Reset Link' button")
public void the_user_clicks_the_send_reset_link_button() {
loginPage.clickSendResetLink();
}
@Then("a success message is displayed")
public void a_success_message_is_displayed() {
"Success message is not displayed", loginPage.isSuccessMessageDisplayed();
}
@When("the user attempts to use an invalid reset link")
public void the_user_attempts_to_use_an_invalid_reset_link() {
loginPage.useInvalidResetLink();
}
@Then("an error message indicating the link is invalid is displayed")
public void an_error_message_indicating_the_link_is_invalid_is_displayed() {
"Error message for invalid link is not displayed", loginPage.isInvalidLinkErrorDisplayed();
}
@When("the user attempts to use the reset link after the expiration period")
public void the_user_attempts_to_use_the_reset_link_after_the_expiration_period() {
loginPage.useExpiredResetLink();
}
@Then("an error message indicating the link has expired is displayed")
public void an_error_message_indicating_the_link_has_expired_is_displayed() {
"Error message for expired link is not displayed", loginPage.isExpiredLinkErrorDisplayed();
}
@When("the user uses the reset link to change the password")
public void the_user_uses_the_reset_link_to_change_the_password() {
loginPage.changePasswordUsingResetLink();
}
@Then("the user should see a notification confirming the password change")
public void the_user_should_see_a_notification_confirming_the_password_change() {
"Password change notification is not displayed", loginPage.isPasswordChangeNotificationDisplayed();
}
@When("the user enters {string} in the reset field")
public void the_user_enters_in_the_reset_field(String email) {
loginPage.enterResetEmail(email);
}
@Then("the user verifies that the confirmation message is received")
public void the_user_verifies_that_the_confirmation_message_is_received() {
"Confirmation message is not received", loginPage.isConfirmationMessageReceived();
}
@When("the user attempts to use the same reset link again")
public void the_user_attempts_to_use_the_same_reset_link_again() {
loginPage.useSameResetLinkAgain();
}
@Then("an error message is displayed")
public void an_error_message_is_displayed() {
"Error message is not displayed", loginPage.isErrorMessageDisplayed();
}

public LoginScreenforRecruiters() {
this.loginPage = new LoginScreenforRecruitersPage();
}
@Given("the user sets a new password")
public void theUserSetsANewPassword() {
// Implementation logic to set a new password
}
@Given("the email id field is empty")
public void theEmailIdFieldIsEmpty() {
"Email ID field should be empty", loginPage.isEmailIdFieldEmpty();
}
@Then("an error message 'incorrect email id or password.' is displayed")
public void anErrorMessageIsDisplayed() {
String errorMessage = loginPage.getErrorMessage();
Assert.assertEquals("incorrect email id or password.", errorMessage);
}
@Given("the user checks the email for a confirmation message")
public void theUserChecksTheEmailForAConfirmationMessage() {
// Implementation logic to check email for confirmation message
}
@Then("the dashboard is displayed in chrome")
public void theDashboardIsDisplayedInChrome() {
"Dashboard should be displayed", loginPage.isDashboardDisplayed();
}
@Given("the user enters a valid email id {string}")
public void theUserEntersAValidEmailId(String email) {
loginPage.enterEmailId(email);
}
@When("the user clicks the 'login' button")
public void theUserClicksTheLoginButton() {
loginPage.clicksLoginButton();
}
@When("I use the tab key to focus on the 'login' button")
public void iUseTheTabKeyToFocusOnTheLoginButton() {
loginPage.focusOnLoginButtonUsingTab();
}
@When("I clickElement the hide password option")
public void iClickTheHidePasswordOption() {
loginPage.clicksHidePasswordOption();
}
@Then("the user should see an error message indicating the link has expired")
public void theUserShouldSeeAnErrorMessageIndicatingTheLinkHasExpired() {
String errorMessage = loginPage.getLinkExpiredErrorMessage();
Assert.assertEquals("The link has expired.", errorMessage);
}
@Given("I enter a valid password {string}")
public void iEnterAValidPassword(String password) {
loginPage.enterPassword(password);
}
@Then("the second tab should remain on the login screen")
public void theSecondTabShouldRemainOnTheLoginScreen() {
"Second tab should remain on login screen", loginPage.isSecondTabOnLoginScreen();
}
@Then("the dashboard should be displayed on the mobile device")
public void theDashboardShouldBeDisplayedOnTheMobileDevice() {
"Dashboard should be displayed on mobile device", loginPage.isDashboardDisplayedOnMobile();
}
@Given("I open the application in {string}")
public void iOpenTheApplicationIn(String browser) {
// Implementation logic to open application in specified browser
}
@Then("the system processes the request")
public void theSystemProcessesTheRequest() {
// Implementation logic to process the request
}
@When("I use a screen reader to read the labels for email id password fields")
public void iUseAScreenReaderToReadTheLabelsForEmailIdPasswordFields() {
// Implementation logic to use screen reader
}
@Then("the dashboard is displayed in the first tab")
public void theDashboardIsDisplayedInTheFirstTab() {
"Dashboard should be displayed in the first tab", loginPage.isDashboardDisplayedInFirstTab();
}
@Given("the user enters a valid email id in the email id field {string}")
public void theUserEntersAValidEmailIdInTheEmailIdField(String email) {
loginPage.enterEmailId(email);
}
@Then("the user waits for the system to process the login request")
public void theUserWaitsForTheSystemToProcessTheLoginRequest() {
// Implementation logic to wait for system to process login request
}
@Given("the user enters a valid password in the password field {string}")
public void theUserEntersAValidPasswordInThePasswordField(String password) {
loginPage.enterPassword(password);
}
@Then("the dashboard should be displayed in {string}")
public void theDashboardShouldBeDisplayedIn(String browser) {
"Dashboard should be displayed in " + browser, loginPage.isDashboardDisplayedInBrowser(browser);
}
@When("the user clicks the 'login' button in the first tab")
public void theUserClicksTheLoginButtonInTheFirstTab() {
loginPage.clicksLoginButtonInFirstTab();
}
@Then("the dashboard is displayed in firefox")
public void theDashboardIsDisplayedInFirefox() {
"Dashboard should be displayed in Firefox", loginPage.isDashboardDisplayedInFirefox();
}
@Given("the user enters krishna@gmail.com in the email id field")
public void theUserEntersKrishnaGmailComInTheEmailIdField() {
loginPage.enterEmailId("krishna@gmail.com");
}
@Then("the system processes the login request")
public void theSystemProcessesTheLoginRequest() {
// Implementation logic to process the login request
}
@Then("the user is prompted to change their password")
public void theUserIsPromptedToChangeTheirPassword() {
"User should be prompted to change password", loginPage.isPromptedToChangePassword();
}
@Then("the second tab remains on the login screen")
public void theSecondTabRemainsOnTheLoginScreen() {
"Second tab should remain on login screen", loginPage.isSecondTabOnLoginScreen();
}
@Given("I enter an xss attempt {string}")
public void iEnterAnXssAttempt(String xssAttempt) {
loginPage.enterXSSAttempt(xssAttempt);
}
@Then("the dashboard is displayed successfully")
public void theDashboardIsDisplayedSuccessfully() {
"Dashboard should be displayed successfully", loginPage.isDashboardDisplayedSuccessfully();
}
@Then("the user should be logged in successfully")
public void theUserShouldBeLoggedInSuccessfully() {
"User should be logged in successfully", loginPage.isUserLoggedInSuccessfully();
}
@Given("I enter a valid email id {string} in the email id field using the keyboard")
public void iEnterAValidEmailIdInTheEmailIdFieldUsingTheKeyboard(String email) {
loginPage.enterEmailIdUsingKeyboard(email);
}
@When("I press enter to clickElement the 'login' button")
public void iPressEnterToClickTheLoginButton() {
loginPage.pressEnterOnLoginButton();
}
@Then("the system processes the request without errors")
public void theSystemProcessesTheRequestWithoutErrors() {
// Implementation logic to ensure request is processed without errors
}
@When("I clickElement the 'login' button using the keyboard")
public void iClickTheLoginButtonUsingTheKeyboard() {
loginPage.clicksLoginButtonUsingKeyboard();
}
@Given("the user enters wrongpassword in the password field")
public void theUserEntersWrongPasswordInThePasswordField() {
loginPage.enterPassword("wrongpassword");
}
@When("I clickElement the show password option")
public void iClickTheShowPasswordOption() {
loginPage.clicksShowPasswordOption();
}
@When("the user changes the password using the link sent to the email")
public void theUserChangesThePasswordUsingTheLinkSentToTheEmail() {
// Implementation logic to change password using email link
}
@Then("a success message is displayed confirming the reset link has been sent")
public void aSuccessMessageIsDisplayedConfirmingTheResetLinkHasBeenSent() {
String successMessage = loginPage.getResetLinkSuccessMessage();
Assert.assertEquals("Reset link has been sent successfully.", successMessage);
}
@Then("the system processes the login request without errors")
public void theSystemProcessesTheLoginRequestWithoutErrors() {
// Implementation logic to ensure login request is processed without errors
}
@Then("the user should be prompted to change their password")
public void theUserShouldBePromptedToChangeTheirPassword() {
"User should be prompted to change password", loginPage.isPromptedToChangePassword();
}
@Then("the dashboard is displayed")
public void theDashboardIsDisplayed() {
"Dashboard should be displayed", loginPage.isDashboardDisplayed();
}
@Then("the user should be directed to the dashboard after a delay")
public void theUserShouldBeDirectedToTheDashboardAfterADelay() {
// Implementation logic to ensure user is directed to dashboard after delay
}
@Then("the account should be locked after the 5th attempt")
public void theAccountShouldBeLockedAfterThe5thAttempt() {
"Account should be locked after 5 attempts", loginPage.isAccountLocked();
}
@Given("the user enters {string}")
public void theUserEnters(String input) {
loginPage.enterInput(input);
}
@Then("the system should display an error message for each failed attempt")
public void theSystemShouldDisplayAnErrorMessageForEachFailedAttempt() {
"Error message should be displayed for each failed attempt", loginPage.isErrorMessageDisplayed();
}
@When("I use the tab key to focus on the email id field")
public void iUseTheTabKeyToFocusOnTheEmailIdField() {
loginPage.focusOnEmailIdFieldUsingTab();
}
@Then("the account should be locked")
public void theAccountShouldBeLocked() {
"Account should be locked", loginPage.isAccountLocked();
}
@When("the screen reader reads the labels for email id password fields")
public void theScreenReaderReadsTheLabelsForEmailIdPasswordFields() {
// Implementation logic to read labels using screen reader
}
@Then("the user waits for the system to process the request")
public void theUserWaitsForTheSystemToProcessTheRequest() {
// Implementation logic to wait for system to process request
}
@Then("the system should display an appropriate message")
public void theSystemShouldDisplayAnAppropriateMessage() {
String message = loginPage.getAppropriateMessage();
Assert.assertNotNull("Appropriate message should be displayed", message);
}
@Given("I enter a valid email id in the email id field as {string}")
public void iEnterAValidEmailIdInTheEmailIdFieldAs(String email) {
loginPage.enterEmailId(email);
}
@Then("the dashboard should be displayed in the first tab")
public void theDashboardShouldBeDisplayedInTheFirstTab() {
"Dashboard should be displayed in the first tab", loginPage.isDashboardDisplayedInFirstTab();
}
@Given("the user leaves the password field empty")
public void theUserLeavesThePasswordFieldEmpty() {
loginPage.leavePasswordFieldEmpty();
}
@Given("the user enters {string} in the password field")
public void theUserEntersInThePasswordField(String password) {
loginPage.enterPassword(password);
}
@Then("a password hint is displayed")
public void aPasswordHintIsDisplayed() {
"Password hint should be displayed", loginPage.isPasswordHintDisplayed();
}
@Then("the dashboard should be displayed after a delay")
public void theDashboardShouldBeDisplayedAfterADelay() {
// Implementation logic to ensure dashboard is displayed after a delay
}
@Given("I enter a valid password {string} in the password field using the keyboard")
public void iEnterAValidPasswordInThePasswordFieldUsingTheKeyboard(String password) {
loginPage.enterPasswordUsingKeyboard(password);
}
@Then("the user returns to the login screen")
public void theUserReturnsToTheLoginScreen() {
"User should return to login screen", loginPage.isOnLoginScreen();
}
@Then("the system should process the login request")
public void theSystemShouldProcessTheLoginRequest() {
// Implementation logic to process the login request
}
@Given("I enter {string} in the password field using the keyboard")
public void iEnterInThePasswordFieldUsingTheKeyboard(String password) {
loginPage.enterPasswordUsingKeyboard(password);
}
@When("I use the tab key to focus on the password field")
public void iUseTheTabKeyToFocusOnThePasswordField() {
loginPage.focusOnPasswordFieldUsingTab();
}
@Given("the user enters a valid password {string}")
public void theUserEntersAValidPassword(String password) {
loginPage.enterPassword(password);
}
@When("the user logs in with the new password")
public void theUserLogsInWithTheNewPassword() {
// Implementation logic to log in with the new password
}
@When("the user selects the option to recover using security questions")
public void theUserSelectsTheOptionToRecoverUsingSecurityQuestions() {
// Implementation logic to select recovery option
}
@Then("I repeat the login attempt for a total of 5 times")
public void iRepeatTheLoginAttemptForATotalOfFiveTimes() {
// Implementation logic to repeat login attempts
}
@When("the user logs out")
public void theUserLogsOut() {
loginPage.clicksLogoutButton();
}
@When("I navigate to the login screen")
public void iNavigateToTheLoginScreen() {
loginPage.navigateToLoginScreen();
}
@Given("I enter {string} in the email id field using the keyboard")
public void iEnterInTheEmailIdFieldUsingTheKeyboard(String email) {
loginPage.enterEmailIdUsingKeyboard(email);
}
@Then("the 'remember me' option is unchecked")
public void theRememberMeOptionIsUnchecked() {
"Remember me option should be unchecked", loginPage.isRememberMeChecked();
}
@When("the user answers the security questions correctly")
public void theUserAnswersTheSecurityQuestionsCorrectly() {
// Implementation logic to answer security questions
}
@Given("I enter a valid email id {string}")
public void iEnterAValidEmailId(String email) {
loginPage.enterEmailId(email);
}
}