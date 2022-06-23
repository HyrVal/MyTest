import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    HomePage(WebDriver driver) { super(driver);}
    public void getsite() {driver.get("https://ibis.net.ua/ua/");}

    public WebElement getAboutUs() {
        return driver.findElement(By.xpath("//span[@class='ch_menu_id101_link a']"));
    }

    public WebElement getAboutLanguage() {
        return driver.findElement(By.xpath("//span[@class='ch_menu_id101_link a']"));
    }
    public WebElement getCatalogOfBrands() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id211_link']"));
        }

    public WebElement getIbisShops() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id131_link']"));
        }
    public WebElement getOurMagazine() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id151_link']"));
        }

    public WebElement getСulinaryHousee() {
        return driver.findElement(By.xpath("//a[@class='ch_menu_id161_link']"));
    }
    public WebElement getLanguageUA() {
        return driver.findElement(By.xpath("//a[@href='/ua/']"));
    }

}
