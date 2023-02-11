package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class UserDashboardPage extends BaseStepMethod {

    private static final Logger LOGGER = LogManager.getLogger(UserDashboardPage.class);
    private static final By TXT_USERDPAGE_USERNAME = By.xpath("(//a[@title='Hesabım'])//span[2]");
    private static final By INPUT_USERDPAGE_SEARCHBOX = By.xpath("(//input[@type='text'])[1]");
    private static final By BTN_USERDPAGE_PRODUCT = By.xpath("(//li[@type='comfort'])[2]");
    private static final By TXT_USERDPAGE_PRODUCTNAME = By.xpath("(//h3[@data-test-id='product-card-name'])[2]");
    private static final By BTN_USERDPAGE_ADDTOCART = By.xpath("//button[@id='addToCart']");
    private static final By BTN_USERDPAGE_SEPETE_GIT = By.xpath("//button[.='Sepete git']");
    private static final By TXT_CARTPAGE_PRODUCTNAME = By.xpath("//div[@class='product_name_2Klj3']");
    public void verifyValidLogin(String username) {
        ContainsText(TXT_USERDPAGE_USERNAME, username);
        LOGGER.info("Login successful");
    }

    public void searchProduct(String product) {
        setTextElement(INPUT_USERDPAGE_SEARCHBOX, product + Keys.ENTER);
    }

    public void addProductToCart() {
        getTextElement(TXT_USERDPAGE_PRODUCTNAME);
        clickElement(BTN_USERDPAGE_PRODUCT);
        clickElement(BTN_USERDPAGE_ADDTOCART);
    }

}
