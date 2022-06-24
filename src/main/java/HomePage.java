import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
    HomePage(WebDriver driver) { super(driver);}
    public void getsite() {driver.get("https://ibis.net.ua/ua/");}

    public WebElement getAboutLanguage() {
        return driver.findElement(By.xpath("//a[@class='a thdr_currlang']"));
    }
    public WebElement getAboutUs() {
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

    public WebElement getСulinaryHouse() {

        return driver.findElement(By.xpath("//a[@class='ch_menu_id161_link']"));
    }
    public WebElement getLanguageUA() {

        return driver.findElement(By.xpath("//a[@href='/ua/']"));
    }
//    public WebElement getShopKyiv() {
//
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id601_link']"));
//    }
//
//    public WebElement getShopLviv() {
//
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id636_link']"));
//    }
//    public WebElement getShopDnipro() {
//
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id611_link']"));
//    }
//    public WebElement getShopOdesa() {
//
//        return driver.findElement(By.xpath("//a[@class='ch_menu_id621_link']"));
//    }

    public WebElement getForClient() {

        return driver.findElement(By.xpath("//span[@class='ch_menu_id461_link a']"));
    }

    public WebElement getDiscountCard() {

        return driver.findElement(By.xpath("//a[@class='ch_menu_id171_link']"));
    }
    public WebElement getCertified() {

        return driver.findElement(By.xpath("//a[@class='ch_menu_id644_link']"));
    }
    public WebElement getGuarantee() {

        return driver.findElement(By.xpath("//a[@class='ch_menu_id521_link']"));
    }
    public WebElement getConditions() {

        return driver.findElement(By.xpath("//a[@class='ch_menu_id647_link']"));
    }
    public WebElement getDelivery() {

        return driver.findElement(By.xpath("//a[@class='ch_menu_id491_link']"));
    }

}
