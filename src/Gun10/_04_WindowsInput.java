package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsInput extends BaseDriver {

    @Test

    public void Test() {

        driver.get("https://www.selenium.dev/");

        //bu an ana sehifedeyem
        // tapilan id yi almaq ucun

        String mainPageWindowId = driver.getWindowHandle();
        System.out.println("mainPageWindowId = " + mainPageWindowId);

        List<WebElement> links = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : links) {

            if (!link.getAttribute("href").contains("mail")) ;
            link.click();
        }

        // burada butun sehifeler acilir
        Set<String> windowsIds = driver.getWindowHandles();

        for (String id : windowsIds) {

            System.out.println("id = " + id);

            // bu an en son acilan sehife ana sehifeye kecmek ucun
            driver.switchTo().window(mainPageWindowId);// main page kecdim

            MyFunc.Wait(12);

            waitClose();
        }

    }
}
