package IframeVeList;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeAsText {
    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void test1(){
        // "https://the-internet.herokuapp.com/iframe" ne git
        driver.get("https://the-internet.herokuapp.com/iframe");
        //title ın The kelimesini içerip içermediğini test et
        String actualTitle = driver.getTitle();
        String expectedwordinTitle = "The";
        Assert.assertTrue(actualTitle.contains(expectedwordinTitle));
        System.out.println(driver.getTitle());

        // sitenin "An iFrame containing the TinyMCE WYSIWYG Editor" ifadesinin içerip içermediğini test et

        WebElement bulunacakMetin = driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']"));
        Assert.assertTrue(bulunacakMetin.isDisplayed());

        //Bu sitedeki Iframe e gidip içersine yazılar yazalım. Text iframe i var
        //Iframe textine geçiş yapmadan önce locate edelim.
        WebElement metinKutusuframi = driver.findElement(By.id("mce_0_ifr")); //Iframe locate edildi şimdi locate ettiğimiz Iframe e geçiş yapalım
        driver.switchTo().frame(metinKutusuframi); // text frame inin içersine geçiş yaptık
        //Frame içersindeki metne ulaşmak için webelemente atalım
        WebElement textBox = driver.findElement(By.xpath("//p"));
        textBox.clear();
        textBox.sendKeys("Hello");

        driver.switchTo().defaultContent(); //Iframeden çıkalım

        //switch to ile geçiş yaptığımız bu framein içine bir şeyler yazmak için önce içersini temizlemek lazım






    }
}
