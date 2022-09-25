package AlertsIframePratik;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C03_Deneme extends TestBaseBeforeAfter {
    @Test
    public void test1() throws InterruptedException {

        //Click for JS prompt tıkla ismini gir
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement JsPrompt = driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
        JsPrompt.click();
        driver.switchTo().alert().sendKeys("Fatih");
        Thread.sleep(2000);
        driver.switchTo().alert().accept();


    }

    @Test
    public void JSAlert() {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        WebElement jsalert = driver.findElement(By.xpath("//*[@onclick='jsAlert()']"));
        //Js alert tuşuna bas
        jsalert.click();
        // çıkan texti yazdır
        System.out.println(driver.switchTo().alert().getText());
        //Ok i tıkla
        driver.switchTo().alert().accept();
        //JS prompt e bas
        // gelen texti al
        // cancel a bas
        WebElement jsPrompt = driver.findElement(By.xpath("//*[@onclick='jsPrompt()']"));
        jsPrompt.click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }
}
