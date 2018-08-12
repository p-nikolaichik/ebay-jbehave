package by.iba.nikolaichik.pages;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage enterLogin(String login) {
        $("#userid").setValue(login);
        return this;
    }

    public LoginPage enterPassword(String password) {
        $("#pass").setValue(password);
        return this;
    }

    public UserCabinetPage pressSubmitButton() {
        $("#sgnBt").click();
        return new UserCabinetPage();
    }
}
