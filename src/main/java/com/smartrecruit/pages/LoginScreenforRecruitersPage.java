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
    @FindBy(id = "preFilledEmailField")
    private WebElement preFilledEmailField;

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
        // Implement logic to check if password reset screen is displayed
        return false; // Placeholder
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
        // Implement logic to check if invalid link error is displayed
        return false; // Placeholder
    }

    public boolean isErrorMessageDisplayed() {
        // Implement logic to check if error message is displayed
        return false; // Placeholder
    }

    public void useInvalidResetLink() {
        try {
            WebElement resetLinkInput = driver.findElement(By.id("resetLinkInput"));
            elementUtils.clearAndSendKeys(resetLinkInput, "invalid_reset_link");
            WebElement sendResetLinkButton = driver.findElement(By.id("sendResetLinkButton"));
            elementUtils.clickElement(sendResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void simulateSlowNetwork() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isOnLoginScreen() {
        try {
            WebElement loginScreenHeader = driver.findElement(By.xpath("//h1[text()='Login']"));
            return elementUtils.isElementDisplayed(loginScreenHeader);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
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

    public void clickSendResetLink() {
        try {
            WebElement sendResetLinkButton = driver.findElement(By.id("sendResetLinkButton"));
            elementUtils.clickElement(sendResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToLoginScreen() {
        try {
            driver.navigate().to("localhost/login");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isAccountLocked() {
        try {
            WebElement accountLockedMessage = driver.findElement(By.xpath("//div[text()='Your account is locked.']"));
            return elementUtils.isElementDisplayed(accountLockedMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isDashboardDisplayedAfterDelay(long delay) {
        try {
            Thread.sleep(delay);
            return elementUtils.isElementDisplayed(dashboard);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void useSameResetLinkAgain() {
        try {
            WebElement resetLinkInput = driver.findElement(By.id("resetLinkInput"));
            elementUtils.clearAndSendKeys(resetLinkInput, "same_reset_link");
            WebElement sendResetLinkButton = driver.findElement(By.id("sendResetLinkButton"));
            elementUtils.clickElement(sendResetLinkButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void waitForLoginProcessing() {
        try {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10000) { // 10 seconds timeout
                WebElement loginProcessingIndicator = driver.findElement(By.id("loginProcessingIndicator"));
                if (!elementUtils.isElementDisplayed(loginProcessingIndicator)) {
                    break;
                }
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}