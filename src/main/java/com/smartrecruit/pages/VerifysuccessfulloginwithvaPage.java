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

    @FindBy(id = "email") // Unique locator for email input
    private WebElement emailInput;

    @FindBy(id = "password") // Unique locator for password input
    private WebElement passwordInput;

    @FindBy(id = "loginButton") // Unique locator for login button
    private WebElement loginButton;

    @FindBy(id = "dashboard") // Unique locator for dashboard element
    private WebElement dashboard;

    public VerifysuccessfulloginwithvaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.elementUtils = new ElementUtils(driver);
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost"); // Assuming localhost is the login screen URL
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

    public void processLoginRequest() {
        // This method could be used for additional processing if required,
        // but it's implied that the login button click will handle the request.
    }

    public void isUserRedirectedToDashboard() {
        try {
            Assert.assertTrue("The user is not redirected to the dashboard",
                elementUtils.isElementDisplayed(dashboard));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}