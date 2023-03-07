package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test() throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");
        MyFunc.Wait(2);

        // Accept All
//        driver.switchTo().frame("gdpr-consent-notice");  // Accept all cixarsa bulari aktiv etmek lazimdir
//
//        List<WebElement> acceptAll = driver.findElements(By.xpath("//span[text()='Accept All']"));
//        if (acceptAll.size()>0)
//            acceptAll.get(0).click();
        /**************************************/

        Robot robot = new Robot();

        for (int i = 0; i < 21; i++) {

            MyFunc.Wait(1);
            robot.keyPress(KeyEvent.VK_TAB); // tusa basildi
            robot.keyRelease(KeyEvent.VK_TAB); // tus buraxildi

        }
        robot.keyPress(KeyEvent.VK_ENTER); // tusa basildi
        robot.keyRelease(KeyEvent.VK_ENTER);// tus buraxildi
        // bura qeder windowsa girdi

        //asagidaki hissede dosyaya girmek ucun
        StringSelection filePath = new StringSelection("C:\\Users\\black\\Documents\\RobotClass.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);

        MyFunc.Wait(1);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        for (int i = 0; i < 2; i++) {

            MyFunc.Wait(1);
            robot.keyPress(KeyEvent.VK_TAB); // tusa basildi
            robot.keyRelease(KeyEvent.VK_TAB); // tus buraxildi
        }

        robot.keyPress(KeyEvent.VK_SPACE); // çeklendi
        robot.keyRelease(KeyEvent.VK_SPACE);
        for (int i = 0; i < 2; i++) {

            MyFunc.Wait(1);
            robot.keyPress(KeyEvent.VK_TAB); // tusa basildi
            robot.keyRelease(KeyEvent.VK_TAB); // tus buraxildi

        }
        MyFunc.Wait(1);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement mesaj = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(mesaj.isDisplayed());


        waitClose();
    }
}
