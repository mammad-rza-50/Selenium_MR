package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _06_ActionDragAndDopTest extends BaseDriver {

    @Test

    public void Test() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions actions = new Actions(driver);

        WebElement oslo = driver.findElement(By.id("box1"));
        MyFunc.Wait(2);

        WebElement norway = driver.findElement(By.id("box101"));
        MyFunc.Wait(2);

        // 1 way
        // actions.dragAndDrop(oslo,norway).build().perform();//osloyo norwaya at

        // 2 way
        actions.clickAndHold(oslo).build().perform();// osloyu al
        actions.moveToElement(norway).release().build().perform(); // norwayin uzerine at

        waitClose();
    }
}
