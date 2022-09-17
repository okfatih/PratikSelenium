import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class SonucSayisiYazdirma {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.marktplaats.nl/");

        driver.findElement(By.id("gdpr-consent-banner-accept-button")).click();

        WebElement ara = driver.findElement(By.xpath("//*[@class='hz-Nav-dropdown-toggle hz-Header-Autocomplete-input']"));
        ara.sendKeys("iphone13" + Keys.ENTER);

        //ilgili sonuçların sayısını yazdırın
   List<WebElement> aramasonucu = driver.findElements(By.xpath("(//*[@class='mp-Nav-breadcrumb-item'])[2]"));
        System.out.println("aramasonucu = " + aramasonucu.get(0).getText());
        String Aramasonucu = aramasonucu.get(0).getText();
        //sadece sonuç sayısını yazdırın
        String sonucSayisi[] =Aramasonucu.split(" ");;
        System.out.println(sonucSayisi[0]);

        Arrays.stream(Aramasonucu.split(" ")).limit(1).forEach(t-> System.out.println("Lamnda ile: " + t));



    }
}
