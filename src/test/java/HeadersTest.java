import org.testng.Assert;
import org.testng.annotations.Test;

public class HeadersTest extends TestInit {

    @Test
    public void BrandsCatalogTest() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getAboutUs().click();
        hp.getCatalogOfBrands().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/categories_brands/"));
    }

    @Test
    public void ibisShopsTrst() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getAboutUs().click();
        hp.getIbisShops().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops/"));
    }

    @Test
    public void OurMagazine() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getAboutUs().click();
        hp.getOurMagazine().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://gunmag.com.ua/"));
    }

    @Test
    public void CookHouse() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getAboutUs().click();
        hp.getСulinaryHousee().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://kuldom.ua/ua/"));
    }

    @Test
    public void getLanguageUA() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        // hp.getAboutUs().click();
        hp.getLanguageUA().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/"));
    }
}

