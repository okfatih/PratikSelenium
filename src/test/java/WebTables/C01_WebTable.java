package WebTables;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C01_WebTable extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        driver.get("https://demoqa.com/webtables");
        List<WebElement> basliklar = driver.findElements(By.xpath("//div[@class='rt-resizable-header-content']"));
        for (WebElement e:basliklar
             ) {
            System.out.println(e.getText());

        }
        WebElement tumDatalar = driver.findElement(By.xpath("//div[@class='rt-table']"));
        System.out.println(tumDatalar.getText());

        WebElement tumtable = driver.findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']"));
        System.out.println(tumtable.getText());
    }
}
/*
Bir Class olusturun D19_WebtablesHomework
“https://demoqa.com/webtables” sayfasina gidin
Headers da bulunan department isimlerini yazdirin
sutunun basligini yazdirin
Tablodaki tum datalari yazdirin
Tabloda kac cell (data) oldugunu yazdirin
Tablodaki satir sayisini yazdirin
Tablodaki sutun sayisini yazdirin
Tablodaki 3.kolonu yazdirin
Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin
Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini  girdigimde bana datayi yazdirsin
 */