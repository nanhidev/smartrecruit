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

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void enterEmail(String emailID) {
        try {
            elementUtils.clearAndSendKeys(emailField, emailID);
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
        return !passwordField.getAttribute("type").equals("password");
    }

    public String getErrorMessage() {
        try {
            return elementUtils.getElementText(errorMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void checkRememberMe() {
        try {
            elementUtils.clickElement(rememberMeCheckbox);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getEmailFieldValue() {
        try {
            return emailField.getAttribute("value");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isEmailFieldEmpty() {
        try {
            return emailField.getAttribute("value").isEmpty();
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

    public void clickSendResetLink() {
        try {
            WebElement sendResetLinkButton = driver.findElement(By.id("sendResetLinkButton"));
            elementUtils.clickElement(sendResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
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
            return elementUtils.isElementDisplayed(driver.findElement(By.id("invalidLinkError")));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isErrorMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(driver.findElement(By.id("genericErrorMessage")));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void navigateToLoginScreen() {
        try {
            driver.get("http://localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isAccountLocked() {
        try {
            WebElement lockMessageElement = driver.findElement(By.xpath("//div[contains(text(),'Your account is locked')]"));
            Assert.assertTrue(lockMessageElement.isDisplayed(), "Account lock message is not displayed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void accessDashboard() {
        try {
            WebElement dashboardLink = driver.findElement(By.id("dashboardLink"));
            elementUtils.clickElement(dashboardLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void simulateSlowNetwork() {
        try {
            Thread.sleep(5000); // Simulating a delay of 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void isOnLoginScreen() {
        try {
            WebElement loginFormElement = driver.findElement(By.id("loginForm"));
            Assert.assertTrue(loginFormElement.isDisplayed(), "Not on the login screen.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useInvalidResetLink() {
        try {
            WebElement resetLinkElement = driver.findElement(By.id("resetLink"));
            elementUtils.javaScriptClick(resetLinkElement);
            Assert.assertTrue(driver.getCurrentUrl().contains("error"), "Error page not displayed for invalid reset link.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForLoginProcessing() {
        try {
            WebElement loaderElement = driver.findElement(By.id("loader"));
            while (elementUtils.isElementDisplayed(loaderElement)) {
                Thread.sleep(1000); // Wait until loader is no longer visible
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isDashboardDisplayedAfterDelay() {
        try {
            simulateSlowNetwork(); // Simulate the delay
            Assert.assertTrue(dashboard.isDisplayed(), "Dashboard is not displayed after delay.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void useSameResetLinkAgain() {
        try {
            WebElement resetLinkElement = driver.findElement(By.id("resetLink"));
            elementUtils.javaScriptClick(resetLinkElement);
            Assert.assertTrue(driver.getCurrentUrl().contains("error"), "Error page not displayed for repeated reset link.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}