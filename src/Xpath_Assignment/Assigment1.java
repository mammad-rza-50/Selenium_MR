package Xpath_Assignment;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assigment1 extends BaseDriver {

    @Test
    public void Test1() {

//        1) Bu siteye gidin. -> http://demoqa.com/text-box
//        2) Full Name kısmına "Automation" girin.
//        3) Email kısmına "Testing@gmail.com" girin.
//        4) Current Address kısmına "Testing Current Address" girin.
//        5) Permanent Address kısmına "Testing Permanent Address" girin.
//        6) Submit butonuna tıklayınız.
//        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
//        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

        driver.get("http://demoqa.com/text-box");
        WebElement fullName = driver.findElement(By.xpath("//input[@id='userName']"));
        fullName.sendKeys("Automation");
        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        WebElement curAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        curAddress.sendKeys("Testing Current Address");
        WebElement perAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
        perAddress.sendKeys("Testing Permanent Address");
        WebElement subBtn = driver.findElement(By.xpath("//button[@id='submit']"));
        subBtn.click();
        WebElement fullNameMsg = driver.findElement(By.xpath("//p[@id='name']"));
        WebElement emailMsg = driver.findElement(By.xpath("//p[@id='email']"));


        Assert.assertTrue("Axtarilan userName tapilmadi", fullNameMsg.getText().contains("Automation"));
        Assert.assertTrue("Axtarilan userName tapilmadi", emailMsg.getText().contains("Testing@gmail.com"));


       waitClose();
    }
}
