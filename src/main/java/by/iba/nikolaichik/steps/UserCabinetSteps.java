package by.iba.nikolaichik.steps;

import by.iba.nikolaichik.pages.PageFactory;
import by.iba.nikolaichik.pages.UserCabinetPage;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.steps.Steps;
import org.junit.Assert;

public class UserCabinetSteps extends Steps {

    UserCabinetPage userCabinetPage;

    public UserCabinetSteps(PageFactory pageFactory) {
        userCabinetPage = pageFactory.newUserCabinetPage();
    }

    @Then("user cabinet is opened, title is $title")
    public void userCabinetShouldBeOpened(String title) {
        Assert.assertEquals(userCabinetPage.getTitle(), title);
    }
}
