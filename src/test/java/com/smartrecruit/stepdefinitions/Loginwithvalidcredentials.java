package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
public class Loginwithvalidcredentials extends DriverFactory {
private LoginPage loginPage;
public Loginwithvalidcredentials() {
this.loginPage = new LoginPage();
}
@Given("the user is on the Login Page")
public void the_user_is_on_the_login_page() {
loginPage.navigateToLoginPage();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_email(String email) {
loginPage.enterEmail(email);
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_password(String password) {
loginPage.enterPassword(password);
}
@When("the user clicks the login button")
public void the_user_clicks_the_login_button() {
loginPage.clickLoginButton();
}
@Then("the home screen should load")
public void the_home_screen_should_load() {
"Home screen did not load", loginPage.isHomeScreenLoaded();
}
@Then("the user should be navigated to the home screen")
public void the_user_should_be_navigated_to_the_home_screen() {
"User is not on home screen", loginPage.isUserOnHomeScreen();
}
@Then("the Google Map should be displayed correctly")
public void the_google_map_should_be_displayed_correctly() {
"Google Map is not displayed correctly", loginPage.isGoogleMapDisplayed();
}
@Then("the menu bar and recenter icon should be visible")
public void the_menu_bar_and_recenter_icon_should_be_visible() {
"Menu bar is not visible", loginPage.isMenuBarVisible();
"Recenter icon is not visible", loginPage.isRecenterIconVisible();
}