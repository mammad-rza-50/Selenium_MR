package Gun10;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameInput extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");

        // id = frame1  name=iamframe   index?: oldugu sayfedeki kod sirasi sifirdan baslayir
        driver.switchTo().frame(0); // name agir isleyir, id yavas, index suretli isleyir

        WebElement topic = driver.findElement(By.cssSelector("b[id='topic']+input"));
        topic.sendKeys("Azerbaijan");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki odaya geç, parent e geç
        // driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer

        waitClose();
    }
}
