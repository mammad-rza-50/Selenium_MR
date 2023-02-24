package HomeWork;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task_1 extends BaseDriver {
    // 1- https://formsmarts.com/form/yu?mode=h5 sitesini açın
    // 2- Business i çekleyin.
    // 3- discover XYZ ye tıklatın ve online Advertising i seçin
    // 4- Every day i seçin
    // 5- Good u seçin
    // 6- using XYZ yi tıklatın ve 3.seçeneği seçin
    // css selector
    @Test
    public void Test() {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        WebElement businessBtn = driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        businessBtn.click();
        MyFunc.Wait(2);

        WebElement discoverBtn = driver.findElement(By.cssSelector("[id$='_4588']"));
        discoverBtn.click();
        MyFunc.Wait(2);

        WebElement onLnAdvstBtn = driver.findElement(By.cssSelector("[value='Online Advertising']"));
        onLnAdvstBtn.click();
        MyFunc.Wait(2);

        WebElement everyDayBtn = driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        everyDayBtn.click();
        MyFunc.Wait(2);

        WebElement goodBtn = driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodBtn.click();
        MyFunc.Wait(2);

        WebElement usingXYZbtn = driver.findElement(By.cssSelector("select[id$='_4597']"));
        usingXYZbtn.click();
        MyFunc.Wait(2);

        WebElement btn7 = driver.findElement(By.cssSelector("select[id$='_4597']>:nth-child(4)"));
        goodBtn.click();
        WaitClose();
    }
}
