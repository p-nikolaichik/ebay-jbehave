package by.iba.nikolaichik.pages;

public class PageFactory {

    public HomePage newHomePage() {
        return new HomePage();
    }

    public LoginPage newLoginPage() {
        return new LoginPage();
    }

    public UserCabinetPage newUserCabinetPage() {
        return new UserCabinetPage();
    }
}
