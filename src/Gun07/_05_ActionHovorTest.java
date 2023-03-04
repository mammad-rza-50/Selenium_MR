package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionHovorTest extends BaseDriver {

    @Test

    public void Test() {

        driver.get("https://www.hepsiburada.com/");

        WebElement element = driver.findElement(By.xpath("//span[text()='Moda']"));
        MyFunc.Wait(2);

        Actions actions = new Actions(driver);
        Action action = actions.moveToElement(element).build();
        action.perform();

        waitClose();
    }
}
