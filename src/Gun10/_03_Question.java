package Gun10;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Question extends BaseDriver {

    @Test
    public void Test() {

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */
        driver.get(" https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);
        WebElement topic = driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Azerbaijan");

        driver.switchTo().frame(0);// frame1 in icerisinde bir ede frame var indexi=0
        WebElement chekbox = driver.findElement(By.cssSelector("input[id='a']"));
        chekbox.click();
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement animals = driver.findElement(By.className("col-lg-3"));
        Select animalsMenu = new Select(animals);
        animalsMenu.selectByValue("avatar");
        driver.switchTo().defaultContent();

        waitClose();
    }
}