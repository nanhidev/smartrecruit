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

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "showHidePasswordOption")
    private WebElement showHidePasswordOption;

    @FindBy(id = "recruiterName")
    private WebElement recruiterName;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "dashboardURL")
    private WebElement dashboardURL;

    public TestCasesPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
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

    public void navigateToLoginPage() {
        driver.get("http://localhost/login");
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
        try {
            return driver.getCurrentUrl();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
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
            return null;
        }
    }

    public boolean isLoginButtonEnabled() {
        try {
            return !loginButton.isEnabled();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void setEmailField(String emailField) {
        try {
            elementUtils.clearAndSendKeys(this.emailField, emailField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setPasswordField(String passwordField) {
        try {
            elementUtils.clearAndSendKeys(this.passwordField, passwordField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordVisible() {
        try {
            return passwordField.getAttribute("type").equals("text");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickLoginButton() {
        try {
            elementUtils.clickElement(loginButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}