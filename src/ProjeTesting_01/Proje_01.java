package ProjeTesting_01;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Proje_01 extends BaseDriver {

   static String username="blackmamed"+(int)(Math.random()*100);

    @Test
    public  void Test1() {


        driver.get("https://itera-qa.azurewebsites.net/");
        WebElement signUp = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        signUp.click();
        MyFunc.Wait(1);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Mammad");
        MyFunc.Wait(1);
        WebElement surName = driver.findElement(By.xpath("//input[@id='Surname']"));
        surName.sendKeys("Rzayev");
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.xpath("//input[@id='E_post']"));
        email.sendKeys("blackmamed2468@mail.ru");
        MyFunc.Wait(1);

        WebElement mobil = driver.findElement(By.xpath("//input[@id='Mobile']"));
        mobil.sendKeys("+994552460406");
        MyFunc.Wait(1);

        WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys(username);
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1234567");
        MyFunc.Wait(1);

        WebElement passwordReap = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        passwordReap.sendKeys("1234567");
        MyFunc.Wait(1);

        WebElement submit = driver.findElement(By.xpath("//input[@id='submit']"));
        submit.click();
        MyFunc.Wait(4);

        WebElement msj = driver.findElement(By.xpath("//label[@class='label-success']"));

        Assert.assertTrue("Fail", msj.getText().equals("Registration Successful"));


    }

    @Test
    public void Test2() {

        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();
        MyFunc.Wait(1);

        WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys(username);
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("1234567");
        MyFunc.Wait(1);

        WebElement loginEnt = driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        loginEnt.click();
        MyFunc.Wait(4);

        WebElement msj1 = driver.findElement(By.xpath("//h3[starts-with(text(),'Welcome')]"));

        Assert.assertTrue("Fail", msj1.getText().contains("Welcome"));


    }

    @Test
    public void Test3() {


        driver.get("https://itera-qa.azurewebsites.net/Dashboard");

        WebElement greateNew = driver.findElement(By.cssSelector("a[class='btn btn-primary']"));
        greateNew.click();
        MyFunc.Wait(1);
        WebElement name = driver.findElement(By.cssSelector("input[id='Name']"));
        name.sendKeys("Memmed");
        MyFunc.Wait(1);
        WebElement company = driver.findElement(By.cssSelector("input[id='Company']"));
        company.sendKeys("MR");
        MyFunc.Wait(1);

        WebElement address = driver.findElement(By.cssSelector("input[id='Address']"));
        address.sendKeys("Azerbaijan");
        MyFunc.Wait(1);
        WebElement city = driver.findElement(By.cssSelector("input[id='City']"));
        city.sendKeys("Baku");
        MyFunc.Wait(1);
        WebElement phone = driver.findElement(By.cssSelector("input[id='Phone']"));
        phone.sendKeys("+9944552460406");
        MyFunc.Wait(1);
        WebElement email = driver.findElement(By.cssSelector("input[id='Email']"));
        email.sendKeys("blackmamed12345@gmail.com");
        MyFunc.Wait(1);

        WebElement great = driver.findElement(By.cssSelector("input[class='btn btn-primary']"));
        great.click();
        MyFunc.Wait(2);


        WaitClose();
    }

}
