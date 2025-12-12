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
"Password is not hidden", loginPage.isPasswordHidden();
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
"Account is not locked", loginPage.isAccountLocked();
}
@When("I simulate a slow network connection")
public void i_simulate_a_slow_network_connection() {
loginPage.simulateSlowNetwork();
}
@Then("the user should remain on the dashboard")
public void the_user_should_remain_on_the_dashboard() {
"User is not on the dashboard", loginPage.isUserOnDashboard();
}
@When("the user clicks on the 'Forgot Password?' link")
public void the_user_clicks_on_the_forgot_password_link() {
loginPage.clickForgotPassword();
}
@Then("the password reset screen is displayed")
public void the_password_reset_screen_is_displayed() {
"Password reset screen is not displayed", loginPage.isPasswordResetScreenDisplayed();
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
"Success message is not displayed", loginPage.isSuccessMessageDisplayed();
}
@When("the user attempts to use an invalid reset link")
public void the_user_attempts_to_use_an_invalid_reset_link() {
loginPage.useInvalidResetLink();
}
@Then("an error message indicating the link is invalid is displayed")
public void an_error_message_indicating_the_link_is_invalid_is_displayed() {
"Invalid link error message is not displayed", loginPage.isInvalidLinkErrorDisplayed();
}
@When("the user attempts to use the reset link after the expiration period")
public void the_user_attempts_to_use_the_reset_link_after_the_expiration_period() {
loginPage.useExpiredResetLink();
}
@Then("an error message indicating the link has expired is displayed")
public void an_error_message_indicating_the_link_has_expired_is_displayed() {
"Expired link error message is not displayed", loginPage.isExpiredLinkErrorDisplayed();
}
@When("the user enters {string} in the reset field")
public void the_user_enters_in_the_reset_field(String email) {
loginPage.enterResetEmail(email);
}
@When("the user waits for the system to process the request")
public void the_user_waits_for_the_system_to_process_the_request() {
loginPage.waitForRequestProcessing();
}
@Then("the user should see a notification confirming the password change")
public void the_user_should_see_a_notification_confirming_the_password_change() {
"Password change notification is not displayed", loginPage.isPasswordChangeNotificationDisplayed();
}

