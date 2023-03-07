package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _05_Question extends BaseDriver {

    /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

    @Test
    public void Test() {

        driver.get("https://www.selenium.dev/");

        String mainPageWindowId = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {
            if (!link.getAttribute("href").contains("mail")) ;
            link.click();
        }

        Set<String> windowsIds = driver.getWindowHandles();

        for (String id : windowsIds) {
            MyFunc.Wait(1);
            driver.switchTo().window(id);//siradaki tabdaki windowsa kecmis oldum
            System.out.println("Title= " + driver.getTitle() + ", -->Url= " + driver.getCurrentUrl());

        }

        // main page den basqa hamisini baglayir
        for (String id : windowsIds) {

            if (id.equals(mainPageWindowId))
                continue;

            MyFunc.Wait(1);
            driver.switchTo().window(id);
            driver.close();


        }

    }
}
