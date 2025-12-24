package com.backend.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.utils.ElementUtils;
import org.junit.Assert;

public class UploadNewCandidateProfilePage {
    private WebDriver driver;
    private ElementUtils elementUtils;

    @FindBy(id = "profileSection")
    private WebElement profileSection;
    @FindBy(id = "uploadIcon")
    private WebElement uploadIcon;
    @FindBy(id = "uploadButton")
    private WebElement uploadButton;
    @FindBy(id = "successMessage")
    private WebElement successMessage;
    @FindBy(id = "firstProfileUploadConfirmation")
    private WebElement firstProfileUploadConfirmation;
    @FindBy(id = "secondProfileUploadConfirmation")
    private WebElement secondProfileUploadConfirmation;
    @FindBy(id = "uploadProcessIndicator")
    private WebElement uploadProcessIndicator;
    @FindBy(id = "errorUnsupportedFileType")
    private WebElement unsupportedFileTypeError;
    @FindBy(id = "errorFileSelection")
    private WebElement fileSelectionError;
    @FindBy(id = "errorFileSizeExceed")
    private WebElement fileSizeExceedError;
    @FindBy(id = "errorCorruptedFile")
    private WebElement corruptedFileError;
    @FindBy(id = "errorNoInternet")
    private WebElement noInternetError;
    @FindBy(id = "invalidFileContentError")
    private WebElement invalidFileContentError;
    @FindBy(id = "invalidExtensionError")
    private WebElement invalidExtensionError;
    @FindBy(id = "selectedFileDisplay")
    private WebElement selectedFileDisplay;

    public UploadNewCandidateProfilePage(WebDriver driver) {
        this.driver = driver;
        this.elementUtils = new ElementUtils(driver);
        PageFactory.initElements(driver, this);
    }

    public void navigateToProfileSection() {
        elementUtils.clickElement(profileSection);
    }

    public void clickUploadIcon() {
        elementUtils.clickElement(uploadIcon);
    }

    public void clickUploadButton() {
        elementUtils.clickElement(uploadButton);
    }

    public void waitForUploadCompletion() {
        try {
            new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOf(uploadProcessIndicator));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSuccessMessageDisplayed() {
        return elementUtils.isElementDisplayed(successMessage);
    }

    public boolean isFirstProfileUploadConfirmationDisplayed() {
        return elementUtils.isElementDisplayed(firstProfileUploadConfirmation);
    }

    public boolean isSecondProfileUploadConfirmationDisplayed() {
        return elementUtils.isElementDisplayed(secondProfileUploadConfirmation);
    }

    public boolean isUploadProcessCompleted() {
        return !elementUtils.isElementDisplayed(uploadProcessIndicator);
    }

    public boolean isUnsupportedFileTypeErrorDisplayed() {
        return elementUtils.isElementDisplayed(unsupportedFileTypeError);
    }

    public boolean isFileSelectionErrorDisplayed() {
        return elementUtils.isElementDisplayed(fileSelectionError);
    }

    public boolean isFileSizeExceedErrorDisplayed() {
        return elementUtils.isElementDisplayed(fileSizeExceedError);
    }

    public boolean isCorruptedFileErrorDisplayed() {
        return elementUtils.isElementDisplayed(corruptedFileError);
    }

    public boolean isNoInternetErrorDisplayed() {
        return elementUtils.isElementDisplayed(noInternetError);
    }

    public boolean isInvalidFileContentErrorDisplayed() {
        return elementUtils.isElementDisplayed(invalidFileContentError);
    }

    public boolean isInvalidExtensionErrorDisplayed() {
        return elementUtils.isElementDisplayed(invalidExtensionError);
    }

    public boolean isSelectedFileDisplayedInUploadDialog() {
        return elementUtils.isElementDisplayed(selectedFileDisplay);
    }

    public void selectFileLargerThan(String filePath) {
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void browseSelectValidProfileFileOfType(String filePath) {
        WebElement fileInput = driver.findElement(By.id("profileFileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void openFileSelectionDialog() {
        elementUtils.clickElement(uploadButton);
    }

    public void browseSelectUnsupportedFileType(String filePath) {
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void selectBlankProfileFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("profileFileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void selectProfileFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("profileFileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void leaveFileSelectionDialogEmpty() {
        WebElement closeButton = driver.findElement(By.id("closeButton"));
        elementUtils.clickElement(closeButton);
    }

    public void clickUploadCloudIcon() {
        elementUtils.clickElement(uploadIcon);
    }

    public void selectProfileFileOfSize(String filePath) {
        WebElement fileInput = driver.findElement(By.id("profileFileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void observeSystemResponse() {
        WebElement responseMessage = driver.findElement(By.id("responseMessage"));
        String actualResponse = elementUtils.getElementText(responseMessage);
        String expectedResponse = "Expected response message"; // Update with actual expected response
        Assert.assertEquals(actualResponse, expectedResponse, "Response message does not match!");
    }

    public void selectCorruptedProfileFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("profileFileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void isSuccessConfirmationMessageDisplayedForFile() {
        WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage"));
        boolean isDisplayed = elementUtils.isElementDisplayed(confirmationMessage);
        Assert.assertTrue(isDisplayed, "Success confirmation message is not displayed!");
    }

    public void isUploadProcessInitiated() {
        WebElement uploadIndicator = driver.findElement(By.id("uploadIndicator"));
        boolean isDisplayed = elementUtils.isElementDisplayed(uploadIndicator);
        Assert.assertTrue(isDisplayed, "Upload process is not initiated!");
    }

    public void waitForUploadProcessToComplete() {
        new WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOf(uploadProcessIndicator));
    }

    public void isSuccessConfirmationMessageDisplayed() {
        WebElement confirmationMessage = driver.findElement(By.id("confirmationMessage"));
        boolean isDisplayed = elementUtils.isElementDisplayed(confirmationMessage);
        Assert.assertTrue(isDisplayed, "Success confirmation message is not displayed!");
    }

    public void disconnectInternet() {
        try {
            Runtime.getRuntime().exec("commands to disable internet connection");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isUploadIconFunctional() {
        boolean isVisible = elementUtils.isElementDisplayed(uploadIcon);
        Assert.assertTrue(isVisible, "Upload icon is not visible!");
        elementUtils.clickElement(uploadIcon);
    }

    public void isUploadIconVisibleAndClickable() {
        boolean isVisible = elementUtils.isElementDisplayed(uploadIcon);
        Assert.assertTrue(isVisible, "Upload icon is not visible!");
        boolean isClickable = uploadIcon.isEnabled();
        Assert.assertTrue(isClickable, "Upload icon is not clickable!");
    }

    public void selectFileWithoutExtension(String filePath) {
        WebElement fileInput = driver.findElement(By.id("fileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void browseSelectValidProfileFile(String filePath) {
        WebElement fileInput = driver.findElement(By.id("profileFileInput"));
        elementUtils.clearAndSendKeys(fileInput, filePath);
    }

    public void isProfileSectionDisplayed() {
        boolean isDisplayed = elementUtils.isElementDisplayed(profileSection);
        Assert.assertTrue(isDisplayed, "Profile section is not displayed!");
    }
}