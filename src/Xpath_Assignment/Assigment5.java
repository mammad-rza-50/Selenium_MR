package Xpath_Assignment;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assigment5 extends BaseDriver {


//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Fake Alerts' tıklayınız.
//    Show Alert Box'a tıklayınız.
//    Ok'a tıklayınız.
//    Alert kapanmalıdır.

    @Test
    public void Test5() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlertBtn = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakeAlertBtn.click();
        WebElement showAlertBtn = driver.findElement(By.xpath("//input[@id='fakealert']"));
        showAlertBtn.click();
        WebElement okBtn = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        okBtn.click();


        WaitClose();
    }

}
