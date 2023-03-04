package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {

    /*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?
        driver.switchTo().alert()     -> alerte geçerim
        komutları:
        1- accept : OK, TAMAM botunan basmamızı sağlar.
        2- dismiss : CANCEL, HAYIR, yani olumsuz butonuna basmamızı sağlıyor.
        3- sendKeys : yazı gönderme
        4- getText : uyarı yazısını alma

 */


    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe1 = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        MyFunc.Wait(2);
        clickMe1.click();

        MyFunc.Wait(2);
        //alert acilir

        driver.switchTo().alert().accept();// alert qutucugunun Ok-ne tikla. baglansin


        waitClose();
    }

    @Test
    public void Test2() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe2 = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        MyFunc.Wait(2);
        clickMe2.click();

        MyFunc.Wait(2);
        //alert acilir

        driver.switchTo().alert().dismiss();// alert qutucugunun cancel-e tikla. baglansin


        waitClose();

    }

    @Test
    public void Test3() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe3 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Wait(2);
        clickMe3.click();

        MyFunc.Wait(2);
        //alert acilir

        driver.switchTo().alert().sendKeys("Memmed");// alert qutucugunun Ok-ne tikla. baglansin
        driver.switchTo().alert().accept();

        WebElement txtActual = driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("Gozlenen yazi varmi", txtActual.getText().contains("Memmed"));

        MyFunc.Wait(2);


        waitClose();
    }
}
