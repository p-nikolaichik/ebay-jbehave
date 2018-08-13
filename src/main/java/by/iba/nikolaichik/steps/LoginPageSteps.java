package by.iba.nikolaichik.steps;

import by.iba.nikolaichik.pages.LoginPage;
import by.iba.nikolaichik.pages.PageFactory;
import org.jbehave.core.annotations.When;
import org.jbehave.core.steps.Steps;

public class LoginPageSteps extends Steps {

    LoginPage loginPage;

    public LoginPageSteps(PageFactory pageFactory) {
        loginPage = pageFactory.newLoginPage();
    }

    @When("enter login $login and password $password")
    public void enterLoginAndPassword(String login, String password) {
        loginPage.enterLogin(login).enterPassword(password).pressSubmitButton();
    }
}
