import Utilities.TestBaseBeforeAfter;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.List;
import java.util.Set;

public class Cookies extends TestBaseBeforeAfter {
    @Test
    public void test1() {
        driver.get("https://amazon.com");
        Set<Cookie> cookiesvanAmazon  = driver.manage().getCookies();
        System.out.println(cookiesvanAmazon);
       int count = 1;
        for (Cookie e:cookiesvanAmazon
             ) {
           System.out.println(count + ". cookie "+ e);
            System.out.println("Name: " + e.getName() );
            System.out.println("Value: " + e.getValue() );
            count++;
            if (e.getName().equals("i18n-prefs")){
                Assert.assertEquals("USD",e.getValue());
            }
        }
        //Yeni bir cookie ekleme
        Cookie cookie = new Cookie("en sevdigim cookie","cikolatali");
        driver.manage().addCookie(cookie);

        cookiesvanAmazon  = driver.manage().getCookies();
        Assert.assertTrue(cookiesvanAmazon.contains(cookie));
        count =1;
        for (Cookie e:cookiesvanAmazon
             ) {
            System.out.println(count + ".name: " +e.getName());
            System.out.println(count + ".value:" + e.getValue());
            count++;

        }
        System.out.println(cookiesvanAmazon.size());
        Assert.assertTrue(cookiesvanAmazon.size()>5);
        //ismi skin olan cookie sil ve silindiğini kontrol et
        driver.manage().deleteCookieNamed("skin");
        Assert.assertFalse(cookiesvanAmazon.contains("skin"));

        //Tüm cookieleri sil ve silinip silinmediklerini test et
        driver.manage().deleteAllCookies();
        cookiesvanAmazon  = driver.manage().getCookies();
        Assert.assertTrue(cookiesvanAmazon.isEmpty());



        }

    }
