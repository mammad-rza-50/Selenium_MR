package Seleniumassignment_2;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestPages extends BaseDriver {


    @Test
    public void Test1() {

//        Bu web sitesine gidin   [https://testpages.herokuapp.com/styled/index.html]
//        Alerts e tıklayınız
//        URL'i yazdırınız.

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@id='alerts']"))).click();

        String alertUrl = driver.getCurrentUrl();
        System.out.println(alertUrl);

        MyFunc.Wait(2);

    }

    @Test
    public void Test2() {

//        Bu web sitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//        Alerts'e tıklayınız.
//        URL'i yazdırınız.
//        Geri gidin.
//        URL'i yazıdırnız.
//        Basic Ajax'a tıklayınız.
//        URL'i yazdırınız.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@id='alerts']"))).click();

        driver.navigate().back();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@id='basicajax']"))).click();

        String basicAjaxUrl = driver.getCurrentUrl();
        System.out.println(basicAjaxUrl);

        MyFunc.Wait(2);

    }

    @Test
    public void Test3() {

//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    [Find By Playground'a tıklayınız.]
//    (https://testpages.herokuapp.com/find_by_playground.php)
//    5. text'i bulunuz.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@id='findby']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("p5")));
        WebElement text5 = driver.findElement(By.id("p5"));
        System.out.println(text5.getText());

        MyFunc.Wait(2);

    }

    @Test
    public void Test4() {

//        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Search'e tıklayınız.
//        Başlığı yazdırınız.
//        Search button'una tıklayınız.
//        URL'i yazdırınız.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@href='/search.php']"))).click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//h1[text()='The \"Selenium Simplified\" Search Engine']")));
        WebElement titleSearch = driver.findElement(By.xpath("//h1[text()='The \"Selenium Simplified\" Search Engine']"));
        System.out.println(titleSearch.getText());

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@name='btnG']"))).click();

        String serchEnginUrl = driver.getCurrentUrl();
        System.out.println(serchEnginUrl);

        MyFunc.Wait(2);

    }

    @Test
    public void Test5() {

//        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Calculate'e tıklayınız.
//        İlk input'a herhangi bir sayı giriniz.
//        İkinci input'a herhangi bir sayı giriniz.
//        Calculate button'una tıklayınız.
//        Sonucu alınız.
//        Sonucu yazdırınız.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@href='/calculate.php']"))).click();

        WebElement number1 = driver.findElement(By.xpath("//input[@id='number1']"));
        number1.sendKeys("12");

        WebElement number2 = driver.findElement(By.xpath("//input[@id='number2']"));
        number2.sendKeys("14");

        WebElement calculateResult = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculateResult.click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//span[@id='answer']")));
        WebElement result = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println(result.getText());


        MyFunc.Wait(2);
    }

    @Test
    public void Test6() {

//        Bu websitesine gidiniz.  [https://testpages.herokuapp.com/styled/index.html]
//        Fake Alerts' tıklayınız.
//        Show Alert Box'a tıklayınız.
//        Ok'a tıklayınız.
//        Alert kapanmalıdır.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@id='fakealerttest']"))).click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@id='fakealert']"))).click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//button[@id='dialog-ok']"))).click();

        MyFunc.Wait(2);

    }

    @Test
    public void Test7() {

//        Bu siteye gidiniz.  https://testpages.herokuapp.com/styled/index.html
//        Fake Alerts'e tıklayınız.
//        Show modal dialog buttonuna tıklayınız.
//        Ok'a tıklayınız.
//        Alert kapanmalıdır.

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//a[@id='fakealerttest']"))).click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//input[@id='modaldialog']"))).click();

        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//button[@id='dialog-ok']"))).click();

        MyFunc.Wait(2);

        waitClose();

    }
}
