package by.iba.nikolaichik.pages;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends PageActions {

    public void openLoginPage() {
        $(byXpath("//div[@class=\"gh-menu\"]/a[@class=\"gh-eb-li-a\"]")).click();
    }

    public void closePopup() {
        $("#HomepageOverlay16030ModalClose img").click();
    }
}
