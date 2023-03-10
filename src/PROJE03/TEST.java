package PROJE03;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TEST extends BaseDriver {

    @Test
    public void TestCase1() {

        //  ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//  ➢ E-book add to cart butonuna tıklatınız.
//  ➢ Add promo code butonuna tıklatıp veri giriniz.
//  ➢ Apply butonuna tıklayınız.
//  ➢ Invalid promo code yazısının görüldüğünü doğrulayınız


        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement ebookAddToCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        ebookAddToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement iframe5 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']")));
        WebElement addPromoCode = driver.findElement(By.xpath("//button[@class='Apply-Button Show-Promo-Code-Button']"));
        addPromoCode.click();

        WebElement promoCodeText = driver.findElement(By.xpath("//input[@class='Promo-Code-Value']"));
        promoCodeText.sendKeys("1214");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Promo-Apply']")));
        WebElement promoApply = driver.findElement(By.xpath("//button[@class='Promo-Apply']"));
        promoApply.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Invalid promo code']")));
        WebElement invalidPromoCode = driver.findElement(By.xpath("//span[text()='Invalid promo code']"));
        Assert.assertTrue(invalidPromoCode.getText().equals("Invalid promo code"));

        driver.switchTo().defaultContent();

    }

    @Test
    public void TestCase2() {

//   ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//  ➢ E-book add to cart butonuna tıklatınız.
//  ➢ Pay using debit card a tıklatınız.
//  ➢ Pay butonuna tıklatınız.
//  ➢ Invalid Email, Invalid Email, invalid billing name mesajlarının görüldüğünü doğrulayınız.

        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement ebookAddToCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        ebookAddToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement iframe5 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        WebElement payUsingCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        payUsingCard.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Pay-Button']")));
        WebElement payBtn = driver.findElement(By.xpath("//button[@class='Pay-Button']"));
        payBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Invalid Billing Name']")));
        WebElement invalidMsj = driver.findElement(By.xpath("//span[text()='Invalid Billing Name']"));
        Assert.assertTrue(invalidMsj.getText().contains("Invalid Billing Name"));

        driver.switchTo().defaultContent();

    }

    @Test
    public void TestCase3() {

//  ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//  ➢ E-book add to cart butonuna tıklatınız.
//  ➢ Pay using debit card a tıklatınız.
//  ➢ Card numarasına “1111 1111 1111 1111” giriniz
//  ➢ “Your card number is invalid” mesajının görüldüğünü doğrulayınız

        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement ebookAddToCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        ebookAddToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement iframe5 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        WebElement payUsingCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        payUsingCard.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure card payment input frame']")));
        WebElement iframe6 = driver.findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
        driver.switchTo().frame(iframe6);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='cardnumber']")));
        WebElement cardNum = driver.findElement(By.xpath("//input[@name='cardnumber'] "));
        cardNum.sendKeys("1111 1111 1111 1111");
        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Your card number is invalid.']")));
        WebElement invalidcardMess = driver.findElement(By.xpath("//span[text()='Your card number is invalid.']"));

        Assert.assertTrue(invalidcardMess.isDisplayed());

        driver.switchTo().defaultContent();

    }

    @Test
    public void TestCase4() {

//  ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//  ➢ E-book add to cart butonuna tıklatınız.
//  ➢ Pay using debit card a tıklatınız.
//  ➢ Email, confirm Email, name, telefon, company, Card number(“4242 4242 4242 4242” ) giriniz,
//     expdate, cvc kodu bilgilerini doldurunuz
//  ➢ Pay butonuna tıklayınız
//  ➢ “Your order is confirmed. Thank you!” mesajının görüldüğünü doğrulayınız

        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        WebElement ebookAddToCart = driver.findElement(By.xpath("(//button[@class='view_product'])[2]"));
        ebookAddToCart.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']")));
        WebElement iframe5 = driver.findElement(By.xpath("//iframe[@class='EJIframeV3 EJOverlayV3']"));
        driver.switchTo().frame(iframe5);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='Payment-Button CC']")));
        WebElement payUsingCard = driver.findElement(By.xpath("//button[@class='Payment-Button CC']"));
        payUsingCard.click();

        WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        email.sendKeys("selenium@gmail.com");

        WebElement congEmail = driver.findElement(By.xpath("//input[@placeholder='Confirm Email']"));
        congEmail.sendKeys("selenium@gmail.com");

        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name On Card']"));
        name.sendKeys("Memmed");

        WebElement phone = driver.findElement(By.xpath("(//input[@autocomplete='phone'])[1]"));
        phone.sendKeys("+99412141214");

        WebElement company = driver.findElement(By.xpath("(//input[@autocomplete='company'])[1]"));
        company.sendKeys("MR");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@title='Secure card payment input frame']")));
        WebElement iframe6 = driver.findElement(By.xpath("//iframe[@title='Secure card payment input frame']"));
        driver.switchTo().frame(iframe6);

        WebElement cardNumber = driver.findElement(By.xpath("//input[@name='cardnumber']"));
        cardNumber.sendKeys("4242 4242 4242 4242");

        WebElement expdate = driver.findElement(By.xpath("//input[@name='exp-date']"));
        expdate.sendKeys("12/23");

        WebElement cvc = driver.findElement(By.xpath("//input[@name='cvc']"));
        cvc.sendKeys("000");

        driver.switchTo().parentFrame();
        WebElement payBtn = driver.findElement(By.xpath("//button[text()='Pay 0.50 USD']"));
        payBtn.click();
        driver.switchTo().defaultContent();
        WebElement orderConfirm = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//span[text()=' your order is confirmed. Thank you!']")));
        Assert.assertTrue(orderConfirm.isDisplayed());

        driver.switchTo().defaultContent();

    }

    @Test
    public void TestCase5() {

//  ➢ https://shopdemo.e-junkie.com/ sitesine gidiniz
//  ➢ ContactUs butonuna tıklattınız
//  ➢ Name, Email, Subject ve mesaj kısımlarını doldurun
//  ➢ Send butonuna tıklatın
//  ➢ Alert in görüldüğünü doğrulayın ve alert I kap

        driver.get("https://shopdemo.e-junkie.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement contackBtn = driver.findElement(By.xpath("//a[@class='contact']"));
        contackBtn.click();

        WebElement nameContact = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@id='sender_name']")));

        nameContact.sendKeys("Memmed");

        WebElement email = driver.findElement(By.xpath("//input[@id='sender_email']"));

        email.sendKeys("selenium@gmail.com");

        WebElement subject = driver.findElement(By.xpath("//input[@id='sender_subject']"));

        subject.sendKeys("Test's proqrams");

        WebElement message = driver.findElement(By.xpath("//textarea[@id='sender_message']"));

        message.sendKeys("I study test programs");

        WebElement send = driver.findElement(By.xpath("//button[@id='send_message_button']"));
        send.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
        waitClose();
    }
}
