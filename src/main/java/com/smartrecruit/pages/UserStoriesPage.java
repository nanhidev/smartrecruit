package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class UserStoriesPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "uploadCandidateProfileButton")
    private WebElement uploadCandidateProfileButton;

    @FindBy(id = "jobRoleDropdown")
    private WebElement jobRoleDropdown;

    @FindBy(id = "candidateProfileInput")
    private WebElement candidateProfileInput;

    @FindBy(id = "scheduleInterviewButton")
    private WebElement scheduleInterviewButton;

    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;

    public UserStoriesPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToUploadCandidateProfilePage() {
        try {
            driver.get("http://localhost/uploadCandidateProfile");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectJobRole(String jobRole) {
        try {
            elementUtils.clickElement(jobRoleDropdown);
            elementUtils.selectOptionInDropdown(jobRoleDropdown, jobRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void uploadCandidateProfile(String candidateProfile) {
        try {
            elementUtils.clearAndSendKeys(candidateProfileInput, candidateProfile);
            elementUtils.clickElement(uploadCandidateProfileButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void schedulePanelInterview() {
        try {
            elementUtils.clickElement(scheduleInterviewButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isConfirmationMessageDisplayed() {
        try {
            return elementUtils.isElementDisplayed(confirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    ublic void verifyConfirmationMessage(String expectedMessage) {
        try {
            String actualMessage = elementUtils.getElementText(confirmationMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Confirmation message does not match!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}