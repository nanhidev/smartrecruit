package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenforRecruitersPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "emailIdField")
    private WebElement emailIdField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "showPasswordButton")
    private WebElement showPasswordButton;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "rememberMeCheckbox")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "loginScreen")
    private WebElement loginScreen;

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmailId(String emailId) {
        try {
            elementUtils.clearAndSendKeys(emailIdField, emailId);
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

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordButton);
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

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDashboardLoadedSuccessfully() {
        try {
            return isDashboardDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getLoginButtonState() {
        try {
            return loginButton.isEnabled() ? "enabled" : "disabled";
        } catch (Exception e) {
            e.printStackTrace();
            return "unknown";
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

    public void checkRememberMe() {
        try {
            if (!rememberMeCheckbox.isSelected()) {
                elementUtils.clickElement(rememberMeCheckbox);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void logout() {
        // Implement the logout functionality
    }

    public boolean isLoggedOut() {
        // Implement check for logged out status
        return true;
    }

    public boolean isLoginScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(loginScreen);
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

    public void navigateToLoginScreen() {
        try {
            driver.navigate().to("http://localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToApplication() {
        try {
            driver.navigate().to("http://localhost/application");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHidePasswordOption() {
        try {
            WebElement hidePasswordButton = driver.findElement(By.id("hidePassword")); // Replace with actual locator
            elementUtils.clickElement(hidePasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getEmailId() {
        String emailId = null;
        try {
            emailId = emailIdField.getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emailId;
    }
}