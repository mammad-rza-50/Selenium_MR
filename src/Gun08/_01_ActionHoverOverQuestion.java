package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverQuestion extends BaseDriver {

//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

    @Test

    public void Test() {

        driver.get("https://www.etsy.com/");

//        List<WebElement> cookiesAccept = driver.findElements(By.cssSelector(""));
//        if (cookiesAccept.size() > 0) // varsa
//            cookiesAccept.get(0).click(); // bagla

        WebElement jewelry = driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement neckless = driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bib_neckless = driver.findElement(By.id("catnav-l3-10881"));

        Actions actions = new Actions(driver);
        actions.moveToElement(jewelry).build().perform();
        MyFunc.Wait(2);
        actions.moveToElement(neckless).build().perform();
        MyFunc.Wait(2);
        actions.moveToElement(bib_neckless).click().build().perform();
        MyFunc.Wait(2);

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue("bib-necklaces is not", driver.getCurrentUrl().
                contains("bib-necklaces"));

        waitClose();
    }
}
