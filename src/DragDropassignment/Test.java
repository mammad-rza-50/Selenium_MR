package DragDropassignment;

import Utlity.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Test extends BaseDriver {

    @org.junit.Test
    public void Test(){

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Actions actions = new Actions(driver);



    }
}
