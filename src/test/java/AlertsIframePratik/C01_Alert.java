package AlertsIframePratik;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Alert {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }
    @Test
    public void  test1() throws InterruptedException {
        //https://the-internet.herokuapp.com/javascript_alerts sitesine gittikten sonra click for Js Alert i tıkla
        WebElement JsAlert = driver.findElement(By.xpath("//*[@onclick='jsAlert()']"));
        JsAlert.click();

        Thread.sleep(2000);
        //Çıkan Alerte Ok diyelim
        driver.switchTo().alert().accept();
        WebElement JsConfirm = driver.findElement(By.xpath("//*[@onclick='jsConfirm()']"));
        JsConfirm.click();
        Thread.sleep(2000);
        //uyarıdaki alert mesajını alalıalım
        System.out.println(driver.switchTo().alert().getText());
        //Confimi Ok yapalom
        driver.switchTo().alert().accept();
        //JsPrompta yazı gönderelim ve ok  e basalım
        Thread.sleep(2000);
        WebElement JsPromt =  driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
        JsPromt.click();
        driver.switchTo().alert().sendKeys("Fatih");
        Thread.sleep(1900);
        driver.switchTo().alert().accept();


    }
    @Test
    public void test2() throws InterruptedException {
        //Click for JsConfirm de cancela bas
        WebElement JsConfirm = driver.findElement(By.xpath("//*[@onclick='jsConfirm()']"));
        //Alert üzerindeki mesajı alın

        JsConfirm.click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(1900);
        driver.switchTo().alert().dismiss();
        //Cancel a bastınız yazan yeri locate et
        WebElement cancel = driver.findElement(By.xpath("//*[@id='result']"));
        System.out.println(cancel.getText());
        String expectedResult= "You clicked: Cancel";
        String actualResult = cancel.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test3() throws InterruptedException {
        // 3. butona tıkla uyarıdaki metin kutusuna isminizi yaz ok butonuna tıkla
        // ve result mesajında isminin görünüp g
        WebElement JsPromt =  driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
        JsPromt.click();
        Thread.sleep(1900);
        driver.switchTo().alert().sendKeys("Fatih");
        driver.switchTo().alert().accept();
    }
}
 /*
    https://the-internet.herokuapp.com/ e git
    click for js alert butonuna tıklayalım
    Tıkladıktan sonra çıkan uyarı mesajına alerte tamam diyelim
    bu tür alertlere  js alert denir.


js alert'lere müdahale edebilmek icin

-- tamam ya da ok icin
driver.switchTo().alert().accept();

--iptal icin
driver.switchTo().alert().dismiss();

--alert icindeki mesajı almak icin
driver.switchTo().alert().getText();

--alert bizden bir metin istiyorsa
driver.switchTo().alert().sendKeys("");

methodları kullanilir!!

 */


