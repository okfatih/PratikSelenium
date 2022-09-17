import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Sempteber13Dersi {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
        WebElement password = driver.findElement(By.cssSelector("#session_password"));
        WebElement signin = driver.findElement(By.cssSelector("input[name ='commit']"));





        email.sendKeys("testtechproed@gmail.com");
        password.sendKeys("Test1234!");
        signin.click();

    }
}
