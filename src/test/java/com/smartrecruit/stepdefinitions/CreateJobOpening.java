package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.smartrecruit.pages.CreateJobOpeningPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CreateJobOpening extends DriverFactory {
CreateJobOpeningPage createJobOpeningPage = new CreateJobOpeningPage(driver);
@Given("the recruiter is on the Dashboard")
public void the_recruiter_is_on_the_dashboard() {
createJobOpeningPage.navigateToDashboard();
}
@When("the recruiter clicks on the {string} option in the side navigation")
public void the_recruiter_clicks_on_the_option_in_the_side_navigation(String option) {
createJobOpeningPage.clicksOnSideNavigationOption(option);
}
@Then("the Job Opening screen should be displayed")
public void the_job_opening_screen_should_be_displayed() {
createJobOpeningPage.isJobOpeningScreenDisplayed();
}
@And("the {string} button should be visible")
public void the_button_should_be_visible(String button) {
createJobOpeningPage.isButtonVisible(button);
}
@When("the user clicks on the Add Job Opening button")
public void the_user_clicks_on_the_add_job_opening_button() {
createJobOpeningPage.clicksOnAddJobOpeningButton();
}
@Then("the Create New Job Opening form should be opened")
public void the_create_new_job_opening_form_should_be_opened() {
createJobOpeningPage.isCreateNewJobOpeningFormOpened();
}
@And("the Save and Cancel buttons should be displayed")
public void the_save_and_cancel_buttons_should_be_displayed() {
createJobOpeningPage.areSaveAndCancelButtonsDisplayed();
}
@Given("the recruiter selects a Job Role {string}")
public void the_recruiter_selects_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@Given("the recruiter selects a Location {string}")
public void the_recruiter_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@Given("the recruiter enters Minimum Experience {string}")
public void the_recruiter_enters_minimum_experience(String minimumExperience) {
createJobOpeningPage.enterMinimumExperience(minimumExperience);
}
@Given("the recruiter enters Maximum Experience {string}")
public void the_recruiter_enters_maximum_experience(String maximumExperience) {
createJobOpeningPage.enterMaximumExperience(maximumExperience);
}
@Given("the recruiter enters Qualification {string}")
public void the_recruiter_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@Given("the recruiter enters Short Job Description {string}")
public void the_recruiter_enters_short_job_description(String shortJobDescription) {
createJobOpeningPage.enterShortJobDescription(shortJobDescription);
}
@Given("the recruiter enters Responsibilities {string}")
public void the_recruiter_enters_responsibilities(String responsibilities) {
createJobOpeningPage.enterResponsibilities(responsibilities);
}
@When("the recruiter clicks on the {string} button")
public void the_recruiter_clicks_on_the_button(String button) {
createJobOpeningPage.clicksOnButton(button);
}
@Then("the job opening should be saved successfully")
public void the_job_opening_should_be_saved_successfully() {
createJobOpeningPage.isJobOpeningSavedSuccessfully();
}
@Then("the job opening should be available in the Job Opening list")
public void the_job_opening_should_be_available_in_the_job_opening_list() {
createJobOpeningPage.isJobOpeningAvailableInList();
}
@Then("the job opening should be available in the Job Opening list with the correct Tags")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_tags() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectTags();
}
@Then("the job opening should be available in the Job Opening list with the correct Responsibilities")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_responsibilities() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectResponsibilities();
}
@Then("the job opening should be available in the Job Opening list with the correct Primary Skills")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_primary_skills() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectPrimarySkills();
}
@Then("the job opening should be available in the Job Opening list with the correct Department")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_department() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectDepartment();
}
@Then("an error message should be displayed indicating that Job Role is required")
public void an_error_message_should_be_displayed_indicating_that_job_role_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Job Role is required");
}
@Then("an error message should be displayed indicating that Minimum Experience must be less than Maximum Experience")
public void an_error_message_should_be_displayed_indicating_that_minimum_experience_must_be_less_than_maximum_experience() {
createJobOpeningPage.isErrorMessageDisplayed("Minimum Experience must be less than Maximum Experience");
}
@Then("an error message should be displayed indicating that the selected Employment Type is invalid")
public void an_error_message_should_be_displayed_indicating_that_the_selected_employment_type_is_invalid() {
createJobOpeningPage.isErrorMessageDisplayed("The selected Employment Type is invalid");
}
@Then("an error message should be displayed indicating that Total Openings is required")
public void an_error_message_should_be_displayed_indicating_that_total_openings_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Total Openings is required");
}
@Then("an error message should be displayed indicating that the selected Work Mode is invalid")
public void an_error_message_should_be_displayed_indicating_that_the_selected_work_mode_is_invalid() {
createJobOpeningPage.isErrorMessageDisplayed("The selected Work Mode is invalid");
}
@Then("an error message should be displayed indicating that Industry Type is required")
public void an_error_message_should_be_displayed_indicating_that_industry_type_is_required() {
createJobOpeningPage.isErrorMessageDisplayed("Industry Type is required");
}
@Then("an error message should be displayed indicating that Tags must be comma-separated")
public void an_error_message_should_be_displayed_indicating_that_tags_must_be_comma_separated() {
createJobOpeningPage.isErrorMessageDisplayed("Tags must be comma-separated");
}
@Then("an error message should be displayed indicating that at least one Vendor must be selected")
public void an_error_message_should_be_displayed_indicating_that_at_least_one_vendor_must_be_selected() {
createJobOpeningPage.isErrorMessageDisplayed("At least one Vendor must be selected");
}
@Then("the job opening should be saved successfully with maximum allowed characters")
public void the_job_opening_should_be_saved_successfully_with_maximum_allowed_characters() {
createJobOpeningPage.isJobOpeningSavedSuccessfullyWithMaxAllowedCharacters();
}
@Then("the job opening should be saved successfully with minimum allowed characters")
public void the_job_opening_should_be_saved_successfully_with_minimum_allowed_characters() {
createJobOpeningPage.isJobOpeningSavedSuccessfullyWithMinAllowedCharacters();
}

