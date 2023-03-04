package Gun04;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelector extends BaseDriver {
    // 1-Açılan sayfadaki kutucuğa mesajınızı yazını.
    // 2-Butona tıklatınız
    // 3-Butona basıldığında mesajınızın sayfada göründüğünü test ediniz.
    // ikinci yol

    @Test
    public void Test1() {

        String myMessage = "Hello Selenium";

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement txtBox = driver.findElement(By.cssSelector("input[id='user-message']"));

        txtBox.sendKeys(myMessage);

        WebElement btn = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        btn.click();

        WebElement msg = driver.findElement(By.cssSelector("[id='display']"));

        // if-elsenin evezine

        Assert.assertTrue("Axtarilan mesaj tapilmadi", msg.getText().equals(myMessage));
        // verilen deyer true ise hecne vermir,

       waitClose();
    }
}