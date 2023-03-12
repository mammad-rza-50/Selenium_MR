package SeleniumAssignment_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase1 extends BaseDriver {

//    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//    2- random 100 e kadar 2 sayı üretiniz.
//    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//    4- Sonuçları Assert ile kontrol ediniz.
//    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.


    @Test
    public void TestAdd() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        for (int i = 0; i < 5; i++) {

            WebElement numberFirst = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirst.sendKeys(String.valueOf((Math.random() * 100)));
            WebElement numberSecond = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecond.sendKeys(String.valueOf((Math.random() * 100)));

            WebElement operation = driver.findElement(By
                    .xpath("//select[@id='selectOperationDropdown']"));
            Select oprtn = new Select(operation);
            oprtn.selectByValue("0");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='calculateButton']"))).click();
            WebElement answer = driver.findElement(By
                    .xpath("//input[@id='numberAnswerField']"));

            MyFunc.Wait(1);
            Assert.assertTrue(answer.getText(), true);

            WebElement numberFirstClear = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirstClear.clear();
            WebElement numberSecondClear = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecondClear.clear();
        }
        MyFunc.Wait(1);
    }

    @Test
    public void TestSubtract() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        for (int i = 0; i < 5; i++) {

            WebElement numberFirst = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirst.sendKeys(String.valueOf((Math.random() * 100)));
            WebElement numberSecond = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecond.sendKeys(String.valueOf((Math.random() * 100)));

            WebElement operation = driver.findElement(By
                    .xpath("//select[@id='selectOperationDropdown']"));
            Select oprtn = new Select(operation);
            oprtn.selectByValue("1");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='calculateButton']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='numberAnswerField']")));
            WebElement answer = driver.findElement(By
                    .xpath("//input[@id='numberAnswerField']"));

            MyFunc.Wait(1);
            Assert.assertTrue(answer.getText(), true);

            WebElement numberFirstClear = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirstClear.clear();
            WebElement numberSecondClear = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecondClear.clear();
        }
        MyFunc.Wait(1);
    }

    @Test
    public void TestMultiply() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        for (int i = 0; i < 5; i++) {

            WebElement numberFirst = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirst.sendKeys(String.valueOf((Math.random() * 100)));
            WebElement numberSecond = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecond.sendKeys(String.valueOf((Math.random() * 100)));

            WebElement operation = driver.findElement(By
                    .xpath("//select[@id='selectOperationDropdown']"));
            Select oprtn = new Select(operation);
            oprtn.selectByValue("2");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='calculateButton']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='numberAnswerField']")));
            WebElement answer = driver.findElement(By
                    .xpath("//input[@id='numberAnswerField']"));

            MyFunc.Wait(1);
            Assert.assertTrue(answer.getText(), true);

            WebElement numberFirstClear = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirstClear.clear();
            WebElement numberSecondClear = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecondClear.clear();
        }
        MyFunc.Wait(1);
    }

    @Test
    public void TestDivide() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        for (int i = 0; i < 5; i++) {

            WebElement numberFirst = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirst.sendKeys(String.valueOf((Math.random() * 100)));
            WebElement numberSecond = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecond.sendKeys(String.valueOf((Math.random() * 100)));

            WebElement operation = driver.findElement(By
                    .xpath("//select[@id='selectOperationDropdown']"));
            Select oprtn = new Select(operation);
            oprtn.selectByValue("3");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='calculateButton']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='numberAnswerField']")));
            WebElement answer = driver.findElement(By
                    .xpath("//input[@id='numberAnswerField']"));

            MyFunc.Wait(1);
            Assert.assertTrue(answer.getText(), true);

            WebElement numberFirstClear = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirstClear.clear();
            WebElement numberSecondClear = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecondClear.clear();
        }
        MyFunc.Wait(1);
    }

    @Test
    public void TestConcatenate() {

        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        for (int i = 0; i < 5; i++) {

            WebElement numberFirst = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirst.sendKeys(String.valueOf((int) (Math.random() * 100)));
            WebElement numberSecond = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecond.sendKeys(String.valueOf((int) (Math.random() * 100)));

            WebElement operation = driver.findElement(By
                    .xpath("//select[@id='selectOperationDropdown']"));
            Select oprtn = new Select(operation);
            oprtn.selectByValue("4");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='calculateButton']"))).click();
            wait.until(ExpectedConditions.visibilityOfElementLocated(By
                    .xpath("//input[@id='numberAnswerField']")));
            WebElement answer = driver.findElement(By
                    .xpath("//input[@id='numberAnswerField']"));

            MyFunc.Wait(1);
            Assert.assertTrue(answer.getText(), true);

            WebElement numberFirstClear = driver.findElement(By
                    .xpath("//input[@id='number1Field']"));
            numberFirstClear.clear();
            WebElement numberSecondClear = driver.findElement(By
                    .xpath("//input[@id='number2Field']"));
            numberSecondClear.clear();

        }
        MyFunc.Wait(1);
    }
}
