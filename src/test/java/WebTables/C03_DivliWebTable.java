package WebTables;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v95.overlay.model.LineStyle;

import java.util.List;

public class C03_DivliWebTable extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        driver.get("https://demoqa.com/webtables");
        //Satırlar: //div[@class='rt-tr-group']
        //Datalar: //div[@class='rt-td']
        //Body: //div[@class='rt-tbody']

        //Headers da bulunan department isimlerini yazdirin
        List<WebElement> satirlar = driver.findElements(By.xpath(" //div[@class='rt-td'][6]"));
        System.out.println("satirlar.size() = " + satirlar.size());
        satirlar.stream().forEach(t-> System.out.println(t.getText()));
        //sutunun basligini yazdirin
        WebElement sutunBasligi = driver.findElement(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer'][6]"));
        System.out.println(sutunBasligi.getText());
        //Tablodaki tum datalari yazdirin
        WebElement tumtable = driver.findElement(By.xpath("//div[@class='rt-tbody']"));
        System.out.println(tumtable.getText());
       // Tabloda kac cell (data) oldugunu yazdirin

        List<WebElement> cellSayisi = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println("aantaal cellen" + cellSayisi.size());
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