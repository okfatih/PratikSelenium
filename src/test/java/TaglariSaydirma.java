import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TaglariSaydirma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tureng.com");
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println(tag.size());
    }
}
/*
   System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // Amazon sayfasındaki tag'ları input olanların sayısını yazdırınız
        List<WebElement> tag = driver.findElements(By.tagName("input"));
        System.out.println("input tag'inin sayısı = "+tag.size());
​
        System.out.println(driver.findElement(By.xpath("(//*[@class='a-color-base headline truncate-2line'])[1]")).getText());
 */