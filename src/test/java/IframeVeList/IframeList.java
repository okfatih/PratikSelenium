package IframeVeList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class IframeList {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test1(){
        driver.get("https://html.com/tags/iframe/");
        /*
     Bir web sitesinde bir video(youtube vb.) varsa
      ve <iframe> tag'ı içerisindeyse bu video'yu direk locate edip
    çalıştırmak dinamik olmaz
    çünkü link değişebilir ve locate'imiz çalışmaz.
    Bunun için bütün frame'leri bir array liste atıp index ile
    frame'i seçip sonrasında play tuşunu locate edip
    çalıştırabiliriz.
     */
        List<WebElement>iframeListesi = new ArrayList<>(driver.findElements(By.xpath("//iframe")));

        //Sitedeki listeye attığımız tüm iframe elementlerinden birini seçmek için
        driver.switchTo().frame(iframeListesi.get(0));
        //Iframe ile locate ettiğimiz videonun play tuşuna bastıralım
        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();

    }
    @After
    public void tearDown(){
        driver.close();
    }
}
