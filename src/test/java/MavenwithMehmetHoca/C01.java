package MavenwithMehmetHoca;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class C01 extends TestBaseBeforeAfter {
@Test
    public void test1() throws InterruptedException {
    driver.get("https://the-internet.herokuapp.com/windows");

    //Sayfaki textin "Openinh a new window " olduğunu doğrula
    Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());
    //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    Assert.assertEquals("The Internet",driver.getTitle());
    //Click Here butonuna basın.
    driver.findElement(By.xpath("//*[text()='Click Here']")).click();

    List<String> windowList = new ArrayList<String>(driver.getWindowHandles());
    System.out.println(windowList);
    driver.switchTo().window(windowList.get(1));
    //Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.
    Assert.assertEquals("New Window",driver.getTitle());

    //Sayfadaki textin “New Window” olduğunu doğrulayın.
    Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());





    Thread.sleep(2000);
//Bir önceki pencereye geri dönelim
    driver.switchTo().window(windowList.get(0));


}
}
