package Gun10;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Question extends BaseDriver {

    @Test
    public void Test() {

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Azerbaijan yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */
        driver.get(" https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Azerbaijan");
        driver.switchTo().parentFrame();// burada bir pille iceri girmisem deye istifade etdim
        //driver.switchTo().defaultContent(); bu ana sehifeye qaytarir

        driver.switchTo().frame(1);
        WebElement animals = driver.findElement(By.className("col-lg-3"));
        Select animalsMenu = new Select(animals);
        animalsMenu.selectByValue("avatar");
        driver.switchTo().parentFrame();// burada bir pille iceri girmisem deye istifade etdim
        //driver.switchTo().defaultContent(); bu ana sehifeye qaytarir

        waitClose();
    }
}
