package ProjeTesting_02;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Proje2_3 extends BaseDriver {

    @Test
    public void LoginTest() {

        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("mrn@gmail.com");
        action = actions.moveToElement(email).click().build();
        action.perform();

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("1234567");
        action = actions.moveToElement(password).click().build();
        action.perform();

        WebElement rememberMe = driver.findElement(By.id("RememberMe"));
        action = actions.moveToElement(rememberMe).click().build();
        action.perform();

        WebElement logiBtn = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 login-button']")));
        action = actions.moveToElement(logiBtn).click().build();
        action.perform();

        WebElement gmailMsj = driver.findElement(By.xpath("//a[text()='mrn@gmail.com']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='mrn@gmail.com']")));
        Assert.assertTrue("Fail email", gmailMsj.getText().contains("mrn@gmail"));

        waitClose();
    }
}
