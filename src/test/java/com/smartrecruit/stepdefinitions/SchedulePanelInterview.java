package com.smartrecruit.stepdefinitions;

import com..utils.ElementUtils;
import org.junit.Assert;
import com..driverfactory.DriverFactory;
import com.smartrecruit.pages.SchedulePanelInterviewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SchedulePanelInterview extends DriverFactory {
SchedulePanelInterviewPage schedulePanelInterviewPage = new SchedulePanelInterviewPage(driver);
@Given("the user is on the Schedule Interview section")
public void the_user_is_on_the_schedule_interview_section() {
driver = DriverFactory.getDriver();
schedulePanelInterviewPage.navigateToScheduleInterviewSection();
}
@When("I click on Create Interview")
public void i_click_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@When("I select job opening {string}")
public void i_select_job_opening(String jobOpening) {
schedulePanelInterviewPage.selectJobOpening(jobOpening);
}
@When("I select location {string}")
public void i_select_location(String location) {
schedulePanelInterviewPage.selectLocation(location);
}
@When("I enter the Candidate's email address as {string}")
public void i_enter_the_candidates_email_address_as(String candidateEmail) {
schedulePanelInterviewPage.enterCandidateEmail(candidateEmail);
}
@When("I choose the Panel Interview option")
public void i_choose_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("I select the interview Date as {string}")
public void i_select_interview_date_as(String interviewDate) {
schedulePanelInterviewPage.selectInterviewDate(interviewDate);
}
@When("I select Start Time as {string}")
public void i_select_start_time_as(String startTime) {
schedulePanelInterviewPage.selectStartTime(startTime);
}
@When("I select attendees {string}")
public void i_select_attendees(String attendees) {
schedulePanelInterviewPage.selectAttendees(attendees);
}
@When("I select interview round {string}")
public void i_select_interview_round(String interviewRound) {
schedulePanelInterviewPage.selectInterviewRound(interviewRound);
}
@When("I select interview provider {string}")
public void i_select_interview_provider(String interviewProvider) {
schedulePanelInterviewPage.selectInterviewProvider(interviewProvider);
}
@When("I click on Next")
public void i_click_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("I attach required files")
public void i_attach_required_files() {
schedulePanelInterviewPage.attachRequiredFiles();
}
@When("I click on Confirm and Send")
public void i_click_on_confirm_and_send() {
schedulePanelInterviewPage.clickConfirmAndSend();
}
@Then("the system displays a confirmation message for the scheduled interview")
public void the_system_displays_confirmation_message() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@When("the user clicks on Edit Interview")
public void the_user_clicks_on_edit_interview() {
schedulePanelInterviewPage.clickEditInterview();
}
@When("the user modifies the Interview Date and Start Time")
public void the_user_modifies_interview_date_and_start_time() {
schedulePanelInterviewPage.modifyInterviewDateAndStartTime();
}
@When("the user changes the Attendees if necessary")
public void the_user_changes_attendees_if_necessary() {
schedulePanelInterviewPage.changeAttendeesIfNecessary();
}
@When("the user clicks on Save Changes")
public void the_user_clicks_on_save_changes() {
schedulePanelInterviewPage.clickSaveChanges();
}
@Then("the system displays a confirmation message for the updated interview")
public void the_system_displays_confirmation_message_for_updated_interview() {
schedulePanelInterviewPage.isUpdatedInterviewConfirmationDisplayed();
}
@Then("the updated interview details are saved in the system")
public void the_updated_interview_details_are_saved_in_the_system() {
schedulePanelInterviewPage.isUpdatedInterviewDetailsSaved();
}
@Then("notifications are sent to all updated participants")
public void notifications_are_sent_to_all_updated_participants() {
schedulePanelInterviewPage.areNotificationsSentToParticipants();
}
@Then("the interview appears in the calendar of all attendees with updated details")
public void the_interview_appears_in_calendar_of_all_attendees() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@Then("the candidate receives an email notification with updated interview details")
public void the_candidate_receives_email_notification_with_updated_details() {
schedulePanelInterviewPage.isEmailNotificationReceivedByCandidate();
}
@Then("the recruiter can view the updated interview in their dashboard")
public void the_recruiter_can_view_updated_interview_in_dashboard() {
schedulePanelInterviewPage.isUpdatedInterviewVisibleInDashboard();
}
@When("the recruiter selects a scheduled panel interview to cancel")
public void the_recruiter_selects_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectScheduledInterviewToCancel();
}
@When("the recruiter clicks on Cancel Interview")
public void the_recruiter_clicks_on_cancel_interview() {
schedulePanelInterviewPage.clickCancelInterview();
}
@When("the recruiter confirms the cancellation in the prompt")
public void the_recruiter_confirms_cancellation_in_prompt() {
schedulePanelInterviewPage.confirmCancellation();
}
@Then("the system displays a confirmation message for the cancellation")
public void the_system_displays_confirmation_message_for_cancellation() {
schedulePanelInterviewPage.isCancellationConfirmationDisplayed();
}
@Then("the interview is removed from the scheduled interviews list")
public void the_interview_is_removed_from_scheduled_interviews_list() {
schedulePanelInterviewPage.isInterviewInScheduledList();
}
@Then("notifications are sent to all participants about the cancellation")
public void notifications_are_sent_to_all_participants_about_cancellation() {
schedulePanelInterviewPage.areCancellationNotificationsSent();
}
@Then("the candidate receives an email notification about the cancellation")
public void the_candidate_receives_email_notification_about_cancellation() {
schedulePanelInterviewPage.isCancellationEmailReceivedByCandidate();
}
@Then("the recruiter can no longer view the canceled interview in their dashboard")
public void the_recruiter_can_no_longer_view_canceled_interview_in_dashboard() {
schedulePanelInterviewPage.isCanceledInterviewVisibleInDashboard();
}
@When("the recruiter schedules a panel interview")
public void the_recruiter_schedules_a_panel_interview() {
schedulePanelInterviewPage.schedulePanelInterview();
}
@When("the participants check their email inbox")
public void the_participants_check_their_email_inbox() {
schedulePanelInterviewPage.checkParticipantsEmailInbox();
}
@Then("all participants should receive an email notification about the scheduled interview")
public void all_participants_should_receive_email_notification() {
schedulePanelInterviewPage.areAllParticipantsNotified();
}
@Then("the email should contain the correct interview details")
public void the_email_should_contain_correct_interview_details() {
schedulePanelInterviewPage.isEmailContentCorrect();
}
@Then("the email should be sent to the correct email addresses")
public void the_email_should_be_sent_to_correct_email_addresses() {
schedulePanelInterviewPage.areEmailAddressesCorrect();
}
@Then("the email should be formatted correctly and easy to read")
public void the_email_should_be_formatted_correctly_and_easy_to_read() {
schedulePanelInterviewPage.isEmailFormattedCorrectly();
}
@When("I navigate to the calendar section of the application")
public void i_navigate_to_calendar_section() {
schedulePanelInterviewPage.navigateToCalendarSection();
}
@Then("the scheduled panel interview should appear on the calendar of all participants")
public void the_scheduled_panel_interview_should_appear_on_calendar() {
schedulePanelInterviewPage.isInterviewOnCalendar();
}
@Then("the interview details should be correctly displayed on the calendar")
public void the_interview_details_should_be_correctly_displayed_on_calendar() {
schedulePanelInterviewPage.isInterviewDetailsDisplayedCorrectly();
}
@Then("participants can click on the interview to view more details")
public void participants_can_click_on_interview_to_view_more_details() {
schedulePanelInterviewPage.canParticipantsViewMoreDetails();
}
@When("the user leaves the Job Opening field empty")
public void the_user_leaves_job_opening_field_empty() {
schedulePanelInterviewPage.leaveJobOpeningFieldEmpty();
}
@Then("the system displays an error message indicating that the Job Opening must be selected")
public void the_system_displays_error_message_job_opening_must_be_selected() {
schedulePanelInterviewPage.isJobOpeningErrorMessageDisplayed();
}
@Then("the user remains on the scheduling page")
public void the_user_remains_on_scheduling_page() {
schedulePanelInterviewPage.isOnSchedulingPage();
}
@Then("no interview is scheduled")
public void no_interview_is_scheduled() {
schedulePanelInterviewPage.isInterviewScheduled();
}
@Then("the Job Opening field is highlighted for correction")
public void the_job_opening_field_is_highlighted_for_correction() {
schedulePanelInterviewPage.isJobOpeningFieldHighlighted();
}
@When("the user leaves the Candidate field empty")
public void the_user_leaves_candidate_field_empty() {
schedulePanelInterviewPage.leaveCandidateFieldEmpty();
}
@Then("the system displays an error message indicating that a Candidate must be selected")
public void the_system_displays_error_message_candidate_must_be_selected() {
schedulePanelInterviewPage.isCandidateErrorMessageDisplayed();
}
@When("the user leaves the Interview Date field empty")
public void the_user_leaves_interview_date_field_empty() {
schedulePanelInterviewPage.leaveInterviewDateFieldEmpty();
}
@Then("the system displays an error message indicating that an Interview Date must be selected")
public void the_system_displays_error_message_interview_date_must_be_selected() {
schedulePanelInterviewPage.isInterviewDateErrorMessageDisplayed();
}
@When("the user leaves the Start Time field empty")
public void the_user_leaves_start_time_field_empty() {
schedulePanelInterviewPage.leaveStartTimeFieldEmpty();
}
@Then("the system displays an error message indicating that a Start Time must be selected")
public void the_system_displays_error_message_start_time_must_be_selected() {
schedulePanelInterviewPage.isStartTimeErrorMessageDisplayed();
}
@When("the user selects a past Interview Date {string}")
public void the_user_selects_past_interview_date(String interviewDate) {
schedulePanelInterviewPage.selectPastInterviewDate(interviewDate);
}
@Then("the system displays an error message indicating that the Interview Date cannot be in the past")
public void the_system_displays_error_message_interview_date_cannot_be_in_past() {
schedulePanelInterviewPage.isPastInterviewDateErrorMessageDisplayed();
}
@When("the user selects Start Time {string} that overlaps with an existing interview")
public void the_user_selects_start_time_that_overlaps_with_existing_interview(String startTime) {
schedulePanelInterviewPage.selectOverlappingStartTime(startTime);
}
@Then("the system displays an error message indicating that the interview time overlaps with an existing interview")
public void the_system_displays_error_message_interview_time_overlaps_with_existing_interview() {
schedulePanelInterviewPage.isOverlappingInterviewTimeErrorMessageDisplayed();
}
@When("the user selects a past scheduled panel interview to edit")
public void the_user_selects_past_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectPastScheduledInterviewToEdit();
}
@Then("the system displays an error message indicating that past interviews cannot be edited")
public void the_system_displays_error_message_past_interviews_cannot_be_edited() {
schedulePanelInterviewPage.isPastInterviewEditErrorMessageDisplayed();
}
@When("the user selects a past scheduled panel interview to cancel")
public void the_user_selects_past_scheduled_panel_interview_to_cancel() {
schedulePanelInterviewPage.selectPastScheduledInterviewToCancel();
}
@Then("the system displays an error message indicating that past interviews cannot be canceled")
public void the_system_displays_error_message_past_interviews_cannot_be_canceled() {
schedulePanelInterviewPage.isPastInterviewCancelErrorMessageDisplayed();
}

