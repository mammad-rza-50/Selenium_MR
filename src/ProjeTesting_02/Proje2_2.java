package ProjeTesting_02;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Proje2_2 extends BaseDriver {


    @Test
    public void NegativRegisterTest() {

        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement register = driver.findElement(By.linkText("Register"));
        Action action = actions.moveToElement(register).click().build();
        action.perform();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));
        WebElement male = driver.findElement(By.id("gender-male"));
        action = actions.moveToElement(male).click().build();
        action.perform();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Memmed");
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Rzyev");
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("mr52.gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("1234567");
        WebElement rePassword = driver.findElement(By.id("ConfirmPassword"));
        rePassword.sendKeys("1234567");

        WebElement registerBtn = driver.findElement(By.id("register-button"));
        action = actions.moveToElement(registerBtn).click().build();
        action.perform();

        WebElement msj = driver.findElement(By.xpath("//li[text()='The specified email already exists']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[text()='The specified email already exists']")));
        Assert.assertTrue("Your registration completed", msj.getText().contains("he specified email already exists"));

        waitClose();

    }
}
