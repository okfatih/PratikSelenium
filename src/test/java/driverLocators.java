import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverLocators {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Tureng de accomplish kelimesini aratınız

        driver.get("https://amazon.com");
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
       // searchBox.sendKeys("Sabun" + Keys.ENTER);
        driver.findElement(By.partialLinkText("roducts on Amazon")).click();
    }





}
/*
 driver.get("https://amazon.com");
        //Amazonda nutella aratınız
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella",Keys.ENTER); // id uniqe olduğu bu sorunsuz çalışır
        //WebElement aramaKutusu = driver.findElement(By.name("field-keywords"));
        //aramaKutusu.sendKeys("Nutella"+ Keys.ENTER); // uniqe olduğu için sorunsuz çalışır
​
        //WebElement aramaKutusu = driver.findElement(By.className("nav-search-field "));
        /*
        Bu locatar çalismadı
        Locatar alırken gözümüzden kaçan detaylar olabilir
        aldığımız bir locatar çalışmazsa alternatif locatorlar denemeliyiz

        driver.findElement(By.partialLinkText("oducts on Amazon")).click(); // a tag'ındaki link isminden istediğimiz bir parçayla locate edebiliriz
                driver.findElement(By.linkText("Sell products on Amazon")).click();
                ​
                ​
 */