import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;

public class XpathYoutube {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.youtube.com");
        driver.findElement(By.xpath("(//tp-yt-paper-button[@id='button'])[6]")).click();
     WebElement ara = driver.findElement(By.xpath("//input[@id='search']"));
             ara.sendKeys("At" + Keys.ENTER);

//
//        WebElement search =  driver.findElement(By.xpath("//input[@id='search']"));
//        search.sendKeys("Hocaefendi" + Keys.ENTER);
      // driver.findElement(By.xpath("(//yt-formatted-string[@id='text'])[70]")).click();

    }
}
