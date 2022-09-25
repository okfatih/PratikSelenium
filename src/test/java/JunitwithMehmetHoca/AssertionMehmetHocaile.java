package JunitwithMehmetHoca;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AssertionMehmetHocaile {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        }
        @Test
    public void test01(){
        /*
        Eğer test methodumuzda hiçbir test yoksa, test çalıştıktan sonra
        hiçbir problemle karşılaşmadığımız raporlarmak için test passed yazısı
        çıkar
        Eğer testleri if ile yaparsak test failed olsa bile kodlar problemsiz çalıştığından
        kod çalışması bittiğinde ekranın sol alt kısmında test passed yazacaktır
        Bu arzu edilen bir sonuç değildir. Bundan dolayı Junitle beraber assertions getirip bu
        buna son vereceğiz
         */
        driver.get("https://amazon.com");
        //url'in https://facebook.com olduğunu test edin
//            if (driver.getCurrentUrl().equals("https://facebook.com")){
//                System.out.println("Test Passed");
//            }else{
//                System.out.println("Test failed");
//            }
            String expectedUrl ="https://facebook.com";
            String actualUrl = driver.getCurrentUrl();
           // Assert.assertEquals(expectedUrl,actualUrl); yaparsak test fail
            Assert.assertNotEquals(expectedUrl,actualUrl); //test passed
        }
        @AfterClass
    public static void tearDown(){
        driver.close();
        }
    }
