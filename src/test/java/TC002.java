import Base.BaseTest;
import Listener.Listener;
import Pages.AllPages;
import Utilities.ConfigReader;
import com.opencsv.exceptions.CsvException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;
import java.lang.reflect.Method;

import static ExtentReports.ExtentTestManager.startTest;

@Listeners({Listener.class})
public class TC002 extends BaseTest {
    AllPages allPages=new AllPages();
    @Test(description = "Kullanıcı girişi yapılmadan sepete ürün eklenmesi")
    public void Test02(Method method) throws IOException, InterruptedException, CsvException {
        startTest(method.getName(),"Kullanıcı girişi yapılmadan sepete ürün eklenmesi");
        allPages.mainPage().go_To_Url(ConfigReader.getProperty("baseURL"));
        allPages.userDashboardPage().searchProduct("robot süpürge");
        allPages.searchResultPage().SearchResultSummary("robot süpürge");
        allPages.searchResultPage().selectProduct();
        allPages.productDetailPage().add_To_Cart();
        allPages.cartPage().go_To_Cart();
        allPages.cartPage().verify_To_ProductsOnCart();
    }
}