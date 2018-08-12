package by.iba.nikolaichik.pages;

import com.codeborne.selenide.WebDriverRunner;

public class PageActions {

    public String getTitle() {
        return WebDriverRunner.getWebDriver().getTitle();
    }
}
