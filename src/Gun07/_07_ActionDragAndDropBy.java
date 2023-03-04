package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _07_ActionDragAndDropBy extends BaseDriver {

    @Test

    public void Test() {

        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        Actions actions = new Actions(driver);

        WebElement sliderLeft = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        MyFunc.Wait(2);

        Action action = actions.dragAndDropBy(sliderLeft, 100, 0).build();
        action.perform();

        waitClose();

    }
}
