import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestInit {

        public WebDriver driver;

        @BeforeMethod
        public void beforMethod (){
            WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }

        public void sleep(int sekonds) {
            try {
                Thread.sleep(sekonds * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//    @AfterMethod
//    public void afterMethod (){
//        driver.quit();
//    }
}

