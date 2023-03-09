package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.Base64;
import java.util.List;

public class _01_ScreenRecording extends BaseDriver {

    @Test
    public void Test() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("memmed");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("246");

        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // Xetali ise

        List<WebElement> errorMessage = driver.findElements(By.cssSelector("div[role='alert']"));

        if (errorMessage.size() > 0) { // error varsa
            //ekran yaz
            System.out.println("error is have");

            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;//ekran goruntusu alma deyiskeni tanimlamaq
            File yaddasdakiVeziyyet = takesScreenshot.getScreenshotAs(OutputType.FILE);//ekran goruntusunu file aldi ve yaddasda
            FileUtils.copyFile(yaddasdakiVeziyyet,new File("ScreenRecorder\\screenshot.png"));//yaddasdaki file dosya kimi qeyd etmek
            //1 ekran goruntusu
            MyFunc.Wait(2);
        }


        waitClose();
    }
}
