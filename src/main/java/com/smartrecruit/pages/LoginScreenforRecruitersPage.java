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

    @FindBy(id = "emailField")
    private WebElement emailField;

    @FindBy(id = "passwordField")
    private WebElement passwordField;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "rememberMeCheckbox")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "showPasswordOption")
    private WebElement showPasswordOption;

    @FindBy(id = "hidePasswordOption")
    private WebElement hidePasswordOption;

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "forgotPasswordLink")
    private WebElement forgotPasswordLink;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "passwordResetScreen")
    private WebElement passwordResetScreen;

    @FindBy(id = "invalidLinkError")
    private WebElement invalidLinkError;

    @FindBy(id = "errorMessageDisplayed")
    private WebElement errorMessageDisplayed;

    @FindBy(id = "sendResetLink")
    private WebElement sendResetLinkButton;

    @FindBy(id = "accountLockedMessage")
    private WebElement lockedMessageElement;

    @FindBy(id = "resetLink")
    private WebElement resetLinkInput;

    @FindBy(id = "submitResetLink")
    private WebElement submitResetLinkButton;

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
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

    public boolean isDashboardDisplayed() {
        try {
            return elementUtils.isElementDisplayed(dashboard);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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

    public void checkRememberMe() {
        try {
            elementUtils.clickElement(rememberMeCheckbox);
        } catch (Exception e) {
            e.printStackTrace();
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

    public String getEmailFieldValue() {
        try {
            return emailField.getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public boolean isEmailFieldEmpty() {
        try {
            return emailField.getText().isEmpty();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clickShowPassword() {
        try {
            elementUtils.clickElement(showPasswordOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHidePassword() {
        try {
            elementUtils.clickElement(hidePasswordOption);
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

    public void clickForgotPassword() {
        try {
            elementUtils.clickElement(forgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordResetScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(passwordResetScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSuccessMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(successMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isInvalidLinkErrorDisplayed() {
        try {
            return elementUtils.isElementDisplayed(invalidLinkError);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(errorMessageDisplayed);
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

    public void simulateSlowNetwork() {
        // Implement slow network simulation if applicable
    }

    public boolean isOnLoginScreen() {
        try {
            return driver.getTitle().contains("Login") || elementUtils.isElementDisplayed(emailField);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void waitForLoginProcessing() {
        try {
            Thread.sleep(5000); // Wait for the processing to complete
            Assert.assertTrue("Dashboard is not displayed after login processing.", isDashboardDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSendResetLink() {
        try {
            elementUtils.clickElement(sendResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAccountLocked() {
        try {
            String actualMessage = elementUtils.getElementText(lockedMessageElement);
            String expectedMessage = "Your account is locked."; // Replace with actual expected message
            Assert.assertEquals(actualMessage, expectedMessage, "Account lock message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useInvalidResetLink() {
        try {
            elementUtils.clearAndSendKeys(resetLinkInput, "invalidResetLink"); // Replace with actual invalid link
            elementUtils.clickElement(submitResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login"); // Replace with actual login URL
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useSameResetLinkAgain() {
        try {
            elementUtils.clearAndSendKeys(resetLinkInput, "sameResetLink"); // Replace with actual reset link
            elementUtils.clickElement(submitResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void accessDashboard() {
        try {
            Assert.assertTrue("Unable to access the dashboard.", isDashboardDisplayed());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}