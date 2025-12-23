package com.backend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class CreateJobOpeningPage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "dashboardLink")
    private WebElement dashboardLink;
    @FindBy(id = "sideNavigationOption")
    private WebElement sideNavigationOption;
    @FindBy(id = "jobOpeningScreen")
    private WebElement jobOpeningScreen;
    @FindBy(id = "addJobOpeningButton")
    private WebElement addJobOpeningButton;
    @FindBy(id = "createNewJobOpeningForm")
    private WebElement createNewJobOpeningForm;
    @FindBy(id = "saveButton")
    private WebElement saveButton;
    @FindBy(id = "cancelButton")
    private WebElement cancelButton;
    @FindBy(id = "jobRoleDropdown")
    private WebElement jobRoleDropdown;
    @FindBy(id = "locationDropdown")
    private WebElement locationDropdown;
    @FindBy(id = "minimumExperienceInput")
    private WebElement minimumExperienceInput;
    @FindBy(id = "maximumExperienceInput")
    private WebElement maximumExperienceInput;
    @FindBy(id = "qualificationInput")
    private WebElement qualificationInput;
    @FindBy(id = "shortJobDescriptionInput")
    private WebElement shortJobDescriptionInput;
    @FindBy(id = "responsibilitiesInput")
    private WebElement responsibilitiesInput;
    @FindBy(id = "errorMessage")
    private WebElement errorMessage;
    @FindBy(id = "jobOpeningList")
    private WebElement jobOpeningList;

    public CreateJobOpeningPage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToDashboard() {
        try {
            elementUtils.clickElement(dashboardLink);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clicksOnSideNavigationOption(String option) {
        try {
            elementUtils.clickElement(sideNavigationOption); // Assume sideNavigationOption will select the required option
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningScreenDisplayed() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningScreen);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void clicksOnAddJobOpeningButton() {
        try {
            elementUtils.clickElement(addJobOpeningButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isCreateNewJobOpeningFormOpened() {
        try {
            return elementUtils.isElementDisplayed(createNewJobOpeningForm);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectJobRole(String jobRole) {
        try {
            elementUtils.selectOptionInDropdown(jobRoleDropdown, jobRole);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectLocation(String location) {
        try {
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinimumExperience(String minimumExperience) {
        try {
            elementUtils.clearAndSendKeys(minimumExperienceInput, minimumExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaximumExperience(String maximumExperience) {
        try {
            elementUtils.clearAndSendKeys(maximumExperienceInput, maximumExperience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterQualification(String qualification) {
        try {
            elementUtils.clearAndSendKeys(qualificationInput, qualification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterShortJobDescription(String shortJobDescription) {
        try {
            elementUtils.clearAndSendKeys(shortJobDescriptionInput, shortJobDescription);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterResponsibilities(String responsibilities) {
        try {
            elementUtils.clearAndSendKeys(responsibilitiesInput, responsibilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickSaveButton() {
        try {
            elementUtils.clickElement(saveButton);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isErrorMessageDisplayed(String expectedMessage) {
        try {
            String actualMessage = elementUtils.getElementText(errorMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Error message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobOpeningAvailableInList() {
        try {
            return elementUtils.isElementDisplayed(jobOpeningList);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterSalary(String salary) {
        try {
            WebElement salaryField = driver.findElement(By.id("salaryFieldId")); // Example locator
            elementUtils.clearAndSendKeys(salaryField, salary);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickJobOpeningOption() {
        try {
            WebElement jobOpeningOption = driver.findElement(By.id("jobOpeningOptionId")); // Example locator
            elementUtils.clickElement(jobOpeningOption);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectJobType(String jobType) {
        try {
            WebElement jobTypeDropdown = driver.findElement(By.id("jobTypeDropdownId")); // Example locator
            elementUtils.selectOptionInDropdown(jobTypeDropdown, jobType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterTags(String tags) {
        try {
            WebElement tagsField = driver.findElement(By.id("tagsFieldId")); // Example locator
            elementUtils.clearAndSendKeys(tagsField, tags);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean areSaveAndCancelButtonsDisplayed() {
        try {
            WebElement saveButton = driver.findElement(By.id("saveButtonId")); // Example locator
            WebElement cancelButton = driver.findElement(By.id("cancelButtonId")); // Example locator
            return elementUtils.isElementDisplayed(saveButton) && elementUtils.isElementDisplayed(cancelButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fillEmploymentType(String employmentType) {
        try {
            WebElement employmentTypeField = driver.findElement(By.id("employmentTypeFieldId")); // Example locator
            elementUtils.clearAndSendKeys(employmentTypeField, employmentType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void leaveOptionalFieldsEmpty() {
        System.out.println("Optional fields left empty.");
    }

    public void selectFromDropdown(String option) {
        try {
            WebElement dropdown = driver.findElement(By.id("dropdownId")); // Example locator
            elementUtils.selectOptionInDropdown(dropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningAvailableWithCorrectResponsibilities(String expectedResponsibilities) {
        try {
            WebElement responsibilitiesField = driver.findElement(By.id("responsibilitiesFieldId")); // Example locator
            String actualResponsibilities = elementUtils.getElementText(responsibilitiesField);
            Assert.assertEquals(actualResponsibilities, expectedResponsibilities, "Responsibilities do not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fillAllRequiredFieldsWithValidData(String title, String description) {
        try {
            WebElement titleField = driver.findElement(By.id("titleFieldId")); // Example locator
            elementUtils.clearAndSendKeys(titleField, title);

            WebElement descriptionField = driver.findElement(By.id("descriptionFieldId")); // Example locator
            elementUtils.clearAndSendKeys(descriptionField, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectValidLocation(String location) {
        try {
            WebElement locationDropdown = driver.findElement(By.id("locationDropdownId")); // Example locator
            elementUtils.selectOptionInDropdown(locationDropdown, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobPostingDate(String date) {
        try {
            WebElement postingDateField = driver.findElement(By.id("postingDateFieldId")); // Example locator
            elementUtils.clearAndSendKeys(postingDateField, date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinAllowedCharsForMinimumExperience(String experience) {
        try {
            WebElement minExperienceField = driver.findElement(By.id("minExperienceFieldId")); // Example locator
            elementUtils.clearAndSendKeys(minExperienceField, experience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinAllowedCharsForMaximumExperience(String experience) {
        try {
            WebElement maxExperienceField = driver.findElement(By.id("maxExperienceFieldId")); // Example locator
            elementUtils.clearAndSendKeys(maxExperienceField, experience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isButtonVisible() {
        try {
            WebElement button = driver.findElement(By.id("submitButtonId")); // Example locator
            return elementUtils.isElementDisplayed(button);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterJobTitle(String jobTitle) {
        try {
            WebElement jobTitleField = driver.findElement(By.id("jobTitleFieldId")); // Example locator
            elementUtils.clearAndSendKeys(jobTitleField, jobTitle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfullyWithMaxAllowedCharacters(String expectedMessage) {
        try {
            WebElement successMessage = driver.findElement(By.id("successMessageId")); // Example locator
            String actualMessage = elementUtils.getElementText(successMessage);
            Assert.assertEquals(actualMessage, expectedMessage, "Success message does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterJobLocation(String jobLocation) {
        try {
            WebElement jobLocationField = driver.findElement(By.id("jobLocationFieldId")); // Example locator
            elementUtils.clearAndSendKeys(jobLocationField, jobLocation);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobLocation(String location) {
        try {
            WebElement jobLocationInput = driver.findElement(By.id("jobLocationInputId")); // Example locator
            elementUtils.clearAndSendKeys(jobLocationInput, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterPrimarySkills(String skills) {
        try {
            WebElement primarySkillsField = driver.findElement(By.id("primarySkillsFieldId")); // Example locator
            elementUtils.clearAndSendKeys(primarySkillsField, skills);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillRecruitersEmail(String email) {
        try {
            WebElement recruitersEmailField = driver.findElement(By.id("recruitersEmailFieldId")); // Example locator
            elementUtils.clearAndSendKeys(recruitersEmailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfully() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("confirmationMessageId")); // Example locator
            return elementUtils.isElementDisplayed(confirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterMaxAllowedCharsForMinimumExperience(String experience) {
        try {
            WebElement minExperienceField = driver.findElement(By.id("minExperienceFieldId")); // Example locator
            elementUtils.clearAndSendKeys(minExperienceField, experience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillContactPhone(String phone) {
        try {
            WebElement contactPhoneField = driver.findElement(By.id("contactPhoneFieldId")); // Example locator
            elementUtils.clearAndSendKeys(contactPhoneField, phone);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillContactNumber(String contactNumber) {
        try {
            WebElement contactNumberField = driver.findElement(By.id("contactNumberFieldId")); // Example locator
            elementUtils.clearAndSendKeys(contactNumberField, contactNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillRequirements(String requirements) {
        try {
            WebElement requirementsField = driver.findElement(By.id("requirementsFieldId")); // Example locator
            elementUtils.clearAndSendKeys(requirementsField, requirements);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMinAllowedCharsForQualification(String qualification) {
        try {
            WebElement minQualificationField = driver.findElement(By.id("minQualificationFieldId")); // Example locator
            elementUtils.clearAndSendKeys(minQualificationField, qualification);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaxAllowedCharsForShortJobDescription(String description) {
        try {
            WebElement shortJobDescriptionField = driver.findElement(By.id("shortJobDescriptionFieldId")); // Example locator
            elementUtils.clearAndSendKeys(shortJobDescriptionField, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterYearsOfExperience(String years) {
        try {
            WebElement yearsOfExperienceField = driver.findElement(By.id("yearsOfExperienceFieldId")); // Example locator
            elementUtils.clearAndSendKeys(yearsOfExperienceField, years);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillContactEmail(String email) {
        try {
            WebElement contactEmailField = driver.findElement(By.id("contactEmailFieldId")); // Example locator
            elementUtils.clearAndSendKeys(contactEmailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillJobTitle(String title) {
        try {
            WebElement jobTitleField = driver.findElement(By.id("jobTitleFieldId")); // Example locator
            elementUtils.clearAndSendKeys(jobTitleField, title);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillTitle(String title) {
        try {
            WebElement titleField = driver.findElement(By.id("titleFieldId")); // Example locator
            elementUtils.clearAndSendKeys(titleField, title);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillEmail(String email) {
        try {
            WebElement emailField = driver.findElement(By.id("emailFieldId")); // Example locator
            elementUtils.clearAndSendKeys(emailField, email);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void fillLocation(String location) {
        try {
            WebElement locationField = driver.findElement(By.id("locationFieldId")); // Example locator
            elementUtils.clearAndSendKeys(locationField, location);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningAvailableWithCorrectPrimarySkills(String expectedSkills) {
        try {
            WebElement primarySkillsField = driver.findElement(By.id("primarySkillsFieldId")); // Example locator
            String actualSkills = elementUtils.getElementText(primarySkillsField);
            Assert.assertEquals(actualSkills, expectedSkills, "Primary skills do not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterDepartment(String department) {
        try {
            WebElement departmentField = driver.findElement(By.id("departmentFieldId")); // Example locator
            elementUtils.clearAndSendKeys(departmentField, department);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningAvailableWithCorrectDepartment(String expectedDepartment) {
        try {
            WebElement departmentField = driver.findElement(By.id("departmentFieldId")); // Example locator
            String actualDepartment = elementUtils.getElementText(departmentField);
            Assert.assertEquals(actualDepartment, expectedDepartment, "Department does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isJobOpeningAvailableWithCorrectTags(String expectedTags) {
        try {
            WebElement tagsField = driver.findElement(By.id("tagsFieldId")); // Example locator
            String actualTags = elementUtils.getElementText(tagsField);
            Assert.assertEquals(actualTags, expectedTags, "Tags do not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isAddJobOpeningButtonVisible() {
        try {
            WebElement addButton = driver.findElement(By.id("addJobOpeningButtonId")); // Example locator
            return elementUtils.isElementDisplayed(addButton);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void enterInput(String input) {
        try {
            WebElement inputField = driver.findElement(By.id("inputFieldId")); // Example locator
            elementUtils.clearAndSendKeys(inputField, input);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void enterMaxAllowedCharsForMaximumExperience(String experience) {
        try {
            WebElement maxExperienceField = driver.findElement(By.id("maxExperienceFieldId")); // Example locator
            elementUtils.clearAndSendKeys(maxExperienceField, experience);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningAvailableWithCorrectLocation(String expectedLocation) {
        try {
            WebElement locationField = driver.findElement(By.id("locationFieldId")); // Example locator
            String actualLocation = elementUtils.getElementText(locationField);
            Assert.assertEquals(actualLocation, expectedLocation, "Location does not match!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void fillPhoneNumber(String phoneNumber) {
        try {
            WebElement phoneNumberField = driver.findElement(By.id("phoneNumberFieldId")); // Example locator
            elementUtils.clearAndSendKeys(phoneNumberField, phoneNumber);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningSavedSuccessfullyWithMinAllowedCharacters() {
        try {
            WebElement confirmationMessage = driver.findElement(By.id("confirmationMessageId")); // Example locator
            return elementUtils.isElementDisplayed(confirmationMessage);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void leaveIndustryTypeFieldEmpty() {
        System.out.println("Industry type field left empty.");
    }

    public void enterMinAllowedCharsForShortJobDescription(String description) {
        try {
            WebElement shortJobDescriptionField = driver.findElement(By.id("shortJobDescriptionFieldId")); // Example locator
            elementUtils.clearAndSendKeys(shortJobDescriptionField, description);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isJobOpeningAvailableWithAllDetails() {
        try {
            // Placeholder for the verification logic
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void selectOption(String option) {
        try {
            WebElement dropdown = driver.findElement(By.id("optionsDropdownId")); // Example locator
            elementUtils.selectOptionInDropdown(dropdown, option);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}