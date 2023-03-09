package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class _01_ImplicitlyWait extends BaseDriver {

    @Test
    public void Wait() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");


        WebElement btn = driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration duration = Duration.ofSeconds(25);
        driver.manage().timeouts().implicitlyWait(duration);
        WebElement msj = driver.findElement(By.id("demo"));


       waitClose();

    }
}
