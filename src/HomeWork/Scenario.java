package HomeWork;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Scenario extends BaseDriver {

//    1- https://www.saucedemo.com/
//    2- login işlemini yapınız.
//    3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
//    4- Sonra geri dönün (Back to products e tıklatın)
//    5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
//    6- sepete tıklatın
//    7- CheckOut a tıklatın
//    8- kullanıcı bilgilerini doldurup Continue ya tıklatın
//    9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
//    Item total e eşit olup olmadığını Assert ile test ediniz.


    @Test
    public void Test() {

        driver.get("https://www.saucedemo.com/");

        WebElement userName = driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        MyFunc.Wait(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Wait(1);

        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='login-button']"));
        loginBtn.click();
        MyFunc.Wait(1);

        WebElement sauseLabBackpack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        sauseLabBackpack.click();
        MyFunc.Wait(1);

        WebElement sausLabBackackAddToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
        sausLabBackackAddToCart.click();
        MyFunc.Wait(1);

        WebElement backToProd = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProd.click();
        MyFunc.Wait(1);

        WebElement sauseLabBoltsTshirt = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        sauseLabBoltsTshirt.click();
        MyFunc.Wait(1);


        WebElement sausLabBoltTshirtAddToCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
        sausLabBoltTshirtAddToCart.click();
        MyFunc.Wait(1);

        WebElement backToProd2 = driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProd2.click();
        MyFunc.Wait(1);

        WebElement checkOut = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        checkOut.click();
        MyFunc.Wait(1);

        WebElement checkOutResult = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOutResult.click();
        MyFunc.Wait(1);

        WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("Mammad");
        MyFunc.Wait(1);

        WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("Rzayev");
        MyFunc.Wait(1);

        WebElement postCod = driver.findElement(By.xpath("//input[@id='postal-code']"));
        postCod.sendKeys("AZ0121");
        MyFunc.Wait(1);

        WebElement contunieBtn = driver.findElement(By.xpath("//input[@id='continue']"));
        contunieBtn.click();
        MyFunc.Wait(1);

        List<WebElement> prices = driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double total = 0;
        for (WebElement we : prices) {
            System.out.println("we = " + we.getText());
            // replaceAll ile [^0-9.,]
            total = total + Double.parseDouble(we.getText().substring(1));// 1 den etibaren sona qeder al
        }
        System.out.println("total = " + total);
        MyFunc.Wait(1);

        WebElement totalItem = driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        //System.out.println(totalItem.getText());
        //System.out.println(totalItem.getText().replaceAll("[^0-9,.]", ""));

        Double webTotalItem = Double.parseDouble(totalItem.getText().replaceAll("[^0-9,.]", ""));

        Assert.assertTrue("Item Total duz deyil", (total == webTotalItem));


        WaitClose();
    }
}
