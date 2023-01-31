package Pages;

import Base.BaseStepMethod;
import Utilities.ConfigReader;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import static Base.BaseTest.driver;

public class MainPage extends BaseStepMethod {

    private static final Logger LOGGER= LogManager.getLogger(MainPage.class);
    private static final By BTN_MAINPAGE_GIRIS_YAP_HOVER_OVER = By.xpath("//*[@id='myAccount']");
    private static final By BTN_MAINPAGE_GIRIS_YAP_BUTON = By.id("login");


    public void goToUrl(String url) {
        driver.get(url);
        LOGGER.info("User go to "+url);

    }
    public void hoverOverGirisYapButon() {
        hoverElement(BTN_MAINPAGE_GIRIS_YAP_HOVER_OVER,2);
        LOGGER.info("User hover over "+BTN_MAINPAGE_GIRIS_YAP_HOVER_OVER);

        clickElement(BTN_MAINPAGE_GIRIS_YAP_BUTON);
        LOGGER.info("User clicks login button");
    }


}
