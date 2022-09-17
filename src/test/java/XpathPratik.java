import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPratik {
    /*
    System.out.println[1]")).getText());
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://youtube.com");
        WebElement youtubeSearch = driver.findElement(By.id("search-input"));
        driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-consent-bump-v2-lightbox style-primary size-default']")).click();
        youtubeSearch.sendKeys("Adel" + Keys.ENTER);



//        WebElement search =   driver.findElement(By.xpath("//input[@id='searchTerm']"));
//      driver.findElement(By.xpath("//button[@class='fc-button fc-cta-consent fc-primary-button']")).click();
//        search.sendKeys("Adel" + Keys.ENTER);


//        WebElement search = driver.findElement(By.xpath("//input[@name='searchTerm']"));
//        search.sendKeys("aelenium" + Keys.ENTER);

      //  driver.findElement(By.xpath("//div[@id='search-input']"));

    }
    /*
 driver.get("https://tureng.com/tr/turkce-ingilizce");
driver.findElement(By.xpath("//input[@name='searchTerm']")).sendKeys("send");
     */
}