@When("the user enters {string}")
public void the_user_enters(String input) {
schedulePanelInterviewPage.enterInput(input);
}
@When("the user attaches required files")
public void the_user_attaches_required_files() {
schedulePanelInterviewPage.attachRequiredFiles();
}
@Then("no changes are made to the interview status")
public void no_changes_are_made_to_the_interview_status() {
schedulePanelInterviewPage.isInterviewStatusChanged();
}
@Then("the interview date field is highlighted for correction")
public void the_interview_date_field_is_highlighted_for_correction() {
schedulePanelInterviewPage.isInterviewDateFieldHighlighted();
}
@When("the recruiter chooses the panel interview option")
public void the_recruiter_chooses_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("i schedule a panel interview as a recruiter")
public void i_schedule_a_panel_interview_as_a_recruiter() {
schedulePanelInterviewPage.schedulePanelInterview();
}
@When("the user selects attendees interview round")
public void the_user_selects_attendees_interview_round() {
schedulePanelInterviewPage.selectAttendeesInterviewRound();
}
@When("the user selects {string} {string}")
public void the_user_selects(String firstOption, String secondOption) {
schedulePanelInterviewPage.selectOptions(firstOption, secondOption);
}
@When("selects the interview provider")
public void selects_the_interview_provider() {
schedulePanelInterviewPage.selectInterviewProvider();
}
@Then("no changes are saved")
public void no_changes_are_saved() {
schedulePanelInterviewPage.areChangesSaved();
}
@When("the recruiter clicks on confirm send")
public void the_recruiter_clicks_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@When("the recruiter attaches required files")
public void the_recruiter_attaches_required_files() {
schedulePanelInterviewPage.attachRequiredFiles();
}
@When("the user fills in optional fields with notes {string} instructions {string}")
public void the_user_fills_in_optional_fields_with_notes_instructions(String notes, String instructions) {
schedulePanelInterviewPage.fillOptionalFields(notes, instructions);
}
@When("the user selects a location from the available options")
public void the_user_selects_a_location_from_the_available_options() {
schedulePanelInterviewPage.selectLocation();
}
@When("the user selects a job opening from the dropdown")
public void the_user_selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpening();
}
@When("the user selects the interview date start time")
public void the_user_selects_the_interview_date_start_time() {
schedulePanelInterviewPage.selectInterviewDateStartTime();
}
@When("the recruiter selects {string} from the dropdown")
public void the_recruiter_selects_from_the_dropdown(String option) {
schedulePanelInterviewPage.selectFromDropdown(option);
}
@When("the user chooses the {string}")
public void the_user_chooses_the(String option) {
schedulePanelInterviewPage.chooseOption(option);
}
@When("the user selects {string} from the dropdown")
public void the_user_selects_from_the_dropdown(String option) {
schedulePanelInterviewPage.selectFromDropdown(option);
}
@When("clicks on confirm send")
public void clicks_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@When("the user attaches {string}")
public void the_user_attaches(String file) {
schedulePanelInterviewPage.attachFile(file);
}
@When("the recruiter clicks on create interview")
public void the_recruiter_clicks_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@Then("the interview appears in the calendar of all attendees")
public void the_interview_appears_in_the_calendar_of_all_attendees() {
schedulePanelInterviewPage.isInterviewInCalendar();
}
@When("the user selects the interview provider")
public void the_user_selects_the_interview_provider() {
schedulePanelInterviewPage.selectInterviewProvider();
}
@When("the user enters the cidate's email address selects the cidate")
public void the_user_enters_the_cidate_email_address_selects_the_cidate() {
schedulePanelInterviewPage.enterCidateEmailAndSelect();
}
@When("clicks on next")
public void clicks_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("the recruiter selects {string} from the available options")
public void the_recruiter_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.selectFromAvailableOptions(option);
}
@Then("the cidate receives an email notification with interview details")
public void the_cidate_receives_an_email_notification_with_interview_details() {
schedulePanelInterviewPage.isCidateNotified();
}
@When("the user clicks on confirm send")
public void the_user_clicks_on_confirm_send() {
schedulePanelInterviewPage.clickConfirmSend();
}
@Then("the user can still view the original interview details")
public void the_user_can_still_view_the_original_interview_details() {
schedulePanelInterviewPage.canViewOriginalDetails();
}
@Then("notifications are sent to all participants, including the cidate")
public void notifications_are_sent_to_all_participants_including_the_cidate() {
schedulePanelInterviewPage.areNotificationsSent();
}
@When("enters a cidate's email address {string}")
public void enters_a_cidate_email_address(String email) {
schedulePanelInterviewPage.enterCidateEmail(email);
}
@Then("the user remains on the edit page")
public void the_user_remains_on_the_edit_page() {
schedulePanelInterviewPage.isOnEditPage();
}
@When("the user selects an interview date")
public void the_user_selects_an_interview_date() {
schedulePanelInterviewPage.selectInterviewDate();
}
@When("selects a location from the available options")
public void selects_a_location_from_the_available_options() {
schedulePanelInterviewPage.selectLocation();
}
@When("selects the interview date start time")
public void selects_the_interview_date_start_time() {
schedulePanelInterviewPage.selectInterviewDateStartTime();
}
@When("selects attendees interview round")
public void selects_attendees_interview_round() {
schedulePanelInterviewPage.selectAttendeesInterviewRound();
}
@When("the user attempts to change any details")
public void the_user_attempts_to_change_any_details() {
schedulePanelInterviewPage.attemptToChangeDetails();
}
@Then("notifications are sent to all participants")
public void notifications_are_sent_to_all_participants() {
schedulePanelInterviewPage.areNotificationsSentToParticipants();
}
@Then("the interview details are saved in the system")
public void the_interview_details_are_saved_in_the_system() {
schedulePanelInterviewPage.areInterviewDetailsSaved();
}
@When("the recruiter enters {string} selects the cidate")
public void the_recruiter_enters_selects_the_cidate(String input) {
schedulePanelInterviewPage.enterRecruiterInputAndSelectCidate(input);
}
@When("the user selects the interview provider {string}")
public void the_user_selects_the_interview_provider(String provider) {
schedulePanelInterviewPage.selectInterviewProvider(provider);
}
@When("the recruiter selects {string}")
public void the_recruiter_selects(String option) {
schedulePanelInterviewPage.selectOption(option);
}
@When("the user clicks on create interview")
public void the_user_clicks_on_create_interview() {
schedulePanelInterviewPage.clickCreateInterview();
}
@When("enters {string} selects the cidate")
public void enters_selects_the_cidate(String input) {
schedulePanelInterviewPage.enterInputAndSelectCidate(input);
}
@When("the user selects a scheduled panel interview to edit")
public void the_user_selects_a_scheduled_panel_interview_to_edit() {
schedulePanelInterviewPage.selectScheduledPanelInterviewToEdit();
}
@When("the user selects {string}")
public void the_user_selects(String option) {
schedulePanelInterviewPage.selectOption(option);
}
@When("the user selects start time")
public void the_user_selects_start_time() {
schedulePanelInterviewPage.selectStartTime();
}
@When("the user enters the cidate's email address {string} selects the cidate")
public void the_user_enters_the_cidate_email_address_selects_the_cidate(String email) {
schedulePanelInterviewPage.enterCidateEmailAndSelect(email);
}
@When("i select {string}")
public void i_select(String option) {
schedulePanelInterviewPage.selectOption(option);
}
@When("the user clicks on cancel interview")
public void the_user_clicks_on_cancel_interview() {
schedulePanelInterviewPage.clickCancelInterview();
}
@When("the user attempts to confirm the cancellation")
public void the_user_attempts_to_confirm_the_cancellation() {
schedulePanelInterviewPage.confirmCancellation();
}
@When("the recruiter selects {string} {string}")
public void the_recruiter_selects(String firstOption, String secondOption) {
schedulePanelInterviewPage.selectOptions(firstOption, secondOption);
}
@Then("the system should display a confirmation message for the scheduled interview")
public void the_system_should_display_a_confirmation_message_for_the_scheduled_interview() {
schedulePanelInterviewPage.isConfirmationMessageDisplayed();
}
@When("the recruiter clicks on next")
public void the_recruiter_clicks_on_next() {
schedulePanelInterviewPage.clickNext();
}
@Then("the user remains on the scheduled interviews page")
public void the_user_remains_on_the_scheduled_interviews_page() {
schedulePanelInterviewPage.isOnScheduledInterviewsPage();
}
@When("the user selects {string} as minimum required attendees {string} as interview round")
public void the_user_selects_as_minimum_required_attendees_as_interview_round(String attendees, String round) {
schedulePanelInterviewPage.selectMinimumRequiredAttendeesAndInterviewRound(attendees, round);
}
@When("the user clicks on next")
public void the_user_clicks_on_next() {
schedulePanelInterviewPage.clickNext();
}
@When("selects start time")
public void selects_start_time() {
schedulePanelInterviewPage.selectStartTime();
}
@When("selects a job opening from the dropdown")
public void selects_a_job_opening_from_the_dropdown() {
schedulePanelInterviewPage.selectJobOpening();
}
@Then("the recruiter can view the scheduled interview in their dashboard")
public void the_recruiter_can_view_the_scheduled_interview_in_their_dashboard() {
schedulePanelInterviewPage.isScheduledInterviewVisibleInDashboard();
}
@When("the user selects the interview date {string} start time {string}")
public void the_user_selects_the_interview_date_start_time(String date, String time) {
schedulePanelInterviewPage.selectInterviewDateAndStartTime(date, time);
}
@When("the user enters {string} selects the cidate")
public void the_user_enters_selects_the_cidate(String input) {
schedulePanelInterviewPage.enterInputAndSelectCidate(input);
}
@When("the user selects {string} as interview provider")
public void the_user_selects_as_interview_provider(String provider) {
schedulePanelInterviewPage.selectInterviewProvider(provider);
}
//    @When("the user selects {string}")
@When("the user selects {string} from the available options")
public void the_user_selects_from_the_available_options(String option) {
schedulePanelInterviewPage.selectFromAvailableOptions(option);
}
@When("chooses the panel interview option")
public void chooses_the_panel_interview_option() {
schedulePanelInterviewPage.choosePanelInterviewOption();
}
@When("the user selects {string} interview round {string}")
public void the_user_selects_interview_round(String round, String option) {
schedulePanelInterviewPage.selectInterviewRound(round, option);
}
@Then("the start time field is highlighted for correction")
public void the_start_time_field_is_highlighted_for_correction() {
schedulePanelInterviewPage.isStartTimeFieldHighlighted();
}
@When("selects a past interview date {string}")
public void selects_a_past_interview_date(String date) {
schedulePanelInterviewPage.selectPastInterviewDate(date);
}
@Then("the cidate field is highlighted for correction")
public void the_cidate_field_is_highlighted_for_correction() {
schedulePanelInterviewPage.isCidateFieldHighlighted();
}
}
}