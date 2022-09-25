package WebTables;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_Exercise extends TestBaseBeforeAfter {
    @Test
    public void test1() {

        //giriş yap methoduyla sayfaya giriş yap
        //input olarak verile satır ve sütün sayısına sahip
        //cell deki texti yazdırın
        girisYap();
        int satir = 4;
        int sutun = 4;
       WebElement arananCell = driver.findElement(By.xpath("//tbody//tr["+satir +"]//td["+sutun +"]"));
        System.out.println(arananCell.getText());
    }

    private void girisYap() {
        driver.get("https://hotelmycamp.com/admin/UserAdmin");

        Actions action = new Actions(driver);
        WebElement username =  driver.findElement(By.xpath("//*[@id='UserName']"));
        action.click(username).sendKeys("manager").sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();

    }
}
