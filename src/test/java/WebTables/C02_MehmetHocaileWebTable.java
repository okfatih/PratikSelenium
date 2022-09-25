package WebTables;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class C02_MehmetHocaileWebTable extends TestBaseBeforeAfter {

    @Test
    public void test1() {

       login();
        //Tüm table body'sinin boyutunu (sütün sayısı bulun)
        List<WebElement> columnHeads = driver.findElements(By.xpath("//thead//tr[1]//th"));
        System.out.println("Sutun sayisi:" + columnHeads.size());
        //Table daki tüm body ve başlıkları konsola yazıdrın
        WebElement tumBody = driver.findElement(By.xpath("//tbody"));

        System.out.println("Body basliklari: " + tumBody.getText());
        List<WebElement>tumbodyList = driver.findElements(By.xpath("//tbody"));
        System.out.println("tumbodyList elemanSayisi:  = " + tumbodyList.size());

        //Table body'sinde bulunan toplam satır sayısını bulun
        List<WebElement> bodySatirSayisi = driver.findElements(By.xpath("//tbody//tr"));
        System.out.println("bodySatirSayisi:  " + bodySatirSayisi.size());
        int count = 1;
        //Table body'sinde bulunan satirlari yazdırın
//        for (WebElement e:bodySatirSayisi
//             ) {
//            System.out.println(count+ ". satir "+ e.getText());
//            count++;
//        }
        bodySatirSayisi.stream().limit(1).forEach(t-> System.out.println(t.getText()));//sadece ilk satırı yazdır
        //4.satırdaki  row elementleri konsolda yazdırın
        bodySatirSayisi.stream().limit(4).skip(3).forEach(t-> System.out.println(t.getText()));
        List<WebElement>dorduncuSatirElemanlari = driver.findElements(By.xpath("//tbody//tr[4]//td"));
        dorduncuSatirElemanlari.forEach(t-> System.out.println(t.getText()));

        System.out.println("********************");
        //Email başlığındaki tüm elementleri yazdırın
        //Önce email başlığının kaçıncı sütünda olduğunu bulalım
        List<WebElement>tableHeadBasliklari = driver.findElements(By.xpath("//thead//tr[1]//th"));
       int emailSutunNo = 0;
        for (int i = 0; i <tableHeadBasliklari.size() ; i++) {
            if (tableHeadBasliklari.get(i).getText().equals("Email")){
                emailSutunNo = i;
            }

        }
        List<WebElement>emailSutunListesi = driver.findElements(By.xpath("//tbody//td["+(emailSutunNo+1)+"]"));
        emailSutunListesi.forEach(t-> System.out.println(t.getText()));




    }





    public  void login(){
        driver.get("https://hotelmycamp.com/admin/UserAdmin");

        Actions action = new Actions(driver);
        WebElement username =  driver.findElement(By.xpath("//*[@id='UserName']"));
        action.click(username).sendKeys("manager").sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();
    }
}
