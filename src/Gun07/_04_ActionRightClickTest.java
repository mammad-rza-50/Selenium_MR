package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionRightClickTest extends BaseDriver {

    @Test

    public void Test() {

        //contextClick --> rightClick demek
        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("rightClickBtn"));
        MyFunc.Wait(2);

        Actions actions = new Actions(driver);

        Action action = actions.moveToElement(element)
                .contextClick().build();
        action.perform();
        // actions.moveToElement(element).contextClick().click().build().perform();
        // belede olur

        waitClose();
    }
}
