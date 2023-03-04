package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _01_Question extends BaseDriver {

//        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test() {

        driver.get("https://www.facebook.com/");


        MyFunc.Wait(2);

        List<WebElement> cookieAccept = driver.findElements(By.xpath("//button[text()='Allow" +
                " essential and optional cookies']"));

        if (cookieAccept.size() > 0)
            cookieAccept.get(0).click();

        WebElement createNewaccount = driver.findElement(By.linkText("Create new account"));
        createNewaccount.click();
        MyFunc.Wait(2);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Mammad");
        MyFunc.Wait(2);

        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Rzayev");
        MyFunc.Wait(2);

        WebElement reEmail = driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed()); // gozlenen gorunmesi false
        System.out.println(reEmail.isDisplayed());

        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("blackmamed_246@mail.ru");
        MyFunc.Wait(2);

        WebElement reEmail1 = driver.findElement(By.name("reg_email_confirmation__"));
        reEmail1.sendKeys("blackmamed_246@mail.ru");

        Assert.assertTrue(reEmail.isDisplayed());
        System.out.println("email.isDisplayed() = " + email.isDisplayed());
        MyFunc.Wait(2);

        WebElement password = driver.findElement(By.name("reg_passwd__"));
        password.sendKeys("1234567");
        MyFunc.Wait(2);

        WebElement webDay = driver.findElement(By.id("day"));
        Select day = new Select(webDay);
       // day.selectByIndex(15); // ve ya
        day.selectByValue("16");

        WebElement webMonth = driver.findElement(By.id("month"));
        Select month = new Select(webMonth);
        //month.selectByIndex(7); // ve ya
        month.selectByValue("8");
        MyFunc.Wait(2);

        WebElement webYear = driver.findElement(By.id("year"));
        Select yaer = new Select(webYear);
        //month.selectByIndex(7); // ve ya
        yaer.selectByValue("1980");

        WebElement male = driver.findElement(By.cssSelector("input[id='u_r_5_gH']"));
        male.click();

        waitClose();


    }
}
