package WindowsHandleMehmetHoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_WindowsHandle {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(14));
    }
    @After
    public void tearDown(){

    }
    @Test
    public void test01(){
        /*
        Amazon anasayfaya git
        Nutella için arama yaptır
        Ilk ürünün resmini farklı bir tab olarak açın

         */
        driver.get("https://amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();
        //Selenim sayfalara arası geçişte windowhandle değerini kullanır
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("Nuttella" + Keys.ENTER);

        //İlk ürünün resmini tıklayarak farklı bir tab olarak açın
       WebElement ilkUrunResmi = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[1]"));
       driver.switchTo().newWindow(WindowType.TAB);




    }

}
