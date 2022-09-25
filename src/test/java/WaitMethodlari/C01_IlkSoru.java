package WaitMethodlari;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C01_IlkSoru extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        driver.get(" https://the-internet.herokuapp.com/dynamic_controls"); // https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
        //Remove butonuna basin.
        driver.findElement(By.xpath("//*[text()='Remove']")).click(); // Remove butonuna basin.
/*
Locate ettiğimiz bazı elementlerin sitede yüklemesi uzun sürdüğünde
sadece o elementler özgü bekleme süresi oluşturabiliriz
implictwait oldukça genelde bu yönteme ihtiyaç duymayız ki zaten ben bunu test edebilmek
için testbasedeki 15 saniyeye ayarladığım implictwait i yoruma aldım
Explicit wait için önce wait WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
objesi oluşturuyoruz.
Sonra yüklemesi uzun süreceğini düşündüğümüz webelementini wait methoduyla locate ediyoruz
 */
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
      // WebElement gonemes = driver.findElement(By.xpath("//*[@id='message']"));

        WebElement goneMesaji = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='message']")));
        Assert.assertTrue(goneMesaji.isDisplayed());
        System.out.println("goneMesaji.getText() = " + goneMesaji.getText());

        //Add buttonuna basın ve It’s back mesajinin gorundugunu test edin
        driver.findElement(By.xpath("//*[text()='Add']")).click();
        WebElement back = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"It's back!\"]")));
        Assert.assertTrue(back.isDisplayed());
        System.out.println("back.getText() = " + back.getText());
        driver.findElement(By.xpath("//button[@onclick='swapInput()']")).click(); //Enable buttonuna bas
        WebElement enabled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=\"It's enabled!\"]")));
        System.out.println("enabled.getText() = " + enabled.getText());
        Assert.assertTrue(enabled.isDisplayed());
    }
////button[@onclick='swapInput()']
    @Test
    public void test2() {
        /*
        /*
1. Bir class olusturun : EnableTest
2. Bir metod olusturun : isEnabled()
3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
4. Textbox’in etkin olmadigini(enabled) dogrulayın
5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin
6. “It’s enabled!” mesajinin goruntulendigini dogrula
 Textbox’in etkin oldugunu(enabled) dogrulayın
 */


        driver.get("https://the-internet.herokuapp.com/dynamic_controls"); //Siteye git
        WebElement textbox = driver.findElement(By.xpath("//*[@type='text']")); //Textbox u locate edin
        Assert.assertFalse(textbox.isEnabled()); // Textbox’in etkin olmadigini(enabled) dogrulayın
        driver.findElement(By.xpath("//*[text()='Enable']")).click(); //5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin



        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(textbox));



    }
}
/*
// 1. Bir class olusturun : WaitTest
// 2. Iki tane metod olusturun : implicitWait() , explicitWait()
//    Iki metod icin de asagidaki adimlari test edin.
// 3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
// 4. Remove butonuna basin.
// 5. "It's gone!" mesajinin goruntulendigini dogrulayin.
// 6. Add buttonuna basin
// 7. It's back mesajinin gorundugunu test edin
 */