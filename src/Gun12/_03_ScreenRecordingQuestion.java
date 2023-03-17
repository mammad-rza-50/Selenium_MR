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
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class _03_ScreenRecordingQuestion extends BaseDriver {
    // TODO : burada her hata da aynı dosyayı yeniliyor ve üzerine yazıyor.
    //        biz istiyoruzki her dosya ayrı olsun yani her kayıt ayrı olsun
    //        bunu nasıl yaparsınız
    //        LocalDateTime alıcaksın bilgileri
    //        YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png
    @Test
    public void Test() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("memmed");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("246");
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        List<WebElement> errorMessage = driver.findElements(By.cssSelector("div[role='alert']"));

        if (errorMessage.size() > 0) {
            System.out.println("error is have");
            TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
            File memoryInSituation = takesScreenshot.getScreenshotAs(OutputType.FILE);
            String time = new SimpleDateFormat("yy-MM-dd HH-mm-ss").format(new Date());
            FileUtils.copyFile(memoryInSituation, new File("ScreenRecorder\\" + time + "-->screenshot.png"));
            MyFunc.Wait(2);
        }

        waitClose();
    }

}
