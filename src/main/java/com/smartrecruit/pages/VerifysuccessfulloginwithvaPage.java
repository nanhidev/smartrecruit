package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class VerifysuccessfulloginwithvaPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailInput")
    private WebElement emailInputField;

    @FindBy(id = "passwordInput")
    private WebElement passwordInputField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    public VerifysuccessfulloginwithvaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementUtils = new ElementUtils(driver);
    }

    public void enterEmail(String email) {
        try {
            elementUtils.clearAndSendKeys(emailInputField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPassword(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordInputField, password);
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

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void processLoginRequest() {
        // Implement logic for processing login request if needed
    }

    public void isUserRedirectedToDashboard() {
        try {
            Assert.assertTrue("User is not redirected to dashboard!", elementUtils.isElementDisplayed(dashboard));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}