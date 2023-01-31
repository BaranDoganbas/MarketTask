import Base.BaseTest;
import Pages.AllPages;
import Utilities.ConfigReader;
import org.testng.annotations.Test;

public class TC001 extends BaseTest {
    AllPages allPages;
    @Test
    public void test01() {
        allPages = new AllPages();
        allPages.mainPage().goToUrl(ConfigReader.getProperty("baseURL"));
        allPages.mainPage().hoverOverGirisYapButon();
        allPages.loginPage().loginHepsiBurada(ConfigReader.getProperty("UserMail"),ConfigReader.getProperty("UserPassword"));
        allPages.userDashboardPage().verifyValidLogin("Baran");
        allPages.userDashboardPage().searchProduct("robot supurge");

    }
}