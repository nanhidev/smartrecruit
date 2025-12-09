
package com.backend.pages;

import com.utils.ElementUtils;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginwithvalidcredentialsPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailInput") // Unique locator for email input
    private WebElement emailInput;

    @FindBy(id = "passwordInput") // Unique locator for password input
    private WebElement passwordInput;

    @FindBy(id = "loginButton") // Unique locator for login button
    private WebElement loginButton;

    @FindBy(id = "homeScreen") // Unique locator for home screen
    private WebElement homeScreen;

    @FindBy(id = "googleMap") // Unique locator for Google Map
    private WebElement googleMap;

    @FindBy(id = "menuBar") // Unique locator for menu bar
    private WebElement menuBar;

    @FindBy(id = "recenterIcon") // Unique locator for recenter icon
    private WebElement recenterIcon;

    public LoginwithvalidcredentialsPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        try {
            driver.get("http://localhost"); // Navigate to the login page
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailInput, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordInput, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isHomeScreenLoaded() {
        try {
            return elementUtils.isElementDisplayed(homeScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserOnHomeScreen() {
        try {
            return elementUtils.isElementDisplayed(homeScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isGoogleMapDisplayed() {
        try {
            return elementUtils.isElementDisplayed(googleMap);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isMenuBarVisible() {
        try {
            return elementUtils.isElementDisplayed(menuBar);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isRecenterIconVisible() {
        try {
            return elementUtils.isElementDisplayed(recenterIcon);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}