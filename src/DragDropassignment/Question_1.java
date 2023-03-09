package DragDropassignment;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Base64;
import java.util.List;

public class Question_1 extends BaseDriver {

    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");

        Actions actions = new Actions(driver);
        List<WebElement> cities = driver.findElements(By.cssSelector("#answerDiv > .dragDropSmallBox"));

        for (WebElement city : cities) {
            String num = city.getAttribute("id");
            num = num.substring(1);

            String cssSelector = "#questionDiv > .dragDropSmallBox[id='q" + num + "']";
            WebElement targetBox = driver.findElement(By.cssSelector(cssSelector));

            actions.clickAndHold(city).perform();
            MyFunc.Wait(1);
            actions.moveToElement(targetBox).release().perform();
        }

       waitClose();
    }

}
