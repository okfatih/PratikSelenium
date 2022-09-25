package JunitwithMehmetHoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonSorusu {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://facebook.com");
        //facebook a git
        // cookies kabul et,
        //Create an account buttonuna bas
        //radio buttons elementlerini locate edin
        // seçili değilse cinsiyt butonundan size uygun olanı seçin
    }
    @Test
    public void test1() throws InterruptedException {
        // cookies kabul et,
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
        //Create an account buttonuna bas
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        WebElement femalebutton = driver.findElement(By.xpath("(//*[@type=\"radio\"])[1]"));

        WebElement malebutton = driver.findElement(By.xpath("(//*[@type=\"radio\"])[2]"));
        WebElement custombuttton = driver.findElement(By.xpath("(//*[@type=\"radio\"])[3]"));

        if (!malebutton.isSelected()){
            malebutton.click();
        }
        //Extra task: Diğer butonları da işaretle
        Thread.sleep(3000);
        femalebutton.click();
        Thread.sleep(3000);
        custombuttton.click();

    }
    @AfterClass
    public static void tearDown(){
        driver.close();
    }
}