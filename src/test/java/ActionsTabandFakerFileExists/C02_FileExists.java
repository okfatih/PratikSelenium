package ActionsTabandFakerFileExists;

import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.nio.file.Files;
import java.nio.file.Path;

public class C02_FileExists extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        System.out.println(System.getProperty("user.dir")); //içinde bulunduğum yolu gösterir C:\Users\Admin\IdeaProjects\demo\DeneyelimBakalim
        System.out.println(System.getProperty("user.home"));// Geçerli kullanıcının ana dizinini verir  C:\Users\Admin
//
//        String farkliBolum = System.getProperty("user.home");
//        //Masaüstündeki dosyanın yolu
//        String ortakBolum = ""
        Assert.assertTrue(Files.exists(Path.of("C:\\Users\\Admin\\Desktop\\New Text Document.txt")));

        //Soru
        driver.get("https://the-internet.herokuapp.com/download ");
        //sample.png dosyasını indir
        driver.findElement(By.xpath("//*[text()='sample.png']")).click();

        Assert.assertTrue(Files.exists(Path.of("C:\\Users\\Admin\\Downloads\\sample.png")));


    }
}
//"C:\Users\Admin\Desktop\New Text Document.txt"