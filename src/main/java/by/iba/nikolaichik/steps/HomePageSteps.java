package by.iba.nikolaichik.steps;

import by.iba.nikolaichik.pages.HomePage;
import by.iba.nikolaichik.pages.PageFactory;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class HomePageSteps extends Steps {

    HomePage homePage;

    public HomePageSteps(PageFactory pageFactory) {
        homePage = pageFactory.newHomePage();
    }

    @Given("open site $site")
    public void openSite(String site) {
        open(site);
    }

    @When("site is opened, title is $title")
    public void siteShouldBeOpened(String title) {
        Assert.assertEquals(homePage.getTitle(), title);
    }

    @When("close popup")
    public void closePopup() {
        homePage.closePopup();
    }

    @When("open login page")
    public void loginPageShouldBeOpened() {
        homePage.openLoginPage();
    }
}
