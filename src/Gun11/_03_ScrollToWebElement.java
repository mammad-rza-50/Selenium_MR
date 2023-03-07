package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://www.copado.com/robotic-testing");
        driver.manage().deleteAllCookies();// cookies leri silir

        MyFunc.Wait(2);
        JavascriptExecutor js =(JavascriptExecutor)driver;

        WebElement element = driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(false);", element);
        //elemente qeder surusdur

        js.executeScript("arguments[0].click();", element);// html icinden elemente catir ve tiklatir
        // element.click(); tiklama ozelliyini itiren elementlerin altinda oldugunda tiklamaz

        MyFunc.Wait(5);

        waitClose();
    }
}
