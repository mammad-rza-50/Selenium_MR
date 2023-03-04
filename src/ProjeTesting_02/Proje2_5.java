package ProjeTesting_02;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Proje2_5 extends BaseDriver {

    @Test
    public void OrderTest() {

        driver.get("http://demowebshop.tricentis.com/");

        Actions actions = new Actions(driver);

        WebElement login = driver.findElement(By.linkText("Log in"));
        Action action = actions.moveToElement(login).click().build();
        action.perform();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("mr59@gmail.com");
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

        WebElement computers = driver.findElement(By.xpath("(//ul[@class='top-menu']//a['Computers'])[2]"));
        WebElement notebooks = driver.findElement(By.xpath("(//ul[@class='sublist firstLevel']//a['Notebooks'])[2]"));
        actions.moveToElement(computers).build().perform();
        actions.moveToElement(notebooks).click().build().perform();


        WebElement addToCard = driver.findElement(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-2 product-box-add-to-cart-button']")));
        action = actions.moveToElement(addToCard).click().build();
        action.perform();

        WebElement msjBarNot = driver.findElement(By.xpath("//p[@class='content']"));
        Assert.assertEquals("The product has been added to your shopping cart", msjBarNot.getText());
        WebElement shopingCart = driver.findElement(By.xpath("(//span[@class='cart-label'])[1]"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='cart-label'])[1]")));

        action = actions.moveToElement(shopingCart).click().build();
        action.perform();

        WebElement msjLaptop = driver.findElement(By.className("product-name"));
        Assert.assertTrue("Laptop don't have", msjLaptop.getText().contains("14.1-inch Laptop"));

        WebElement agreeChBx = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        action = actions.moveToElement(agreeChBx).click().build();
        action.perform();

        WebElement checkOut = driver.findElement(By.xpath("//button[@class='button-1 checkout-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='button-1 checkout-button']")));
        action = actions.moveToElement(checkOut).click().build();
        action.perform();

        WebElement country = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
        Select selCount = new Select(country);
        selCount.selectByVisibleText("Azerbaijan");

        WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Baku");

        WebElement address = driver.findElement(By.id("BillingNewAddress_Address1"));
        address.sendKeys("New Street");

        WebElement zipCode = driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("0121");

        WebElement phoneNum = driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNum.sendKeys("0552460406");

        WebElement contunie = driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Billing.save()']")));
        action = actions.moveToElement(contunie).click().build();
        action.perform();

        WebElement selector = driver.findElement(By.xpath("//p[@class='selector']"));
        action = actions.moveToElement(selector).click().build();
        action.perform();

        WebElement shippingAddress = driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick='Shipping.save()']")));
        action = actions.moveToElement(shippingAddress).click().build();
        action.perform();


        WebElement shippingMethod = driver.findElement(By.id("shippingoption_1"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("shippingoption_1")));
        action = actions.moveToElement(shippingMethod).click().build();
        action.perform();

        WebElement contunie1 = driver.findElement(By.xpath("//input[@class='button-1 shipping-method-next-step-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 shipping-method-next-step-button']")));
        action = actions.moveToElement(contunie1).click().build();
        action.perform();

        WebElement contunie2 = driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 payment-method-next-step-button']")));
        action = actions.moveToElement(contunie2).click().build();
        action.perform();

        WebElement contunie3 = driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 payment-info-next-step-button']")));
        action = actions.moveToElement(contunie3).click().build();
        action.perform();

        WebElement contunie4 = driver.findElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='button-1 confirm-order-next-step-button']")));
        action = actions.moveToElement(contunie4).click().build();
        action.perform();

        WebElement msjEnd = driver.findElement(By.xpath("(//div[@class='title'])//strong"));
        Assert.assertTrue("End Fail", msjEnd.getText().contains("Your order has been successfully processed!"));


        waitClose();

    }
}
