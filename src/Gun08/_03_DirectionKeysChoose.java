package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_DirectionKeysChoose extends BaseDriver {

    @Test

    public void Test() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions actions = new Actions(driver);
        Action action = actions.
                moveToElement(element)
                .click()
                .sendKeys("m")
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build();
        MyFunc.Wait(2);
        action.perform();

        waitClose();

    }
}
