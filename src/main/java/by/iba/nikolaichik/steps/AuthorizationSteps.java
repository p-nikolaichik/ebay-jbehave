package by.iba.nikolaichik.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class AuthorizationSteps extends Steps {

    PageFactory pageFactory;

    public AuthorizationSteps(PageFactory pageFactory) {
        this.pageFactory = pageFactory;
    }

    @Given("user is opening browser")
    public void browserShouldBeOpened() {
        pageFactory.openingBrowser();
    }

    @When("user is opening site $site")
    public void homePageShouldBeOpened(String site) {
        pageFactory.openingHomePage(site);
    }

    @When("user is closing popup")
    public void popupShouldBeClosed() {
        pageFactory.closingPopup();
    }

    @When("user is opening login page")
    public void loginPageShouldBeOpened() {
        pageFactory.openingLoginPage();
    }

    @When("user is entering $login and $password")
    public void userDateShouldBeEntered(String login, String password) {
        pageFactory.enteringUserDate(login, password);
    }

    @Then("user cabinet is opened, title is $title")
    public void userShouldBeLogged(String title) {
        pageFactory.isUserCabinetOpened(title);
    }



    
}
