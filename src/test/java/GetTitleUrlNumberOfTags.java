import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class GetTitleUrlNumberOfTags {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Tureng.com a git
        driver.get("https://tureng.com");

        //Console a gidilen sitenin title ını yazdıralım
        System.out.println("Title: " + driver.getTitle());

        //Title ın tureng kelimesini içerip içermediğini kontrol edelim
        String title = driver.getTitle();
        String istenilenTitle = "Tureng";
          // System.out.println(title.contains("Tureng") ? "Test passed" : "Test failed");
        System.out.println(title.contains(istenilenTitle) ? "Title test passed" : "Title test failed");

        String url = driver.getCurrentUrl();
        System.out.println("Url = " + url);
        String arananUrl = "tureng";
        System.out.println(url.contains(arananUrl) ? "Url Test Passed" : "Url Test failed");


        //Sayfanın handle değerlerini yazdıralım

        System.out.println("Page Handle Value: " + driver.getWindowHandle());

        //Sayfa Htm Kodlarında "Gateway"  kelimesinin geçip geçmediğini test edin
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
        String arananKelime = "details";



        System.out.println(pageSource.contains(arananKelime) ? "SoruceCode Test Passed" : "SoruceCode Test Failed");
        driver.close();

    }
}








