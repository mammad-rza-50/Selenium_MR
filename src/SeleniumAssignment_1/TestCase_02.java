package SeleniumAssignment_1;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestCase_02 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("https://youtube.com");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement search = driver.findElement(By.cssSelector("input#search"));
        search.sendKeys("Selenium");

        WebElement searchIcon = driver.findElement(By.cssSelector("#search-icon-legacy"));
        searchIcon.click();

        wait.until(ExpectedConditions.titleIs("Selenium - YouTube"));

        List<WebElement> videoCount = driver.findElements(By.cssSelector("ytd-video-renderer>#dismissible"));

        while (videoCount.size() < 80) {
            jse.executeScript("window.scrollBy(0, document.documentElement.scrollHeight)");
            wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.cssSelector("ytd-video-renderer>#dismissible"), videoCount.size()));
            videoCount = driver.findElements(By.cssSelector("ytd-video-renderer>#dismissible"));
        }

        jse.executeScript("arguments[0].scrollIntoView(true)", videoCount.get(79));
        System.out.println(videoCount.get(79).findElement(By.id("video-title")).getText());

        {
            waitClose();
        }
    }
}