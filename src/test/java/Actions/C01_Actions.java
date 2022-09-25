package Actions;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_Actions extends TestBaseBeforeAfter {
    @Test
    public void test1(){
              /*
        Soru 1:  Go webpage amazon.com
        Account menüsünden create a list linkine tıklayalım
         */
        driver.get("https://amazon.com");
        WebElement createListButtonu = driver.findElement(By.xpath("//*[text()='Account & Lists']"));
      //  createListButtonu.click(); bu çalışmaz aşağıdaki açıklamayı oku
        Actions actions = new Actions(driver);
       actions.moveToElement(createListButtonu).perform();
        /*
      Bir websitesinde bir mouse ile açılan bir webelementine
      ulaşmak istersek actions.moveToElement kullanamamız gerekir
      aksi takdirde html codeları arasında web elementi bulur ama ulaşamadığı için
      element not interactable exceptionı verir
       */
    }
}
