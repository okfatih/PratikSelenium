import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class XpathTureng {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://tureng.com/tr/turkce-ingilizce");
        driver.findElement(By.xpath("(//p[@class='fc-button-label'])[1]")).click();
        WebElement search = driver.findElement(By.xpath("//input[@id='searchTerm']"));
        search.sendKeys("Ram"+Keys.ENTER);
        //Dün gece saat 12:07 de yukarıdaki kod çalıştı
//
//        driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']")).click();
//        search.sendKeys("word" + Keys.ENTER);
//        WebElement search1 =   driver.findElement(By.xpath("//input[@id='searchTerm']"));
//      driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']")).click();
//       search1.sendKeys("Adel" + Keys.ENTER);
    }
}
/*
/html/body/div[7]/div */