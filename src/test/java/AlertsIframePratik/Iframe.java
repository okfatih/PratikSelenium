package AlertsIframePratik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Iframe {
    static WebDriver driver;
    static Select options;
//Iframe vir web sayfaısın içine yerleştirilmiş başka bir web sayfasıdır

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://html.com/tags/iframe/");
    }
    @Test
    public void test1(){
        //videoyu locate et
        WebElement youtubevideosu = driver.findElement(By.xpath("//*[@src='https://www.youtube.com/embed/owsfdh4gxyc']"));
        //frame al
        driver.switchTo().frame(youtubevideosu);
        // videonun play tuşunu locate et
        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();


    }
}
