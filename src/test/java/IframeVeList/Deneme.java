package IframeVeList;

import AlertsIframePratik.Iframe;
import Utilities.TestBaseBeforeAfter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Deneme extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        //Detect Iframe text
        WebElement textAreaFrami = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(textAreaFrami);
        //Text alanını webelemente al
        WebElement textalani = driver.findElement(By.xpath("//p"));
       textalani.clear();
       textalani.sendKeys("Fatih");
       driver.switchTo().defaultContent();


    }

    @Test
    public void test2() {
        driver.get("https://html.com/tags/iframe");
        List<WebElement>siteFrameleri = new ArrayList<>(driver.findElements(By.xpath("//iframe")));
        driver.findElement(By.xpath("//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")).click();
driver.switchTo().frame(siteFrameleri.get(0));
    }
}
