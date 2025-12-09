package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class LoginScreenforRecruitersPage {

    private WebDriver driver;
    private ElementUtils elementUtils;

    public LoginScreenforRecruitersPage(WebDriver driver) {
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

    @FindBy(id = "dashboard")
    private WebElement dashboard;

    @FindBy(id = "errorMessage")
    private WebElement errorMessage;

    @FindBy(id = "rememberMe")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "successMessage")
    private WebElement successMessage;

    @FindBy(id = "forgotPasswordLink")
    private WebElement forgotPasswordLink;

    @FindBy(id = "passwordResetScreen")
    private WebElement passwordResetScreen;

    @FindBy(id = "invalidLinkError")
    private WebElement invalidLinkError;

    @FindBy(id = "emailFieldValue")
    private WebElement emailFieldValue;

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
        return elementUtils.isElementDisplayed(dashboard);
    }

    public boolean isLoginButtonEnabled() {
        return loginButton.isEnabled();
    }

    public void checkRememberMe() {
        try {
            elementUtils.clickElement(rememberMeCheckbox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getErrorMessage() {
        return elementUtils.getElementText(errorMessage);
    }

    public String getEmailFieldValue() {
        return elementUtils.getElementText(emailFieldValue);
    }

    public void clickForgotPassword() {
        try {
            elementUtils.clickElement(forgotPasswordLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isPasswordResetScreenDisplayed() {
        return elementUtils.isElementDisplayed(passwordResetScreen);
    }

    public boolean isSuccessMessageDisplayed() {
        return elementUtils.isElementDisplayed(successMessage);
    }

    public boolean isInvalidLinkErrorDisplayed() {
        return elementUtils.isElementDisplayed(invalidLinkError);
    }

    public boolean isErrorMessageDisplayed() {
        return elementUtils.isElementDisplayed(errorMessage);
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
        // Implement simulation logic if needed
    }

    public void accessDashboard() {
        // Logic to access the dashboard, if needed
    }

    public boolean isOnLoginScreen() {
        // Logic to verify if on login screen
        return true; // Placeholder return value
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDashboardDisplayedAfterDelay() {
        try {
            Thread.sleep(5000); // wait for 5 seconds
            Assert.assertTrue("Dashboard is not displayed!", elementUtils.isElementDisplayed(dashboard));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSendResetLink() {
        try {
            WebElement sendResetLinkButton = driver.findElement(By.id("sendResetLink"));
            elementUtils.clickElement(sendResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useInvalidResetLink() {
        try {
            WebElement invalidLinkField = driver.findElement(By.id("resetLink"));
            elementUtils.clearAndSendKeys(invalidLinkField, "invalid_link");
            WebElement submitButton = driver.findElement(By.id("submitLink"));
            elementUtils.clickElement(submitButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAccountLocked() {
        try {
            WebElement lockMessage = driver.findElement(By.id("lockMessage"));
            Assert.assertTrue("Account is not locked!", elementUtils.isElementDisplayed(lockMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForLoginProcessing() {
        try {
            WebElement processingMessage = driver.findElement(By.id("loginProcessing"));
            Assert.assertTrue("Login processing message is not displayed!", elementUtils.isElementDisplayed(processingMessage));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickShowPassword() {
        try {
            WebElement showPasswordButton = driver.findElement(By.id("showPassword"));
            elementUtils.clickElement(showPasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isPasswordVisible() {
        try {
            String typeAttribute = passwordField.getAttribute("type");
            Assert.assertEquals("Password is not visible!", "text", typeAttribute);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickHidePassword() {
        try {
            WebElement hidePasswordButton = driver.findElement(By.id("hidePassword"));
            elementUtils.clickElement(hidePasswordButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isEmailFieldEmpty() {
        try {
            String emailValue = emailField.getAttribute("value");
            Assert.assertTrue("Email field is not empty!", emailValue.isEmpty());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public void useSameResetLinkAgain() {
    try {
        WebElement resetLink = driver.findElement(By.xpath("//a[text()='Use same reset link again']"));
        ElementUtils.clickElement(resetLink);
    } catch (Exception e) {
        e.printStackTrace();
    }
}