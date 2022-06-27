import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestInit {

    public WebDriver driver;

    @BeforeMethod

//     for to start manually

    public void beforMethod() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//         for to start of terminal (console)
//      example:      mvn -Dbrowser= firefox test
//
//        public void beforMethod1(){
//            String browser = System.getProperty("browser");
//            if(browser == null){
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//            }else if(browser.equals("firefox")){
//                WebDriverManager.firefoxdriver().setup();
//                driver = new FirefoxDriver();
//            }else if(browser.equals("edge")){
//                WebDriverManager.edgedriver().setup();
//                driver = new EdgeDriver();
//            }else if (browser.equals("chrome")) {
//                WebDriverManager.chromedriver().setup();
//                driver = new ChromeDriver();
//            }
    }

    public void sleep(int sekonds) {
        try {
            Thread.sleep(sekonds * 100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}


