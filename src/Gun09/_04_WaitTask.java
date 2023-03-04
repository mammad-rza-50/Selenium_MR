package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_WaitTask extends BaseDriver {

    /*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz

 */

    @Test
    public void Test() {

        driver.get(" https://www.demoblaze.com/index.html");

        WebElement samsungGalaxyS6 = driver.findElement(By.linkText("Samsung galaxy s6"));
        samsungGalaxyS6.click();

        WebElement addToCard = driver.findElement(By.linkText("Add to cart"));
        addToCard.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());//alert cixana qeder gozle

        driver.switchTo().alert().accept();

        WebElement mainPage = driver.findElement(By.id("nava"));
        mainPage.click();

        waitClose();

    }
}
