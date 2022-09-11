import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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

    }
}


/*




        //Sayfa handle degerini yazdirin
        System.out.println("Handle değeri : "+driver.getWindowHandle());
        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualPageSource = driver.getPageSource();
        String htmlArananKelime = "Gateway";
        if (actualPageSource.contains(htmlArananKelime)){
            System.out.println("Sourcecode Testi PASSED");
        }else System.out.println("Sourcecode Testi FAILED");
        //Sayfayi kapatin.
        driver.close();
 */
