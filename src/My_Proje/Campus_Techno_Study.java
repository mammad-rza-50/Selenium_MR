package My_Proje;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Campus_Techno_Study extends BaseDriver {

    @Test

    public void Test() {

        driver.get("https://campus.techno.study/");

        WebElement cookerBtn = driver.findElement(By.xpath("//button[text()='Accept all cookies']"));
        cookerBtn.click();
        MyFunc.Wait(2);

        WebElement userName = driver.findElement(By.cssSelector("input[id='mat-input-0']"));
        userName.sendKeys("mammad_rzayev");
        MyFunc.Wait(2);

        WebElement password = driver.findElement(By.cssSelector("input[id='mat-input-1']"));
        password.sendKeys("Tna250111cts");
        MyFunc.Wait(2);

        WebElement loginBtn = driver.findElement(By.xpath("//span[text()=' LOGIN ']"));
        loginBtn.click();
        MyFunc.Wait(5);

        WebElement lesson1= driver.findElement(By.xpath("(//span[text()=' Strated '])[1]"));
        lesson1.click();
        MyFunc.Wait(2);

//        WebElement beginLesson1 = driver.findElement(By.cssSelector("svg[class='svg-inline--fa fa-bars']"));
//        beginLesson1.click();
//        MyFunc.Wait(2);
//
//        WebElement videoConfBtn = driver.findElement(By.xpath("//span[text()='Video Konferans']"));
//       videoConfBtn.click();
//        MyFunc.Wait(2);
//
//        WebElement toplantilarBtn= driver.findElement(By.xpath("//span[text()='Toplantılar']"));
//        toplantilarBtn.click();
//        MyFunc.Wait(2);


        waitClose();
    }
}
