package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class UserDashboardPage extends BaseStepMethod {

    private static final Logger LOGGER = LogManager.getLogger(UserDashboardPage.class);
    private static final By TXT_USERDPAGE_USERNAME = By.xpath("(//a[@title='Hesabım'])//span[2]");
    private static final By INPUT_USERDPAGE_SEARCHBOX = By.xpath("(//input[@type='text'])[1]");

    public void verifyValidLogin(String username) {
        ContainsText(TXT_USERDPAGE_USERNAME, username);
        LOGGER.info("Login successful");
    }

    public void searchProduct(String product) {
        setTextElement(INPUT_USERDPAGE_SEARCHBOX, product + Keys.ENTER);
    }
}
