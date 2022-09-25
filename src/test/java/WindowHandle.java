import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowHandle {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
    }
    @After
    public void tearDown(){

    }
    @Test
    public void test1(){
        //1
        driver.get("https://amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        //2- Url'nin amazon içerdiğini test edelim
        String expectedwordInUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedwordInUrl));
        // 3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String BestBuyWindowHandle = driver.getWindowHandle();
        //4- title'in BestBuy içerdiğini test edelim
        String actualTitle = driver.getTitle();
        String wordInexpectedTitle = "Best Buy";
        Assert.assertTrue(actualTitle.contains(wordInexpectedTitle));
        ////5- İlk sayfaya dönüp sayfada java aratalım
        driver.switchTo().window(amazonWindowHandle);
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("Java", Keys.ENTER);
        WebElement aramasonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        String arananKelime = "Java";
        String actualSonuc =aramasonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));
        //7- Yeniden bestbuy sayfasına gidelim
        driver.switchTo().window(BestBuyWindowHandle);
        //8- Logonun görünürlüğünü test edelim
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='logo'])[1]")).isDisplayed());

    }
}


  /*
    //1- Amazon Sayfasina girelim
//2- Url'nin amazon içerdiğini test edelim
//3- Yeni bir pencere açıp bestbuy anasayfasına gidelim.(https://www.bestbuy.com)
//4- title'in BestBuy içerdiğini test edelim
//5- İlk sayfaya dönüp sayfada java aratalım
//6- Arama sonuclarının java içerdiğini test edelim
//7- Yeniden bestbuy sayfasına gidelim
//8- Logonun görünürlüğünü test edelim
//9- Sayfaları Kapatalım
     */