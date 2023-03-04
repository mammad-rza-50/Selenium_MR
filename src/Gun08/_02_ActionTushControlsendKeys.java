package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTushControlsendKeys extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element) // kutuya gel
                .click()                               // tikla
                .keyDown(Keys.SHIFT)                   // Shifte bas
                .sendKeys("m")                         // Shift+m -> M
                .keyUp(Keys.SHIFT)                     // shirti burax
                .sendKeys("emmed")                     // emmed yazi
                .build();                             // aksiyon hazirlandi

        MyFunc.Wait(2);
        action.perform();   // icra edildi

        waitClose();
    }
}
