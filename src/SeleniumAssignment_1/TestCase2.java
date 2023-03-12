package SeleniumAssignment_1;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestCase2 extends BaseDriver {

//    1- https://www.youtube.com/ adresine gidiniz
//    2- "Selenium" kelimesi ile video aratınız.
//    3- Listelenen sonuçlarda 80 videoaya kadar lsiteyi uzatınız.
//    4- Son videonun title ını yazdırınız.

    @Test
    public void Test() {

        driver.get("https://www.youtube.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
        search.sendKeys("Selenium");

        WebElement searchBtn = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
        searchBtn.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        String element = "//ytd-video-renderer";

        List<WebElement> videos = driver.findElements(By.xpath(element));

        while (videos.size() < 81) {

            js.executeScript("window.scrollBy(0, 700);");

            videos = driver.findElements(By.xpath(element));
        }

        System.out.println(videos.size());

        MyFunc.Wait(4);
        waitClose();

    }

}

