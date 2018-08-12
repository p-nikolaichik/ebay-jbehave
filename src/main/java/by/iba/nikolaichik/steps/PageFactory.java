package by.iba.nikolaichik.steps;

import by.iba.nikolaichik.pages.HomePage;
import by.iba.nikolaichik.pages.LoginPage;
import by.iba.nikolaichik.pages.UserCabinetPage;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;

import static com.codeborne.selenide.Selenide.open;

public class PageFactory {

    HomePage homePage;
    LoginPage loginPage;
    UserCabinetPage userCabinetPage;

    public void openingBrowser() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        WebDriverRunner.getAndCheckWebDriver();
    }

    public void openingHomePage(String site) {
        open(site);
        homePage = new HomePage();
    }

    public void closingPopup() {
        homePage.closePopup();
    }

    public void openingLoginPage() {
        loginPage = homePage.openLoginPage();
    }

    public void enteringUserDate(String login, String password) {
        userCabinetPage = loginPage.enterLogin(login)
                .enterPassword(password)
                .pressSubmitButton();
    }

    public void isUserCabinetOpened(String title) {
        Assert.assertEquals(userCabinetPage.getTitle(), title);
    }
}
