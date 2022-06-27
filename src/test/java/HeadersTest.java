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
        hp.getСulinaryHouse().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://kuldom.ua/ua/"));
    }

//    @Test
//    public void getLanguageUA() {
//        HomePage hp = new HomePage(driver);
//        hp.getsite();
//         hp.getAboutLanguage().click();
//        hp.getLanguageUA().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/"));
//    }
//    @Test
//    public void ShopsTestKyiv() {
//        HomePage hp = new HomePage(driver);
//        hp.getsite();
//        hp.getAboutShop().click();
//        hp.getShopKyiv().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops/#kiyiv"));
//    }
//    @Test
//    public void ShopsTestLviv() {
//        HomePage hp = new HomePage(driver);
//        hp.getsite();
//        hp.getAboutShop().click();
//        hp.getShopLviv().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops/#lviv"));
//    }
//    @Test
//    public void ShopsTestDnipro() {
//        HomePage hp = new HomePage(driver);
//        hp.getsite();
//        hp.getAboutShop().click();
//        hp.getShopDnipro().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops/#dnipro"));
//    }
//    @Test
//    public void ShopsTestOdesa() {
//        HomePage hp = new HomePage(driver);
//        hp.getsite();
//        hp.getAboutShop().click();
//        hp.getShopOdesa().click();
//
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/shops/#odesa"));
//    }

    @Test
    public void testDiscountCard() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getForClient().click();
        hp.getDiscountCard().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/programma-lojalynosti/"));
    }
    @Test
    public void testСertified() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getForClient().click();
        hp.getCertified().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/"));
    }
    @Test
    public void testGuarantee() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getForClient().click();
        hp.getGuarantee().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/garantijnye-objazatelstva/"));
    }
    @Test
    public void testConditions() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getForClient().click();
        hp.getConditions().click();

        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/uslovyia-pryobrytenyia-oruzhyia/"));
    }
    @Test
    public void testDelivery() {
        HomePage hp = new HomePage(driver);
        hp.getsite();
        hp.getForClient().click();
        hp.getDelivery().click();


        Assert.assertTrue(driver.getCurrentUrl().contains("https://ibis.net.ua/ua/dostavka-i-oplata/"));
    }

    // https://ibis.net.ua/ua/dostavka-i-oplata/
}