public LoginScreenforRecruiters() {
this.loginPage = new LoginScreenforRecruitersPage();
}
@Given("the user enters wrongpassword in the password field")
public void theUserEntersWrongPasswordInThePasswordField() {
loginPage.enterPassword("wrongpassword");
}
@When("i use the tab key to focus on the password field")
public void iUseTheTabKeyToFocusOnThePasswordField() {
loginPage.focusOnPasswordField();
}
@When("the user logs out returns to the login screen")
public void theUserLogsOutReturnsToTheLoginScreen() {
loginPage.logout();
}
@Then("the account should be locked")
public void theAccountShouldBeLocked() {
loginPage.isAccountLocked();
}
@Then("the dashboard should be displayed on the mobile device")
public void theDashboardShouldBeDisplayedOnTheMobileDevice() {
loginPage.isDashboardDisplayedOnMobile();
}
@Then("the dashboard is displayed in firefox")
public void theDashboardIsDisplayedInFirefox() {
loginPage.isDashboardDisplayedInBrowser("firefox");
}
@When("the system processes the login request")
public void theSystemProcessesTheLoginRequest() {
loginPage.processLoginRequest();
}
@Given("i enter {string} in the email id field")
public void iEnterInTheEmailIdField(String email) {
loginPage.enterEmail(email);
}
@Then("the dashboard should be displayed after a delay")
public void theDashboardShouldBeDisplayedAfterADelay() {
loginPage.isDashboardDisplayedAfterDelay();
}
@Then("the user should be redirected to the login screen")
public void theUserShouldBeRedirectedToTheLoginScreen() {
loginPage.isRedirectedToLoginScreen();
}
@Given("the 'remember me' option is unchecked")
public void theRememberMeOptionIsUnchecked() {
loginPage.uncheckRememberMe();
}
@Given("i enter a valid password {string} in the password field using the keyboard")
public void iEnterAValidPasswordInThePasswordFieldUsingTheKeyboard(String password) {
loginPage.enterPassword(password);
}
@Given("i enter an xss attempt {string}")
public void iEnterAnXSSAttempt(String xssAttempt) {
loginPage.enterXSSAttempt(xssAttempt);
}
@Then("the dashboard is displayed")
public void theDashboardIsDisplayed() {
loginPage.isDashboardDisplayed();
}
@Then("the user should be logged in successfully")
public void theUserShouldBeLoggedInSuccessfully() {
loginPage.isUserLoggedIn();
}
@Given("i enter a valid email id {string}")
public void iEnterAValidEmailId(String email) {
loginPage.enterEmail(email);
}
@Given("the user enters a valid password {string}")
public void theUserEntersAValidPassword(String password) {
loginPage.enterPassword(password);
}
@When("the user changes the password using the link sent to the email")
public void theUserChangesThePasswordUsingTheLinkSentToTheEmail() {
loginPage.changePasswordUsingEmailLink();
}
@Then("the second tab remains on the login screen")
public void theSecondTabRemainsOnTheLoginScreen() {
loginPage.isSecondTabOnLoginScreen();
}
@Given("the user enters {string}")
public void theUserEnters(String input) {
loginPage.enterInput(input);
}
@Given("the user enters a valid password in the password field {string}")
public void theUserEntersAValidPasswordInThePasswordField(String password) {
loginPage.enterPassword(password);
}
@Given("the user leaves the password field empty")
public void theUserLeavesThePasswordFieldEmpty() {
loginPage.leavePasswordFieldEmpty();
}
@When("i use the tab key to focus on the email id field")
public void iUseTheTabKeyToFocusOnTheEmailIdField() {
loginPage.focusOnEmailField();
}
@When("i navigate to the login screen")
public void iNavigateToTheLoginScreen() {
loginPage.navigateToLoginScreen();
}
@When("i use the tab key to focus on the 'login' button")
public void iUseTheTabKeyToFocusOnTheLoginButton() {
loginPage.focusOnLoginButton();
}
@When("i use a screen reader to read the labels for email id password fields")
public void iUseAScreenReaderToReadTheLabelsForEmailIdPasswordFields() {
loginPage.readLabelsWithScreenReader();
}
@When("i attempt to access the dashboard")
public void iAttemptToAccessTheDashboard() {
loginPage.attemptToAccessDashboard();
}
@Given("i enter a valid email id in the email id field as {string}")
public void iEnterAValidEmailIdInTheEmailIdFieldAs(String email) {
loginPage.enterEmail(email);
}
@When("the user uses the reset link to change the password")
public void theUserUsesTheResetLinkToChangeThePassword() {
loginPage.useResetLinkToChangePassword();
}
@Then("the user verifies that the confirmation message is received")
public void theUserVerifiesThatTheConfirmationMessageIsReceived() {
loginPage.isConfirmationMessageReceived();
}
@Then("the dashboard should be displayed in {string}")
public void theDashboardShouldBeDisplayedIn(String browser) {
loginPage.isDashboardDisplayedInBrowser(browser);
}
@Then("the system processes the request without errors")
public void theSystemProcessesTheRequestWithoutErrors() {
loginPage.isRequestProcessedWithoutErrors();
}
@Given("the user enters krishna@gmail.com in the email id field")
public void theUserEntersKrishnaGmailComInTheEmailIdField() {
loginPage.enterEmail("krishna@gmail.com");
}
@When("the user clicks the 'login' button in the first tab")
public void theUserClicksTheLoginButtonInTheFirstTab() {
loginPage.clickLoginButton();
}
@Given("i enter a valid password in the password field as {string}")
public void iEnterAValidPasswordInThePasswordFieldAs(String password) {
loginPage.enterPassword(password);
}
@When("the user selects the option to recover using security questions")
public void theUserSelectsTheOptionToRecoverUsingSecurityQuestions() {
loginPage.selectRecoverUsingSecurityQuestions();
}
@Then("the system should display an error message for each failed attempt")
public void theSystemShouldDisplayAnErrorMessageForEachFailedAttempt() {
loginPage.isErrorMessageDisplayedForFailedAttempts();
}
@When("i open the application in {string}")
public void iOpenTheApplicationIn(String browser) {
loginPage.openApplicationInBrowser(browser);
}
@When("i refresh the browser")
public void iRefreshTheBrowser() {
loginPage.refreshBrowser();
}
@When("the user sets a new password")
public void theUserSetsANewPassword() {
loginPage.setNewPassword();
}
@Then("the user should be prompted to change their password")
public void theUserShouldBePromptedToChangeTheirPassword() {
loginPage.isPromptedToChangePassword();
}
@Then("an error message is displayed")
public void anErrorMessageIsDisplayed() {
loginPage.isErrorMessageDisplayed();
}
@Then("the system should process the login request")
public void theSystemShouldProcessTheLoginRequest() {
loginPage.isLoginRequestProcessed();
}
@Then("the dashboard is displayed in the first tab")
public void theDashboardIsDisplayedInTheFirstTab() {
loginPage.isDashboardDisplayedInFirstTab();
}
@When("the screen reader reads the labels for email id password fields")
public void theScreenReaderReadsTheLabelsForEmailIdPasswordFields() {
loginPage.readLabelsWithScreenReader();
}
@Then("the user should be directed to the dashboard after a delay")
public void theUserShouldBeDirectedToTheDashboardAfterADelay() {
loginPage.isUserDirectedToDashboardAfterDelay();
}
@When("i repeat the login attempt for a total of 5 times")
public void iRepeatTheLoginAttemptForATotalOf5Times() {
loginPage.repeatLoginAttempt(5);
}
@Then("the user waits for the system to process the login request")
public void theUserWaitsForTheSystemToProcessTheLoginRequest() {
loginPage.waitForLoginRequestToProcess();
}
@Then("the second tab should remain on the login screen")
public void theSecondTabShouldRemainOnTheLoginScreen() {
loginPage.isSecondTabOnLoginScreen();
}
@Then("the dashboard is displayed successfully")
public void theDashboardIsDisplayedSuccessfully() {
loginPage.isDashboardDisplayedSuccessfully();
}
@Given("the user enters {string} in the password field")
public void theUserEntersInThePasswordField(String password) {
loginPage.enterPassword(password);
}
@When("i clickElement the 'login' button using the keyboard")
public void iClickTheLoginButtonUsingTheKeyboard() {
loginPage.clickLoginButtonUsingKeyboard();
}
@When("the user logs out")
public void theUserLogsOut() {
loginPage.logout();
}
@When("the user returns to the login screen")
public void theUserReturnsToTheLoginScreen() {
loginPage.navigateToLoginScreen();
}
@Then("a success message is displayed confirming the reset link has been sent")
public void aSuccessMessageIsDisplayedConfirmingTheResetLinkHasBeenSent() {
loginPage.isSuccessMessageDisplayedForResetLink();
}
@When("i press enter to clickElement the 'login' button")
public void iPressEnterToClickTheLoginButton() {
loginPage.pressEnterToClickLoginButton();
}
@Then("the account should be locked after the 5th attempt")
public void theAccountShouldBeLockedAfterThe5thAttempt() {
loginPage.isAccountLockedAfterAttempts(5);
}
@Given("the email id field is empty")
public void theEmailIdFieldIsEmpty() {
loginPage.leaveEmailFieldEmpty();
}
@Given("the user enters a valid email id in the email id field {string}")
public void theUserEntersAValidEmailIdInTheEmailIdField(String email) {
loginPage.enterEmail(email);
}
@Given("i enter {string} in the password field using the keyboard")
public void iEnterInThePasswordFieldUsingTheKeyboard(String password) {
loginPage.enterPassword(password);
}
@Then("a password hint is displayed")
public void aPasswordHintIsDisplayed() {
loginPage.isPasswordHintDisplayed();
}
@Given("i enter {string} in the email id field using the keyboard")
public void iEnterInTheEmailIdFieldUsingTheKeyboard(String email) {
loginPage.enterEmail(email);
}
@When("the user attempts to use the same reset link again")
public void theUserAttemptsToUseTheSameResetLinkAgain() {
loginPage.attemptToUseSameResetLink();
}
@When("the user answers the security questions correctly")
public void theUserAnswersTheSecurityQuestionsCorrectly() {
loginPage.answerSecurityQuestionsCorrectly();
}
@Then("the system should display an appropriate message")
public void theSystemShouldDisplayAnAppropriateMessage() {
loginPage.isAppropriateMessageDisplayed();
}
@When("i clickElement the show password option")
public void iClickTheShowPasswordOption() {
loginPage.clickShowPasswordOption();
}
@When("i clickElement the hide password option")
public void iClickTheHidePasswordOption() {
loginPage.clickHidePasswordOption();
}
@Then("the user is prompted to change their password")
public void theUserIsPromptedToChangeTheirPassword() {
loginPage.isPromptedToChangePassword();
}
@When("the user clicks the 'login' button")
public void theUserClicksTheLoginButton() {
loginPage.clickLoginButton();
}
@Then("the system processes the login request without errors")
public void theSystemProcessesTheLoginRequestWithoutErrors() {
loginPage.isLoginRequestProcessedWithoutErrors();
}
@Then("the email id field should be empty")
public void theEmailIdFieldShouldBeEmpty() {
loginPage.isEmailFieldEmpty();
}
@Then("the dashboard should be displayed in the first tab")
public void theDashboardShouldBeDisplayedInTheFirstTab() {
loginPage.isDashboardDisplayedInFirstTab();
}
@When("i simulate a session timeout")
public void iSimulateASessionTimeout() {
loginPage.simulateSessionTimeout();
}
@Given("i enter a valid email id {string} in the email id field using the keyboard")
public void iEnterAValidEmailIdInTheEmailIdFieldUsingTheKeyboard(String email) {
loginPage.enterEmail(email);
}
@When("the user logs in with the new password")
public void theUserLogsInWithTheNewPassword() {
loginPage.loginWithNewPassword();
}
@Then("the user should see an error message indicating the link has expired")
public void theUserShouldSeeAnErrorMessageIndicatingTheLinkHasExpired() {
loginPage.isErrorMessageForExpiredLinkDisplayed();
}
@When("the user checks the email for a confirmation message")
public void theUserChecksTheEmailForAConfirmationMessage() {
loginPage.checkEmailForConfirmationMessage();
}
@Then("an error message 'incorrect email id or password.' is displayed")
public void anErrorMessageIncorrectEmailIdOrPasswordIsDisplayed() {
loginPage.isErrorMessageDisplayed("incorrect email id or password.");
}
@Then("the system processes the request")
public void theSystemProcessesTheRequest() {
loginPage.isRequestProcessed();
}
@Given("i enter a valid password {string}")
public void iEnterAValidPassword(String password) {
loginPage.enterPassword(password);
}
@Then("the dashboard is displayed in chrome")
public void theDashboardIsDisplayedInChrome() {
loginPage.isDashboardDisplayedInBrowser("chrome");
}
}