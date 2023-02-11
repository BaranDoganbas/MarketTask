package Pages;

import Base.BaseStepMethod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import static Base.BaseTest.driver;

public class MainPage extends BaseStepMethod {
    private static final Logger LOGGER = LogManager.getLogger(MainPage.class);

    // private static final By HOVER_MAINPAGE_GIRIS_YAP = By.cssSelector("#myAccount");
    private static final By BTN_MAINPAGE_GIRIS_YAP = By.xpath("//*[@id='myAccount']");
    private static final By BTN_MAINPAGE_LOGINBUTON = By.id("login");
    private static final By BTN_MAINPAGE_CEREZ_KABULET = By.xpath("//button[@id='onetrust-accept-btn-handler']");


    public void go_To_Url(String url) {
        driver.get(url);
        LOGGER.info("User go to " + url);
        clickElement(BTN_MAINPAGE_CEREZ_KABULET);
        LOGGER.info("User accetp cookies");

    }

    public void hoverOverGirisYapButon() {
        hoverElement(BTN_MAINPAGE_GIRIS_YAP, 3);
        LOGGER.info("User hover over giris yap buton");

        clickElement(BTN_MAINPAGE_LOGINBUTON);
        LOGGER.info("User click login buton");


    }

}