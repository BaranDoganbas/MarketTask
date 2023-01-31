package Pages;

public class AllPages {

    private MainPage mainPage;
    private LoginPage loginPage;
    private UserDashboardPage userDashboardPage;

    public MainPage mainPage() {
        if (mainPage == null) {
            mainPage = new MainPage();
        }
        return mainPage;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public UserDashboardPage userDashboardPage() {
        if (userDashboardPage == null) {
            userDashboardPage = new UserDashboardPage();
        }
        return userDashboardPage;
    }
}
