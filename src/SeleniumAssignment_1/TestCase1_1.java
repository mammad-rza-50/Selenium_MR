package SeleniumAssignment_1;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestCase1_1 extends BaseDriver {

    //    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
//    2- random 100 e kadar 2 sayı üretiniz.
//    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
//    4- Sonuçları Assert ile kontrol ediniz.
//    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.

    @Test
    public void Test() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        String a;
        String b;

        WebElement number1 = driver.findElement(By.id("number1Field"));
        WebElement number2 = driver.findElement(By.id("number2Field"));
        WebElement selection = driver.findElement(By.id("selectOperationDropdown"));
        Select ddMenu = new Select(selection);
        WebElement calculation = driver.findElement(By.id("calculateButton"));
        WebElement answer = driver.findElement(By.id("numberAnswerField"));
        WebElement integer = driver.findElement(By.id("integerSelect"));


        int count = 0;

        while (count < 5) {

            a = String.valueOf((int) (Math.random() * 100));
            b = String.valueOf((int) (Math.random() * 100));
            number1.sendKeys(a);
            number2.sendKeys(b);
            integer.click();

            for (int i = 0; i < 5; i++) {

                ddMenu.selectByIndex(i);
                calculation.click();

                int number10 = Integer.parseInt(a);
                int number20 = Integer.parseInt(b);

                if (i == 0) {
                    int add = number10 + number20;
                    String add1 = String.valueOf(add);
                    Assert.assertTrue("failed", answer.getAttribute("value").equals(add1));
                } else if (i == 1) {
                    int subtract = number10 - number20;
                    String subtract1 = String.valueOf(subtract);
                    Assert.assertTrue("failed", answer.getAttribute("value").equals(subtract1));
                } else if (i == 2) {
                    int multiply = number10 * number20;
                    String multiply1 = String.valueOf(multiply);
                    Assert.assertTrue("failed", answer.getAttribute("value").equals(multiply1));
                } else if (i == 3) {
                    int divide = number10 / number20;
                    String divide1 = String.valueOf(divide);
                    Assert.assertTrue("failed", answer.getAttribute("value").equals(divide1));
                } else if (i == 4) {
                    String con1 = String.valueOf(number10);
                    String con2 = String.valueOf(number20);
                    String concatenate = con1 + con2;
                    Assert.assertTrue("failed", answer.getAttribute("value").equals(concatenate));

                }
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            }
            ddMenu.selectByIndex(0);

            number1.clear();
            number2.clear();

            count++;

        }
        waitClose();
    }
}
