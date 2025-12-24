package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.smartrecruit.pages.UploadNewCandidateProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class UploadNewCandidateProfile extends DriverFactory {
UploadNewCandidateProfilePage uploadNewCandidateProfilePage = new UploadNewCandidateProfilePage(driver);
@Given("the user is on the Profile section")
public void the_user_is_on_the_profile_section() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@When("the user clicks on the upload (cloud) icon")
public void the_user_clicks_on_the_upload_icon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@When("the user browses and selects a valid profile file")
public void the_user_browses_and_selects_a_valid_profile_file(String validProfileFile) {
uploadNewCandidateProfilePage.selectProfileFile(validProfileFile);
}
@When("the user clicks on the Upload button")
public void the_user_clicks_on_the_upload_button() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the user waits for the upload process to complete")
public void the_user_waits_for_the_upload_process_to_complete() {
uploadNewCandidateProfilePage.waitForUploadCompletion();
}
@Then("a success confirmation message is displayed to the user")
public void a_success_confirmation_message_is_displayed_to_the_user() {
uploadNewCandidateProfilePage.isSuccessMessageDisplayed();
}
@When("the user browses and selects the {string} file")
public void the_user_browses_and_selects_the_file(String profileFile) {
uploadNewCandidateProfilePage.selectProfileFile(profileFile);
}
@Then("the user should see a confirmation message for the first profile upload")
public void the_user_should_see_a_confirmation_message_for_the_first_profile_upload() {
uploadNewCandidateProfilePage.isFirstProfileUploadConfirmationDisplayed();
}
@Then("the upload icon remains functional after the first upload")
public void the_upload_icon_remains_functional_after_the_first_upload() {
uploadNewCandidateProfilePage.isUploadIconFunctional();
}
@Then("the user should see a confirmation message for the second profile upload")
public void the_user_should_see_a_confirmation_message_for_the_second_profile_upload() {
uploadNewCandidateProfilePage.isSecondProfileUploadConfirmationDisplayed();
}
@When("the user browses and selects a valid profile file of {string}")
public void the_user_browses_and_selects_a_valid_profile_file_of(String fileSize) {
uploadNewCandidateProfilePage.selectProfileFileOfSize(fileSize);
}
@Then("the upload process should complete")
public void the_upload_process_should_complete() {
uploadNewCandidateProfilePage.isUploadProcessCompleted();
}
@When("the user browses and selects a valid profile file named {string}")
public void the_user_browses_and_selects_a_valid_profile_file_named(String filename) {
uploadNewCandidateProfilePage.selectProfileFile(filename);
}
@Then("an error message is displayed indicating the file type is not supported")
public void an_error_message_is_displayed_indicating_the_file_type_is_not_supported() {
uploadNewCandidateProfilePage.isUnsupportedFileTypeErrorDisplayed();
}
@Then("an error message is displayed indicating that a file must be selected")
public void an_error_message_is_displayed_indicating_that_a_file_must_be_selected() {
uploadNewCandidateProfilePage.isFileSelectionErrorDisplayed();
}
@When("the user browses and selects a file larger than {string}")
public void the_user_browses_and_selects_a_file_larger_than(String fileSize) {
uploadNewCandidateProfilePage.selectFileLargerThan(fileSize);
}
@Then("an error message is displayed indicating that the file size exceeds the limit")
public void an_error_message_is_displayed_indicating_that_the_file_size_exceeds_the_limit() {
uploadNewCandidateProfilePage.isFileSizeExceedErrorDisplayed();
}
@When("the user browses and selects a corrupted profile file")
public void the_user_browses_and_selects_a_corrupted_profile_file() {
uploadNewCandidateProfilePage.selectCorruptedProfileFile();
}
@Then("an error message is displayed indicating that the file is corrupted and cannot be uploaded")
public void an_error_message_is_displayed_indicating_that_the_file_is_corrupted_and_cannot_be_uploaded() {
uploadNewCandidateProfilePage.isCorruptedFileErrorDisplayed();
}
@When("the user disconnects the internet connection")
public void the_user_disconnects_the_internet_connection() {
uploadNewCandidateProfilePage.disconnectInternet();
}
@Then("an error message is displayed indicating that the upload cannot proceed due to no internet connection")
public void an_error_message_is_displayed_indicating_that_the_upload_cannot_proceed_due_to_no_internet_connection() {
uploadNewCandidateProfilePage.isNoInternetErrorDisplayed();
}
@When("the user browses and selects a blank profile file")
public void the_user_browses_and_selects_a_blank_profile_file() {
uploadNewCandidateProfilePage.selectBlankProfileFile();
}
@Then("the user should see an error message indicating that the file content is invalid")
public void the_user_should_see_an_error_message_indicating_that_the_file_content_is_invalid() {
uploadNewCandidateProfilePage.isInvalidFileContentErrorDisplayed();
}
@When("the user browses and selects a file without an extension")
public void the_user_browses_and_selects_a_file_without_an_extension() {
uploadNewCandidateProfilePage.selectFileWithoutExtension();
}
@Then("the system displays an error message indicating that the file must have a valid extension")
public void the_system_displays_an_error_message_indicating_that_the_file_must_have_a_valid_extension() {
uploadNewCandidateProfilePage.isInvalidExtensionErrorDisplayed();
}

@Given("I browse select a valid profile file named {string}")
public void iBrowseSelectAValidProfileFileNamed(String fileName) {
uploadNewCandidateProfilePage.browseSelectValidProfileFile(fileName);
}
@When("the admin clicks on the upload button")
public void theAdminClicksOnTheUploadButton() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Given("the user leaves the file selection dialog empty")
public void theUserLeavesTheFileSelectionDialogEmpty() {
uploadNewCandidateProfilePage.leaveFileSelectionDialogEmpty();
}
@When("the admin waits for the upload process to complete")
public void theAdminWaitsForTheUploadProcessToComplete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@Given("the file selection dialog opens")
public void theFileSelectionDialogOpens() {
uploadNewCandidateProfilePage.openFileSelectionDialog();
}
@Then("the upload process initiates successfully")
public void theUploadProcessInitiatesSuccessfully() {
"Upload process did not initiate successfully", uploadNewCandidateProfilePage.isUploadProcessInitiated();
}
@When("I clickElement on the upload button")
public void iClickOnTheUploadButton() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@Given("I browse select a valid profile file")
public void iBrowseSelectAValidProfileFile() {
uploadNewCandidateProfilePage.browseSelectValidProfileFile();
}
@Then("the user should wait for the upload process to complete")
public void theUserShouldWaitForTheUploadProcessToComplete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@Then("a success confirmation message should be displayed to the user")
public void aSuccessConfirmationMessageShouldBeDisplayedToTheUser() {
"Success confirmation message not displayed", uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@When("the user clicks on the upload icon")
public void theUserClicksOnTheUploadIcon() {
uploadNewCandidateProfilePage.clickUploadIcon();
}
@Then("the upload icon is visible clickable")
public void theUploadIconIsVisibleClickable() {
"Upload icon is not visible or clickable", uploadNewCandidateProfilePage.isUploadIconVisibleAndClickable();
}
@When("the user clicks the upload button")
public void theUserClicksTheUploadButton() {
uploadNewCandidateProfilePage.clickUploadButton();
}
@When("the admin browses selects a valid {string} profile file")
public void theAdminBrowsesSelectsAValidProfileFile(String fileType) {
uploadNewCandidateProfilePage.browseSelectValidProfileFileOfType(fileType);
}
@When("I wait for the upload process to complete")
public void iWaitForTheUploadProcessToComplete() {
uploadNewCandidateProfilePage.waitForUploadProcessToComplete();
}
@Then("the selected file is displayed in the upload dialog")
public void theSelectedFileIsDisplayedInTheUploadDialog() {
"Selected file not displayed in upload dialog", uploadNewCandidateProfilePage.isSelectedFileDisplayedInUploadDialog();
}
@When("I clickElement on the upload (cloud) icon")
public void iClickOnTheUploadCloudIcon() {
uploadNewCandidateProfilePage.clickUploadCloudIcon();
}
@Given("the user browses selects an unsupported file type {string}")
public void theUserBrowsesSelectsAnUnsupportedFileType(String fileType) {
uploadNewCandidateProfilePage.browseSelectUnsupportedFileType(fileType);
}
@Given("the user browses selects the valid profile file named {string}")
public void theUserBrowsesSelectsTheValidProfileFileNamed(String fileName) {
uploadNewCandidateProfilePage.browseSelectValidProfileFile(fileName);
}
@Given("the user browses selects a valid profile file of 2mb")
public void theUserBrowsesSelectsAValidProfileFileOf2mb() {
uploadNewCandidateProfilePage.browseSelectValidProfileFileOfSize2MB();
}
@Then("the user should see a success confirmation message")
public void theUserShouldSeeASuccessConfirmationMessage() {
"Success confirmation message not displayed", uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
@Then("a success confirmation message is displayed for the {string} file uploaded")
public void aSuccessConfirmationMessageIsDisplayedForTheFileUploaded(String fileName) {
"Success confirmation message not displayed for file: " + fileName, uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayedForFile(fileName);
}
@When("the admin clicks on the upload (cloud) icon")
public void theAdminClicksOnTheUploadCloudIcon() {
uploadNewCandidateProfilePage.clickUploadCloudIcon();
}
@When("the user navigates to the profile section from the side navigation")
public void theUserNavigatesToTheProfileSectionFromTheSideNavigation() {
uploadNewCandidateProfilePage.navigateToProfileSection();
}
@Then("the user observes that the profile section is displayed")
public void theUserObservesThatTheProfileSectionIsDisplayed() {
"Profile section is not displayed", uploadNewCandidateProfilePage.isProfileSectionDisplayed();
}
@Then("I observe the system's response")
public void iObserveTheSystemsResponse() {
uploadNewCandidateProfilePage.observeSystemResponse();
}
@Then("I should see a success confirmation message displayed to the user")
public void iShouldSeeASuccessConfirmationMessageDisplayedToTheUser() {
"Success confirmation message not displayed", uploadNewCandidateProfilePage.isSuccessConfirmationMessageDisplayed();
}
}