package by.iba.nikolaichik.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public LoginPage openLoginPage() {
        $(byXpath("//div[@class=\"gh-menu\"]/a[@class=\"gh-eb-li-a\"]")).click();
        return new LoginPage();
    }

    public void closePopup() {
        $("#HomepageOverlay16030ModalClose img").click();
    }
}
