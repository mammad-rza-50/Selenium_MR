package ProjeTesting_01;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Proje1 extends BaseDriver {

    public static void main(String[] args) {
        String name = "blackmamed" + (int) (Math.random() * 1000);
        Test(name);
        Test2(name);
        Test3();
    }

    @Test
    public static void Test(String userN) {
        driver.get("https://itera-qa.azurewebsites.net/home");

        WebElement sign = driver.findElement(By.xpath("//a[text()='Sign Up']"));
        sign.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Memmed");
        MyFunc.Wait(1);
        WebElement surname = driver.findElement(By.xpath("//input[@id='Surname']"));
        surname.sendKeys("Rza");
        MyFunc.Wait(1);
        WebElement email = driver.findElement(By.xpath("//input[@id='E_post']"));
        email.sendKeys("memmet10@gmail.com");
        MyFunc.Wait(1);
        WebElement mobile = driver.findElement(By.xpath("//input[@id='Mobile']"));
        mobile.sendKeys("5555555555555");
        MyFunc.Wait(1);
        WebElement userName = driver.findElement(By.xpath("//input[@id='Username']"));
        userName.sendKeys(userN);
        MyFunc.Wait(1);
        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("12345");
        MyFunc.Wait(1);
        WebElement confpassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confpassword.sendKeys("12345");
        MyFunc.Wait(1);
        WebElement submitButton = driver.findElement(By.xpath("//input[@id='submit']"));
        submitButton.click();
        WebElement mesaj = driver.findElement(By.xpath("//label[@class='label-success']"));

        Assert.assertTrue("failed!", mesaj.getText().equals("Registration Successful"));
    }

    @Test
    public static void Test2(String userN) {
        driver.get("https://itera-qa.azurewebsites.net/home");

        WebElement login = driver.findElement(By.cssSelector("a[class='nav-link'][href='/Login']"));
        login.click();

        WebElement username = driver.findElement(By.cssSelector("input[id='Username']"));
        username.sendKeys(userN);

        WebElement password = driver.findElement(By.cssSelector("input[id='Password']"));
        password.sendKeys("12345");

        WebElement loginButton = driver.findElement(By.cssSelector("input[name='login']"));
        loginButton.click();

        MyFunc.Wait(2);

        WebElement welcome = driver.findElement(By.xpath("//h3[starts-with(text(),'Welcome ')]"));

        MyFunc.Wait(2);

        Assert.assertTrue("Failed", welcome.getText().contains("Welcome "));

    }

    @Test
    public static void Test3() {
        driver.get("https://itera-qa.azurewebsites.net/Dashboard");


        WebElement create = driver.findElement(By.className("btn-primary"));
        create.click();
        MyFunc.Wait(1);

        WebElement name = driver.findElement(By.id("Name"));
        name.sendKeys("Memmet");
        MyFunc.Wait(1);

        WebElement company = driver.findElement(By.id("Company"));
        company.sendKeys("Techno Study");
        MyFunc.Wait(1);

        WebElement adress = driver.findElement(By.id("Address"));
        adress.sendKeys("Atatürk caddesi .....");
        MyFunc.Wait(1);

        WebElement city = driver.findElement(By.id("City"));
        city.sendKeys("İstanbul");
        MyFunc.Wait(1);

        WebElement phone = driver.findElement(By.id("Phone"));
        phone.sendKeys("111");
        MyFunc.Wait(1);

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("emreozturk@gmail.com");
        MyFunc.Wait(1);

        WebElement create2 = driver.findElement(By.className("btn-primary"));
        create2.click();

        waitClose();


    }
}