@Given("I enter minimum experience {string}")
public void i_enter_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Given("the admin fills in the employment type with {string}")
public void the_admin_fills_in_the_employment_type_with(String employmentType) {
createJobOpeningPage.fillEmploymentType(employmentType);
}
@Given("the user enters primary skills {string}")
public void the_user_enters_primary_skills(String primarySkills) {
createJobOpeningPage.enterPrimarySkills(primarySkills);
}
@Given("the recruiter enters tags {string}")
public void the_recruiter_enters_tags(String tags) {
createJobOpeningPage.enterTags(tags);
}
@Given("the user enters qualification {string}")
public void the_user_enters_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@When("the user clicks on the save button")
public void the_user_clicks_on_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@When("I clickElement on the save button")
public void i_click_on_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@Given("fills in the job title with {string}")
public void fills_in_the_job_title_with(String jobTitle) {
createJobOpeningPage.fillJobTitle(jobTitle);
}
@Given("leaves the industry type field empty")
public void leaves_the_industry_type_field_empty() {
createJobOpeningPage.leaveIndustryTypeFieldEmpty();
}
@Given("the user leaves the total openings field empty")
public void the_user_leaves_the_total_openings_field_empty() {
createJobOpeningPage.leaveTotalOpeningsFieldEmpty();
}
@Given("I enter maximum experience {string}")
public void i_enter_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Given("the user fills in the job title as {string}")
public void the_user_fills_in_the_job_title_as(String jobTitle) {
createJobOpeningPage.fillJobTitle(jobTitle);
}
@Given("I select {string}")
public void i_select(String option) {
createJobOpeningPage.selectOption(option);
}
@Given("I enter {string} for years of experience")
public void i_enter_for_years_of_experience(String years) {
createJobOpeningPage.enterYearsOfExperience(years);
}
@Given("the admin fills in the contact number with {string}")
public void the_admin_fills_in_the_contact_number_with(String contactNumber) {
createJobOpeningPage.fillContactNumber(contactNumber);
}
@Given("the admin enters maximum allowed characters for short job description")
public void the_admin_enters_maximum_allowed_characters_for_short_job_description() {
createJobOpeningPage.enterMaxAllowedCharsForShortJobDescription();
}
@Given("I select a job role as {string}")
public void i_select_a_job_role_as(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@Given("the recruiter enters qualification")
public void the_recruiter_enters_qualification() {
createJobOpeningPage.enterQualification();
}
@Given("I select {string} for job type")
public void i_select_for_job_type(String jobType) {
createJobOpeningPage.selectJobType(jobType);
}
@Given("the user enters minimum allowed characters for qualification")
public void the_user_enters_minimum_allowed_characters_for_qualification() {
createJobOpeningPage.enterMinAllowedCharsForQualification();
}
@Given("I select a job role {string}")
public void i_select_a_job_role(String jobRole) {
createJobOpeningPage.selectJobRole(jobRole);
}
@Given("the recruiter enters minimum experience")
public void the_recruiter_enters_minimum_experience() {
createJobOpeningPage.enterMinimumExperience();
}
@Given("I enter {string} for salary")
public void i_enter_for_salary(String salary) {
createJobOpeningPage.enterSalary(salary);
}
@Given("I enter qualification {string}")
public void i_enter_qualification(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@Given("I select {string} from the dropdown")
public void i_select_from_the_dropdown(String option) {
createJobOpeningPage.selectFromDropdown(option);
}
@Given("the admin fills in the job title with {string}")
public void the_admin_fills_in_the_job_title_with(String jobTitle) {
createJobOpeningPage.fillJobTitle(jobTitle);
}
@Given("I enter {string} for job location")
public void i_enter_for_job_location(String jobLocation) {
createJobOpeningPage.enterJobLocation(jobLocation);
}
@Given("the admin enters maximum allowed characters for qualification")
public void the_admin_enters_maximum_allowed_characters_for_qualification() {
createJobOpeningPage.enterMaxAllowedCharsForQualification();
}
@Given("the admin fills in the recruiter's email with {string}")
public void the_admin_fills_in_the_recruiters_email_with(String email) {
createJobOpeningPage.fillRecruitersEmail(email);
}
@Then("the job opening should not be saved")
public void the_job_opening_should_not_be_saved() {
createJobOpeningPage.isJobOpeningSaved();
}
@Given("I enter {string} for job description")
public void i_enter_for_job_description(String jobDescription) {
createJobOpeningPage.enterJobDescription(jobDescription);
}
@Given("I enter {string}")
public void i_enter(String input) {
createJobOpeningPage.enterInput(input);
}
@Given("the user enters maximum experience {string}")
public void the_user_enters_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Given("I enter {string} for contact email")
public void i_enter_for_contact_email(String contactEmail) {
createJobOpeningPage.enterContactEmail(contactEmail);
}
@Given("the user selects a job role")
public void the_user_selects_a_job_role() {
createJobOpeningPage.selectJobRole();
}
@Given("the user selects a location")
public void the_user_selects_a_location() {
createJobOpeningPage.selectLocation();
}
@Given("I enter qualification as {string}")
public void i_enter_qualification_as(String qualification) {
createJobOpeningPage.enterQualification(qualification);
}
@Given("the admin fills in the job posting date with {string}")
public void the_admin_fills_in_the_job_posting_date_with(String postingDate) {
createJobOpeningPage.fillJobPostingDate(postingDate);
}
@Given("the user fills in the location as {string}")
public void the_user_fills_in_the_location_as(String location) {
createJobOpeningPage.fillLocation(location);
}
@Given("the user enters minimum allowed characters for short job description")
public void the_user_enters_minimum_allowed_characters_for_short_job_description() {
createJobOpeningPage.enterMinAllowedCharsForShortJobDescription();
}
@When("the recruiter clicks on the save button")
public void the_recruiter_clicks_on_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@Then("the job opening should be available in the job opening list with the correct vendors")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_vendors() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectVendors();
}
@Given("the user fills in the job description as {string}")
public void the_user_fills_in_the_job_description_as(String jobDescription) {
createJobOpeningPage.fillJobDescription(jobDescription);
}
@Given("I select a location as {string}")
public void i_select_a_location_as(String location) {
createJobOpeningPage.selectLocation(location);
}
@Given("I enter {string} for job title")
public void i_enter_for_job_title(String jobTitle) {
createJobOpeningPage.enterJobTitle(jobTitle);
}
@When("I clickElement the save button")
public void i_click_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@Given("the user fills in the responsibilities {string}")
public void the_user_fills_in_the_responsibilities(String responsibilities) {
createJobOpeningPage.fillResponsibilities(responsibilities);
}
@Then("the job opening should be available in the job opening list with the correct location")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_the_correct_location() {
createJobOpeningPage.isJobOpeningAvailableWithCorrectLocation();
}
@Given("I leave optional fields empty")
public void i_leave_optional_fields_empty() {
createJobOpeningPage.leaveOptionalFieldsEmpty();
}
@Given("the user clicks the save button")
public void the_user_clicks_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@Given("the admin fills in all other required fields with valid data")
public void the_admin_fills_in_all_other_required_fields_with_valid_data() {
createJobOpeningPage.fillAllRequiredFieldsWithValidData();
}
@Given("I select a valid location {string}")
public void i_select_a_valid_location(String location) {
createJobOpeningPage.selectValidLocation(location);
}
@Given("the user fills in the requirements as {string}")
public void the_user_fills_in_the_requirements_as(String requirements) {
createJobOpeningPage.fillRequirements(requirements);
}
@Given("the user fills in the salary {string}")
public void the_user_fills_in_the_salary(String salary) {
createJobOpeningPage.fillSalary(salary);
}
@Given("the user fills in all other required fields with valid data")
public void the_user_fills_in_all_other_required_fields_with_valid_data() {
createJobOpeningPage.fillAllRequiredFieldsWithValidData();
}
@When("the admin clicks on the save button")
public void the_admin_clicks_on_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@Given("fills in the phone number with {string}")
public void fills_in_the_phone_number_with(String phoneNumber) {
createJobOpeningPage.fillPhoneNumber(phoneNumber);
}
@Given("the user fills in the description {string}")
public void the_user_fills_in_the_description(String description) {
createJobOpeningPage.fillDescription(description);
}
@Given("the user fills in the title {string}")
public void the_user_fills_in_the_title(String title) {
createJobOpeningPage.fillTitle(title);
}
@Given("the user enters minimum experience {string}")
public void the_user_enters_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Given("the recruiter enters department {string}")
public void the_recruiter_enters_department(String department) {
createJobOpeningPage.enterDepartment(department);
}
@Given("the user fills in the salary as {string}")
public void the_user_fills_in_the_salary_as(String salary) {
createJobOpeningPage.fillSalary(salary);
}
@Given("the user fills in the requirements {string}")
public void the_user_fills_in_the_requirements(String requirements) {
createJobOpeningPage.fillRequirements(requirements);
}
@Given("the user enters minimum allowed characters for minimum experience")
public void the_user_enters_minimum_allowed_characters_for_minimum_experience() {
createJobOpeningPage.enterMinAllowedCharsForMinimumExperience();
}
@Given("the admin selects a location")
public void the_admin_selects_a_location() {
createJobOpeningPage.selectLocation();
}
@Given("the user fills in the contact email as {string}")
public void the_user_fills_in_the_contact_email_as(String contactEmail) {
createJobOpeningPage.fillContactEmail(contactEmail);
}
@Given("the admin fills in the job location with {string}")
public void the_admin_fills_in_the_job_location_with(String jobLocation) {
createJobOpeningPage.fillJobLocation(jobLocation);
}
@Given("I enter minimum experience as {string}")
public void i_enter_minimum_experience_as(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Then("an error message should be displayed indicating that the selected duration is invalid")
public void an_error_message_should_be_displayed_indicating_that_the_selected_duration_is_invalid() {
createJobOpeningPage.isErrorMessageDisplayed();
}
@Given("the admin selects a job role")
public void the_admin_selects_a_job_role() {
createJobOpeningPage.selectJobRole();
}
@Given("the recruiter enters maximum experience")
public void the_recruiter_enters_maximum_experience() {
createJobOpeningPage.enterMaximumExperience();
}
@Given("the recruiter clicks on the job opening option in the side navigation")
public void the_recruiter_clicks_on_the_job_opening_option_in_the_side_navigation() {
createJobOpeningPage.clickJobOpeningOption();
}
@When("the admin clicks the save button")
public void the_admin_clicks_the_save_button() {
createJobOpeningPage.clickSaveButton();
}
@Given("the recruiter selects a location")
public void the_recruiter_selects_a_location() {
createJobOpeningPage.selectLocation();
}
@Then("the job opening should be available in the job opening list with all details correctly displayed")
public void the_job_opening_should_be_available_in_the_job_opening_list_with_all_details_correctly_displayed() {
createJobOpeningPage.isJobOpeningAvailableWithAllDetails();
}
@Given("the user fills in the location {string}")
public void the_user_fills_in_the_location(String location) {
createJobOpeningPage.fillLocation(location);
}
@Given("I enter maximum experience as {string}")
public void i_enter_maximum_experience_as(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Given("fills in the email with {string}")
public void fills_in_the_email_with(String email) {
createJobOpeningPage.fillEmail(email);
}
@Given("the user selects a location {string}")
public void the_user_selects_a_location(String location) {
createJobOpeningPage.selectLocation(location);
}
@Given("the admin enters maximum allowed characters for minimum experience")
public void the_admin_enters_maximum_allowed_characters_for_minimum_experience() {
createJobOpeningPage.enterMaxAllowedCharsForMinimumExperience();
}
@Given("I enter {string} for maximum experience")
public void i_enter_for_maximum_experience(String maxExperience) {
createJobOpeningPage.enterMaximumExperience(maxExperience);
}
@Given("the user enters minimum allowed characters for maximum experience")
public void the_user_enters_minimum_allowed_characters_for_maximum_experience() {
createJobOpeningPage.enterMinAllowedCharsForMaximumExperience();
}
@Given("the user fills in the contact phone as {string}")
public void the_user_fills_in_the_contact_phone_as(String contactPhone) {
createJobOpeningPage.fillContactPhone(contactPhone);
}
@Given("I enter {string} for minimum experience")
public void i_enter_for_minimum_experience(String minExperience) {
createJobOpeningPage.enterMinimumExperience(minExperience);
}
@Then("the add job opening button should be visible")
public void the_add_job_opening_button_should_be_visible() {
createJobOpeningPage.isAddJobOpeningButtonVisible();
}
@Given("the user fills in the contact email {string}")
public void the_user_fills_in_the_contact_email(String contactEmail) {
createJobOpeningPage.fillContactEmail(contactEmail);
}
@Given("the admin enters maximum allowed characters for maximum experience")
public void the_admin_enters_maximum_allowed_characters_for_maximum_experience() {
createJobOpeningPage.enterMaxAllowedCharsForMaximumExperience();
}
@Given("fills in the employment type with {string}")
public void fills_in_the_employment_type_with(String employmentType) {
createJobOpeningPage.fillEmploymentType(employmentType);
}
}