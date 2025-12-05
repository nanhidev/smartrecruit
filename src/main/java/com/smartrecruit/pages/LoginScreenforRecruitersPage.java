package com.smartrecruit.pages;

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

    @FindBy(id = "showPasswordButton")
    private WebElement showPasswordButton;

    @FindBy(id = "loginButton")
    private WebElement loginButton;

    @FindBy(id = "dashboardElement")
    private WebElement dashboardElement;

    @FindBy(id = "newPasswordField")
    private WebElement newPasswordField;

    @FindBy(id = "emailFieldValue")
    private WebElement emailFieldValue;

    @FindBy(id = "passwordResetRequestStatus")
    private WebElement passwordResetRequestStatus;

    @FindBy(id = "pageResponseStatus")
    private WebElement pageResponseStatus;

    @FindBy(id = "userLoginStatus")
    private WebElement userLoginStatus;

    @FindBy(id = "jobPostingDetails")
    private WebElement jobPostingDetails;

    @FindBy(id = "profileSettingsPage")
    private WebElement profileSettingsPage;

    @FindBy(id = "profileInformation")
    private WebElement profileInformation;

    @FindBy(id = "notificationsPanel")
    private WebElement notificationsPanel;

    @FindBy(id = "helpResourcesPage")
    private WebElement helpResourcesPage;

    @FindBy(id = "settingsPage")
    private WebElement settingsPage;

    @FindBy(id = "feedbackForm")
    private WebElement feedbackForm;

    @FindBy(id = "activityLogPage")
    private WebElement activityLogPage;

    @FindBy(id = "preferencesPage")
    private WebElement preferencesPage;

    @FindBy(id = "rolesPage")
    private WebElement rolesPage;

    @FindBy(id = "permissionsPage")
    private WebElement permissionsPage;

    @FindBy(id = "notificationsPage")
    private WebElement notificationsPage;

    public LoginScreenforRecruitersPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToLoginScreen() {
        driver.get("http://localhost");
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

    public boolean isLoginProcessed() {
        try {
            return elementUtils.isElementDisplayed(dashboardElement);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean areDashboardElementsVisible() {
        try {
            return elementUtils.isElementDisplayed(dashboardElement);
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

    public boolean isPasswordVisible() {
        try {
            return passwordField.getAttribute("type").equals("text");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterNewPassword(String newPassword) {
        try {
            elementUtils.clearAndSendKeys(newPasswordField, newPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isNewPasswordVisible() {
        try {
            return newPasswordField.getAttribute("type").equals("text");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getEmailFieldValue() {
        try {
            return elementUtils.getElementText(emailFieldValue);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean isPasswordResetRequestSuccessful() {
        try {
            return elementUtils.isElementDisplayed(passwordResetRequestStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPageResponseObserved() {
        try {
            return elementUtils.isElementDisplayed(pageResponseStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isUserLoggedIn() {
        try {
            return elementUtils.isElementDisplayed(userLoginStatus);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobPostingDetailsDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobPostingDetails);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isProfileSettingsPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(profileSettingsPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isProfileInformationAccurate() {
        try {
            return elementUtils.isElementDisplayed(profileInformation);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isNotificationsPanelDisplayed() {
        try {
            return elementUtils.isElementDisplayed(notificationsPanel);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isHelpResourcesPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(helpResourcesPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isSettingsPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(settingsPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isFeedbackFormDisplayed() {
        try {
            return elementUtils.isElementDisplayed(feedbackForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isActivityLogPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(activityLogPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPreferencesPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(preferencesPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isRolesPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(rolesPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isPermissionsPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(permissionsPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isNotificationsPageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(notificationsPage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}