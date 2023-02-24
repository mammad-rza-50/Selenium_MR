package Css_Assignments;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment6 extends BaseDriver {

//    Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
//    Fake Alerts'e tıklayınız.
//    Show modal dialog buttonuna tıklayınız.
//            Ok'a tıklayınız.
//    Alert kapanmalıdır.

    @Test
    public void Test6() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlertBtn = driver.findElement(By.cssSelector("a[href='alerts/fake-alert-test.html']"));
        fakeAlertBtn.click();
        WebElement showModalAlertBtn = driver.findElement(By.cssSelector("input[id='modaldialog']"));
        showModalAlertBtn.click();
        WebElement okBtn = driver.findElement(By.cssSelector("button[id='dialog-ok']"));
        okBtn.click();


        WaitClose();
    }
}
