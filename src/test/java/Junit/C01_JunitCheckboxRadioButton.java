package Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_JunitCheckboxRadioButton {
    static WebDriver driver;
@BeforeClass
    public static void setUp(){
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


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
Maven bu işlemleri nasıl sağlar? Pomxml sayesinde. Pomxml mavenin kalbidir
Pomexml e ekleyeceğim dependencyler ile istediğimiz her kütüphaneyi projemize kolaylıkla ekleyebilirir
Projemiz için kullanmak istediğimiz dependencyleri mvnrepository.com dan bulabiliriz
İlgili kütüphanenin hangi versiyonunu yüklememiz gerektiğine en güncel, en çok kullanılan ve stabil olan versiyonu
buluyoruz
Maven bir framework değildir sadece framework u kolayvca oluşturmamızı sağlayan bir tooldur
Selenium dersleri boyunca 3 framework ile çalışacağız
1.Junit Framerwork
2.TestNG Framework
3.Cucember
 */