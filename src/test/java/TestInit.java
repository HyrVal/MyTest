import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class TestInit {

        public WebDriver driver;

        @BeforeMethod
        public void beforMethod (){
            String browser = System.getProperty("browser");
            if(browser.equals("chrome")){
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }else if(browser.equals("firefox")){
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }else if(browser.equals("edge")){
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
            }else {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            }

//        WebDriverManager.chromedriver().setup();
//           driver = new ChromeDriver();
            // mvn -Dbrowser= firefox test

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

