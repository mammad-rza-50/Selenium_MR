package Css_Assignments;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment4 extends BaseDriver {

//    Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
//    Calculate'e tıklayınız.
//    İlk input'a herhangi bir sayı giriniz.
//    İkinci input'a herhangi bir sayı giriniz.
//    Calculate button'una tıklayınız.
//    Sonucu alınız.
//    Sonucu yazdırınız.


    @Test
    public void Test4() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculateBtn = driver.findElement(By.cssSelector("a[id='calculatetest']"));
        calculateBtn.click();

        WebElement firstNumber = driver.findElement(By.cssSelector("input[id='number1']"));
        firstNumber.sendKeys("12");
        WebElement functionPlus = driver.findElement(By.cssSelector("select[id='function']>:nth-child(2)"));
        functionPlus.click();
        WebElement secondNumber = driver.findElement(By.cssSelector("input[id='number2']"));
        secondNumber.sendKeys("14");

        WebElement calculateResult = driver.findElement(By.cssSelector("input[id='calculate']"));
        calculateResult.click();
        WebElement resultMsg = driver.findElement(By.cssSelector("span[id='answer']"));

        System.out.println("Result= " + resultMsg.getText());

        waitClose();
    }
}
