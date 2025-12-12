import com..utils.ElementUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
public class Verifysuccessfulloginwithva extends DriverFactory {
private WebDriver driver;
private VerifysuccessfulloginwithvaPage page;
public Verifysuccessfulloginwithva() {
this.driver = getDriver();
this.page = new VerifysuccessfulloginwithvaPage(driver);
}
// DUPLICATE: @Given("the user is on the Login Screen")
public void the_user_is_on_the_login_screen() {
page.navigateToLoginScreen();
}
// DUPLICATE: @When("I enter {string}")
public void i_enter_email(String email) {
page.enterEmail(email);
}
@When("And I enter {string}")
public void and_i_enter_password(String password) {
page.enterPassword(password);
}
@When("And the user clicks the Login button")
public void and_the_user_clicks_the_login_button() {
page.clicksLoginButton();
}
@When("And the system processes the login request")
public void and_the_system_processes_the_login_request() {
// Assuming there's a method to wait for the login process to complete
page.waitForLoginToComplete();
}
@Then("the user should be redirected to the dashboard")
public void the_user_should_be_redirected_to_the_dashboard() {
"User is not redirected to the dashboard", page.isDashboardDisplayed();
}