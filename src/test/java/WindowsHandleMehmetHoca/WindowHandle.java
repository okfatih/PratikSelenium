package WindowsHandleMehmetHoca;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class WindowHandle extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        //2- Url'nin amazon içerdiğini test edelim
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
        //3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
        Thread.sleep(1000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");

        String bestbuyWindowHandle = driver.getWindowHandle();
        //4- title'in BestBuy içerdiğini test edelim
        Assert.assertTrue(driver.getTitle().contains("Best Buy"));

        //5- İlk sayfaya dön
        driver.switchTo().window(amazonWindowHandle);




    }
}
