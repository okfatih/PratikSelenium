package ActionsTabandFakerFileExists;

import Utilities.TestBaseBeforeAfter;
import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_Facebook extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        driver.get("https://www.facebook.com ");
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _9xo7 _4jy3 _4jy1 selected _51sy']")).click();
        //Create new Account Tıkla
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
        Faker faker = new Faker();
        Actions actions = new Actions(driver);
        String isim = faker.name().firstName();
        String lastName = faker.name().lastName();
        String emailAddress= faker.internet().emailAddress();
        String password = faker.internet().password();


        WebElement isimKutusu = driver.findElement(By.xpath("(//input[@type='text'])[2]"));

        actions.click(isimKutusu).sendKeys(isim).
                sendKeys(Keys.TAB).
                sendKeys(lastName).
                sendKeys(Keys.TAB).
                sendKeys(emailAddress).
                sendKeys(Keys.TAB).
                sendKeys(emailAddress).
                sendKeys(Keys.TAB).
                sendKeys(password).
                 sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("May").
                sendKeys(Keys.TAB).
                sendKeys("01").
                sendKeys(Keys.TAB).
                sendKeys("1989").
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys(Keys.RIGHT).//male
                sendKeys(Keys.TAB). //Custom
                sendKeys(Keys.TAB). //Learn more
                sendKeys(Keys.TAB). //privacy policy
                sendKeys(Keys.TAB).//Cookies policy
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).//Sign up
                perform();
    }
}
