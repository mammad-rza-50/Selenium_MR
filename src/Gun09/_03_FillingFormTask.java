package Gun09;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_FillingFormTask extends BaseDriver {

//    Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
//    Name giriniz.
//    Comment giriniz.
//    Submit'e tıklayınız.
//    Form submited Successfully! yazısı görüntülenmelidir.
//            assert ile kontrol ediniz


    @Test
    public void Test() {

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name = driver.findElement(By.cssSelector("input[id='title']"));
        name.sendKeys("Memmed");

        WebElement comment = driver.findElement(By.cssSelector("textarea[id='description']"));
        comment.sendKeys("Memmed Rzayev");

        WebElement submit = driver.findElement(By.cssSelector("input[id='btn-submit']"));
        submit.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[id='submit-control']"), "Form submited Successfully!"));

        WebElement msj = driver.findElement(By.cssSelector("div[id='submit-control']"));

        Assert.assertEquals("Form submited Successfully!", msj.getText());

        waitClose();
    }

}
