package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

import java.util.List;

public class SchedulePanelInterviewPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    public SchedulePanelInterviewPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "createInterviewButton")
    private WebElement createInterviewButton;
    @FindBy(id = "jobOpeningDropdown")
    private WebElement jobOpeningDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "candidateEmailInput")
    private WebElement candidateEmailInput;
    @FindBy(id = "panelInterviewOption")
    private WebElement panelInterviewOption;
    @FindBy(id = "interviewDatePicker")
    private WebElement interviewDatePicker;
    @FindBy(id = "startTimeDropdown")
    private WebElement startTimeDropdown;
    @FindBy(id = "attendeesDropdown")
    private WebElement attendeesDropdown;
    @FindBy(id = "interviewRoundDropdown")
    private WebElement interviewRoundDropdown;
    @FindBy(id = "interviewProviderDropdown")
    private WebElement interviewProviderDropdown;
    @FindBy(id = "nextButton")
    private WebElement nextButton;
    @FindBy(id = "confirmSendButton")
    private WebElement confirmSendButton;
    @FindBy(id = "confirmationMessage")
    private WebElement confirmationMessage;
    @FindBy(id = "editInterviewButton")
    private WebElement editInterviewButton;
    @FindBy(id = "saveChangesButton")
    private WebElement saveChangesButton;
    @FindBy(id = "cancellationConfirmationMessage")
    private WebElement cancellationConfirmationMessage;
    @FindBy(id = "scheduledInterviewsList")
    private WebElement scheduledInterviewsList;

    public void navigateToScheduleInterviewSection() {
        try {
            driver.get("http://localhost/schedule_interview");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCreateInterview() {
        try {
            elementUtils.clickElement(createInterviewButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectJobOpening(String jobOpening) {
        try {
            elementUtils.clickElement(jobOpeningDropdown);
            elementUtils.selectOptionInDropdown(jobOpeningDropdown, jobOpening);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.clickElement(locationDropdown);
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterCandidateEmail(String candidateEmail) {
        try {
            elementUtils.clearAndSendKeys(candidateEmailInput, candidateEmail);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void choosePanelInterviewOption() {
        try {
            elementUtils.clickElement(panelInterviewOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewDate(String interviewDate) {
        try {
            elementUtils.clearAndSendKeys(interviewDatePicker, interviewDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectStartTime(String startTime) {
        try {
            elementUtils.clickElement(startTimeDropdown);
            elementUtils.selectOptionInDropdown(startTimeDropdown, startTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAttendees(String attendees) {
        try {
            elementUtils.clickElement(attendeesDropdown);
            elementUtils.selectOptionInDropdown(attendeesDropdown, attendees);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewRound(String interviewRound) {
        try {
            elementUtils.clickElement(interviewRoundDropdown);
            elementUtils.selectOptionInDropdown(interviewRoundDropdown, interviewRound);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewProvider(String interviewProvider) {
        try {
            elementUtils.clickElement(interviewProviderDropdown);
            elementUtils.selectOptionInDropdown(interviewProviderDropdown, interviewProvider);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickNext() {
        try {
            elementUtils.clickElement(nextButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickConfirmAndSend() {
        try {
            elementUtils.clickElement(confirmSendButton);
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

    public void clickEditInterview() {
        try {
            elementUtils.clickElement(editInterviewButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSaveChanges() {
        try {
            elementUtils.clickElement(saveChangesButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCancellationConfirmationDisplayed() {
        try {
            return elementUtils.isElementDisplayed(cancellationConfirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isInterviewInCalendar() {
        try {
            return elementUtils.isElementDisplayed(scheduledInterviewsList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterCidateEmail(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("emailField"));
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmCancellation() {
        try {
            WebElement cancelButton = driver.findElement(By.id("cancelButton"));
            elementUtils.clickElement(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickCancelInterview() {
        try {
            WebElement cancelInterviewButton = driver.findElement(By.id("cancelInterviewButton"));
            elementUtils.clickElement(cancelInterviewButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isEmailNotificationReceivedByCandidate(String expectedEmail) {
        try {
            String actualEmail = getEmailFromInbox(); // Placeholder for email retrieval logic
            Assert.assertEquals(actualEmail, expectedEmail, "Email notification does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isStartTimeErrorMessageDisplayed() {
        try {
            WebElement errorMessage = driver.findElement(By.id("startTimeErrorMessage"));
            boolean isDisplayed = elementUtils.isElementDisplayed(errorMessage);
            Assert.assertTrue(isDisplayed, "Start time error message is not displayed!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leaveCandidateFieldEmpty() {
        try {
            WebElement candidateField = driver.findElement(By.id("candidateField"));
            elementUtils.clearElement(candidateField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewDetailsDisplayedCorrectly(String expectedDetails) {
        try {
            WebElement detailsElement = driver.findElement(By.id("interviewDetails"));
            String actualDetails = elementUtils.getElementText(detailsElement);
            Assert.assertEquals(actualDetails, expectedDetails, "Interview details do not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void areChangesSaved() {
        try {
            WebElement saveButton = driver.findElement(By.id("saveButton"));
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectInterviewDateAndStartTime(String date, String time) {
        try {
            WebElement dateDropdown = driver.findElement(By.id("dateDropdown"));
            elementUtils.selectOptionInDropdown(dateDropdown, date);
            
            WebElement timeDropdown = driver.findElement(By.id("timeDropdown"));
            elementUtils.selectOptionInDropdown(timeDropdown, time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveStartTimeFieldEmpty() {
        try {
            WebElement startTimeField = driver.findElement(By.id("startTimeField"));
            elementUtils.clearElement(startTimeField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isOnScheduledInterviewsPage() {
        try {
            WebElement scheduledInterviewsPageElement = driver.findElement(By.id("scheduledInterviewsPage"));
            boolean isDisplayed = elementUtils.isElementDisplayed(scheduledInterviewsPageElement);
            Assert.assertTrue(isDisplayed, "Not on scheduled interviews page!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectInterviewDateStartTime(String date, String startTime) {
        selectInterviewDateAndStartTime(date, startTime);
    }

    public void chooseOption(String option) {
        try {
            WebElement optionElement = driver.findElement(By.id("optionDropdown"));
            elementUtils.selectOptionInDropdown(optionElement, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCandidateErrorMessageDisplayed() {
        try {
            WebElement candidateErrorMessage = driver.findElement(By.id("candidateErrorMessage"));
            boolean isDisplayed = elementUtils.isElementDisplayed(candidateErrorMessage);
            Assert.assertTrue(isDisplayed, "Candidate error message is not displayed!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void navigateToCalendarSection() {
        try {
            WebElement calendarSection = driver.findElement(By.id("calendarSection"));
            elementUtils.clickElement(calendarSection);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewOnCalendar(String interviewTitle) {
        try {
            WebElement interviewElement = driver.findElement(By.xpath("//div[contains(text(),'" + interviewTitle + "')]"));
            boolean isDisplayed = elementUtils.isElementDisplayed(interviewElement);
            Assert.assertTrue(isDisplayed, "Interview is not displayed on the calendar!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isCanceledInterviewVisibleInDashboard(String interviewTitle) {
        try {
            WebElement canceledInterviewElement = driver.findElement(By.xpath("//div[contains(text(),'" + interviewTitle + " - Canceled')]"));
            boolean isDisplayed = elementUtils.isElementDisplayed(canceledInterviewElement);
            Assert.assertTrue(isDisplayed, "Canceled interview is not visible in the dashboard!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isOverlappingInterviewTimeErrorMessageDisplayed() {
        try {
            WebElement overlappingErrorMessage = driver.findElement(By.id("overlappingErrorMessage"));
            boolean isDisplayed = elementUtils.isElementDisplayed(overlappingErrorMessage);
            Assert.assertTrue(isDisplayed, "Overlapping interview time error message is not displayed!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void changeAttendeesIfNecessary(List<String> attendees) {
        try {
            WebElement attendeesField = driver.findElement(By.id("attendeesField"));
            elementUtils.clearAndSendKeys(attendeesField, String.join(",", attendees));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areEmailAddressesCorrect(List<String> expectedEmails) {
        try {
            List<String> actualEmails = getEmailAddressesFromUI(); // Placeholder for email retrieval logic
            Assert.assertEquals(actualEmails, expectedEmails, "Email addresses do not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean canViewOriginalDetails() {
        try {
            WebElement originalDetails = driver.findElement(By.id("originalDetails"));
            boolean isDisplayed = elementUtils.isElementDisplayed(originalDetails);
            Assert.assertTrue(isDisplayed, "Cannot view original details!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectMinimumRequiredAttendeesAndInterviewRound(List<String> attendees, String interviewRound) {
        changeAttendeesIfNecessary(attendees);
        selectInterviewRound(interviewRound);
    }

    public void leaveJobOpeningFieldEmpty() {
        try {
            WebElement jobOpeningField = driver.findElement(By.id("jobOpeningField"));
            elementUtils.clearElement(jobOpeningField);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isInterviewInScheduledList(String interviewTitle) {
        try {
            WebElement scheduledInterviewElement = driver.findElement(By.xpath("//div[contains(text(),'" + interviewTitle + "')]"));
            boolean isDisplayed = elementUtils.isElementDisplayed(scheduledInterviewElement);
            Assert.assertTrue(isDisplayed, "Interview is not in the scheduled list!");
            return isDisplayed;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void attemptToChangeDetails(String newDetails) {
        try {
            WebElement detailsField = driver.findElement(By.id("detailsField"));
            elementUtils.clearAndSendKeys(detailsField, newDetails);
            WebElement saveButton = driver.findElement(By.id("saveButton"));
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}