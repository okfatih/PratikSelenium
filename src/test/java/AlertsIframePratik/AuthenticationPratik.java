package AlertsIframePratik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AuthenticationPratik {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://the-internet.herokuapp.com/basic_auth");
    }
    @Test
    public void test1() throws InterruptedException {
        //Yukarıdaki siteye girildiğinde Kullanıcı adı ve şifre girilip authentication yapılması isteniyor
        //şifre ve kullanıcı adına admin yazdırmak için
        Thread.sleep(2000);
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //Başarılı giriş yapılıp yapılmadığını sorgula
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());

    }
}
