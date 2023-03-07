package Learning_Testing;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test1 extends BaseDriver {

    @Test
    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions actions = new Actions(driver);

        List <WebElement> countries = driver.findElements(By.cssSelector("div[id='questionDiv']"));

        List <WebElement> cities = driver.findElements(By.cssSelector("div[0d='answerDiv']"));

        for (WebElement country : countries){

            for (WebElement city :cities){


            }


        }
        waitClose();
    }
}
