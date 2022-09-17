import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class turengdeArama {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dictionary.cambridge.org/");
        WebElement aramaKutusu = driver.findElement(By.id("searchword"));
        aramaKutusu.sendKeys("window" + Keys.ENTER);
    }
}
