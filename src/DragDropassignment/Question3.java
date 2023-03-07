package DragDropassignment;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Question3 extends BaseDriver {

//    http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
//    buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.

    @Test

    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");
        Actions actions = new Actions(driver);

        WebElement italy = driver.findElement(By.id("box1"));
        WebElement norway = driver.findElement(By.id("box2"));
        WebElement unitedKingdom = driver.findElement(By.id("box3"));
        WebElement unitedStates = driver.findElement(By.id("box4"));
        WebElement china = driver.findElement(By.id("box5"));
        WebElement australia = driver.findElement(By.id("box6"));
        WebElement france = driver.findElement(By.id("box7"));

        WebElement galileoGalilei = driver.findElement(By.id("node20"));
        actions.clickAndHold(galileoGalilei).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(italy).release().build().perform();
        MyFunc.Wait(1);
        WebElement rome = driver.findElement(By.id("node18"));
        actions.clickAndHold(rome).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(italy).release().build().perform();
        MyFunc.Wait(1);
        WebElement vaticanCity = driver.findElement(By.id("node19"));
        actions.clickAndHold(vaticanCity).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(italy).release().build().perform();
        MyFunc.Wait(1);

        WebElement geirangerFjord = driver.findElement(By.id("node7"));
        actions.clickAndHold(geirangerFjord).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(norway).release().build().perform();
        MyFunc.Wait(1);
        WebElement oslo = driver.findElement(By.id("node1"));
        actions.clickAndHold(oslo).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(norway).release().build().perform();
        MyFunc.Wait(1);
        WebElement fridtjofNansen = driver.findElement(By.id("node12"));
        actions.clickAndHold(fridtjofNansen).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(norway).release().build().perform();
        MyFunc.Wait(1);

        WebElement winstonChurchill = driver.findElement(By.id("node14"));
        actions.clickAndHold(winstonChurchill).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(unitedKingdom).release().build().perform();
        MyFunc.Wait(1);
        WebElement bigBen = driver.findElement(By.id("node9"));
        actions.clickAndHold(bigBen).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(unitedKingdom).release().build().perform();
        MyFunc.Wait(1);
        WebElement london = driver.findElement(By.id("node3"));
        actions.clickAndHold(london).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(unitedKingdom).release().build().perform();
        MyFunc.Wait(1);

        WebElement washington = driver.findElement(By.id("node5"));
        actions.clickAndHold(washington).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(unitedStates).release().build().perform();
        MyFunc.Wait(1);
        WebElement mississippi = driver.findElement(By.id("node21"));
        actions.clickAndHold(mississippi).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(unitedStates).release().build().perform();
        MyFunc.Wait(1);
        WebElement johnFKennedy = driver.findElement(By.id("node16"));
        actions.clickAndHold(johnFKennedy).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(unitedStates).release().build().perform();
        MyFunc.Wait(1);

        WebElement beijing = driver.findElement(By.id("node4"));
        actions.clickAndHold(beijing).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(china).release().build().perform();
        MyFunc.Wait(1);
        WebElement theForbiddenCity = driver.findElement(By.id("node10"));
        actions.clickAndHold(theForbiddenCity).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(china).release().build().perform();
        MyFunc.Wait(1);
        WebElement mao = driver.findElement(By.id("node15"));
        actions.clickAndHold(mao).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(china).release().build().perform();
        MyFunc.Wait(1);

        WebElement canberra = driver.findElement(By.id("node6"));
        actions.clickAndHold(canberra).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(australia).release().build().perform();
        MyFunc.Wait(1);
        WebElement queensland = driver.findElement(By.id("node11"));
        actions.clickAndHold(queensland).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(australia).release().build().perform();
        MyFunc.Wait(1);
        WebElement nedKelly = driver.findElement(By.id("node17"));
        actions.clickAndHold(nedKelly).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(australia).release().build().perform();
        MyFunc.Wait(1);

        WebElement paris = driver.findElement(By.id("node2"));
        actions.clickAndHold(paris).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(france).release().build().perform();
        MyFunc.Wait(1);
        WebElement napoleonBonaparte = driver.findElement(By.id("node13"));
        actions.clickAndHold(napoleonBonaparte).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(france).release().build().perform();
        MyFunc.Wait(1);
        WebElement notreDame = driver.findElement(By.id("node8"));
        actions.clickAndHold(notreDame).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(france).release().build().perform();
        MyFunc.Wait(1);

        waitClose();


    }
}
