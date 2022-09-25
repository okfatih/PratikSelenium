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
//Junit öğreneceğimiz ilk framworktur ve annotationları
//Junit ile main method kullanımını bırakıyoruz
public class C01_JunitCheckboxRadioButton {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://the-internet.herokuapp.com/checkboxes");


}
@AfterClass
    public static void tearDown(){

}
    @Test
    public void test1(){
        WebElement checkbox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));

        WebElement checkbox2 =  driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

       // WebElement checkbox2 = driver.findElement(By.xpath("//*[@id='checkboxes'])[1]']"));

        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }

}
}
/*
Maven nedir?
Proje inşaa ve yönetim aracıdır
Temel amaçları: Proje geliştirmenin kolaylaştırılması ve birlikte çalışmanın sağlanmasıdır
Selenium: Browserları automate edebilmek için gerekli toolları çalıştıran bir suittir
Selenium ortamı hazırlar, maven kendisi de bir tool olsa da Java projelerinin gelişitrilmesi
için ihtiyacımız olan tüm tooları projemize eklemek, updae etmek versiyonlarını değiştirmek gibi
işlemleri kolayca yapmamızı sağlayan built tooldur.
Maven bu işlemleri nasıl sağlar? Pomxml sayesinde.
Pomxml mavenin kalbidir
Pomexml e ekleyeceğim dependencyler ile istediğimiz her kütüphaneyi projemize kolaylıkla ekleyebilirir
Projemiz için kullanmak istediğimiz dependencyleri mvnrepository.com dan bulabiliriz
İlgili kütüphanenin hangi versiyonunu yüklememiz gerektiğine en güncel, en çok kullanılan ve stabil olan versiyonu
buluyoruz
Maven bir framework değildir sadece framework u kolayvca oluşturmamızı sağlayan bir tooldur
Selenium dersleri boyunca 3 framework ile çalışacağız
1.Junit Framerwork (Bizim ilk frameworkumuz)
2.TestNG Framework
3.Cucember
 */