package Seleniumassignment_2;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Wikipedia extends BaseDriver {

    @Test
    public void Test1() {

//        Bu web sitesine gidiniz. https://en.wikipedia.org/wiki/FIFA_World_Cup
//        Contents'in içindeki Attendance tablosunun içindeki
//        Bütün Host'ları yazdırınız.
//        Find elements kullanınız.

        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[text()='Attendance']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//table)[4]//span/following-sibling::a")));

        List<WebElement> hosts = driver.findElements(By
                .xpath("(//table)[4]//span/following-sibling::a"));

        for (WebElement host : hosts) {

            System.out.println("Host= " + host.getText());
        }

        MyFunc.Wait(2);
    }

    @Test
    public void Test2() {

//        Bu websitesine gidiniz.    https://en.wikipedia.org/wiki/FIFA_World_Cup
//        Contents'in içindeki   "World Football – All time table"    'a tıklayınız.
//        Argentina'nın participation(katılım) sayısını yazdırınız.
//        Not: Bu tablo zamanla değişebilir. Mutlak konumu yazdırmayın.
//                Argentina'nın participation'ını yazdırınız.

        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                        .xpath("//a[@href='http://www.worldfootball.net/alltime_table/wm/']")))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(("//tr)[4]//td[7]"))));
        WebElement participation = driver.findElement(By.xpath("(//tr)[4]//td[7]"));

        System.out.println("Argentinanin katilim sayisi= " + participation.getText());

        MyFunc.Wait(2);
        waitClose();
    }
}
