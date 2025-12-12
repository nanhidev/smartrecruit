package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginwithvalidcredentialsPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public LoginwithvalidcredentialsPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "emailField") 
    private WebElement emailField;

    @FindBy(id = "passwordField") 
    private WebElement passwordField;

    @FindBy(id = "loginButton") 
    private WebElement loginButton;

    @FindBy(id = "homeScreen") 
    private WebElement homeScreen;

    @FindBy(id = "googleMap") 
    private WebElement googleMap;

    @FindBy(id = "menuBar") 
    private WebElement menuBar;

    @FindBy(id = "recenterIcon") 
    private WebElement recenterIcon;

    public void navigateToLoginPage() {
        try {
            driver.get("http://localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
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

    public void isHomeScreenLoaded() {
        try {
            Assert.assertTrue("Home screen is not loaded!", elementUtils.isElementDisplayed(homeScreen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUserOnHomeScreen() {
        try {
            Assert.assertTrue("User is not on home screen!", elementUtils.isElementDisplayed(homeScreen));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isGoogleMapDisplayed() {
        try {
            Assert.assertTrue("Google Map is not displayed!", elementUtils.isElementDisplayed(googleMap));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isMenuBarVisible() {
        try {
            Assert.assertTrue("Menu Bar is not visible!", elementUtils.isElementDisplayed(menuBar));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isRecenterIconVisible() {
        try {
            Assert.assertTrue("Recenter Icon is not visible!", elementUtils.isElementDisplayed(recenterIcon));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}