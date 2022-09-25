package Actions;

import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_Actions2 extends TestBaseBeforeAfter {
    @Test
    public void test1() {

        //Amazon.com a git LAnguages kısmına gel
        driver.get("https://amazon.com");
    WebElement languages = driver.findElement(By.xpath("//*[@id='icp-nav-flyout']"));


    Actions action = new Actions(driver);
    action.moveToElement(languages).click().perform();
        WebElement espanyol = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
        action.moveToElement(espanyol).click().perform();
    }
}

// espanyol (//*[@class='a-row a-spacing-mini'])[2]