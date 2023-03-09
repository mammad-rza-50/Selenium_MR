package DragDropassignment;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Question_3 extends BaseDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Actions actions = new Actions(driver);

        List<WebElement> cities = driver.findElements(By.cssSelector("#allItems > *"));
        List<WebElement> countries = driver.findElements(By.cssSelector("#dhtmlgoodies_mainContainer > div"));

        for (WebElement city : cities) {
            actions.moveToElement(city, -30, 0).perform();
            actions.clickAndHold().perform();
            MyFunc.Wait(1);
            for (WebElement country : countries) {
                actions.moveToElement(country).perform();

                if (!country.getAttribute("class").equals("mouseover"))
                    continue;

                actions.release().perform();
                MyFunc.Wait(1);
                if (!city.getAttribute("class").equals("correctAnswer")) {
                    actions.moveToElement(city, -30, 0).perform();
                    actions.clickAndHold().perform();
                    MyFunc.Wait(1);
                    continue;
                }
                break;
            }
        }

        waitClose();
    }

}
