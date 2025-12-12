package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class TestCasesPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailField") // Unique locator for email field
    private WebElement emailField;

    @FindBy(id = "passwordField") // Unique locator for password field
    private WebElement passwordField;

    @FindBy(id = "loginButton") // Unique locator for login button
    private WebElement loginButton;

    @FindBy(id = "showHidePassword") // Unique locator for show/hide password option
    private WebElement showHidePasswordOption;

    @FindBy(id = "recruiterName") // Unique locator for recruiter name display
    private WebElement recruiterName;

    @FindBy(id = "errorMessage") // Unique locator for error message display
    private WebElement errorMessage;

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginPage() {
        driver.get("http://localhost/login"); // Navigate to the login page
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

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isShowHidePasswordOptionAvailable() {
        try {
            return elementUtils.isElementDisplayed(showHidePasswordOption);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public boolean isRecruiterNameDisplayed() {
        try {
            return elementUtils.isElementDisplayed(recruiterName);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leaveEmailFieldEmpty() {
        try {
            elementUtils.clearElement(emailField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leavePasswordFieldEmpty() {
        try {
            elementUtils.clearElement(passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setEmailField(String email) {
        try {
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPasswordField(String password) {
        try {
            elementUtils.clearAndSendKeys(passwordField, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPasswordVisible() {
        try {
            WebElement passwordField = driver.findElement(By.xpath("//input[@type='password']"));
            boolean isVisible = elementUtils.isElementDisplayed(passwordField);
            Assert.assertTrue(isVisible, "Password field is not visible!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}