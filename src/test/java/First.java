import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/kaynaklar/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Get methoudyla açtığımız ilk web sayfasını büyütmek için
        driver.manage().window().maximize();
        driver.get("https://mijn.overheid.nl"); // websayfamıza gidelim
        //Gittiğimiz sayfada titleın overheid kelimesini içerip içermediğini test edelim
        String title = driver.getTitle();
        System.out.println(title.contains("Mijn") ? "Title test passed" : "Title test failed");
        //Gittiğimiz sayfada url in overheid içerip içermediğini kontrol et
        String url = driver.getCurrentUrl();
        System.out.println(url.contains("overheid") ? "Url test passed" : "Url test failed");
    }
}
