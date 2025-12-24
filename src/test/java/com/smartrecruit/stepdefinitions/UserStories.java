package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com.smartrecruit.driverfactory.DriverFactory;
import com.smartrecruit.pages.UserStoriesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class FeatureUserLogin extends DriverFactory {
UserStoriesPage userStoriesPage = new UserStoriesPage(driver);
@Given("the user is on the Upload Candidate Profile Page")
public void the_user_is_on_the_upload_candidate_profile_page() {
userStoriesPage.navigateToUploadCandidateProfilePage();
}
@When("the user selects a job role as {string}")
public void the_user_selects_a_job_role_as(String jobRole) {
userStoriesPage.selectJobRole(jobRole);
}
@And("the user uploads the candidate profile as {string}")
public void the_user_uploads_the_candidate_profile_as(String candidateProfile) {
userStoriesPage.uploadCandidateProfile(candidateProfile);
}
@And("the user schedules a panel interview")
public void the_user_schedules_a_panel_interview() {
userStoriesPage.schedulePanelInterview();
}
@Then("the user should see a confirmation message")
public void the_user_should_see_a_confirmation_message() {
userStoriesPage.isConfirmationMessageDisplayed();
}