package DragDropassignment;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Question2 extends BaseDriver {

//    http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
//    buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.

    @Test

    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Actions actions = new Actions(driver);
        WebElement teamA = driver.findElement(By.id("box1"));
        WebElement teamB = driver.findElement(By.id("box2"));
        WebElement teamC = driver.findElement(By.id("box3"));
        WebElement teamD = driver.findElement(By.id("box4"));
        WebElement teamE = driver.findElement(By.id("box5"));

        WebElement studentA = driver.findElement(By.id("node1"));
        actions.clickAndHold(studentA).build().perform();
        MyFunc.Wait(1);
        Action actionA = actions.moveToElement(teamA).release().build();
        actionA.perform();
        MyFunc.Wait(1);

        WebElement studentB = driver.findElement(By.id("node2"));
        actions.clickAndHold(studentB).build().perform();
        MyFunc.Wait(1);
        actionA.perform();
        MyFunc.Wait(1);

        WebElement studentC = driver.findElement(By.id("node3"));
        actions.clickAndHold(studentC).build().perform();
        MyFunc.Wait(1);
        actionA.perform();
        MyFunc.Wait(1);

        WebElement studentD = driver.findElement(By.id("node4"));
        actions.clickAndHold(studentD).build().perform();
        MyFunc.Wait(1);
        actionA.perform();
        MyFunc.Wait(1);

        WebElement studentE = driver.findElement(By.id("node5"));
        actions.clickAndHold(studentE).build().perform();
        MyFunc.Wait(1);
       Action actionB = actions.moveToElement(teamB).release().build();
       actionB.perform();
        MyFunc.Wait(1);

        WebElement studentF = driver.findElement(By.id("node6"));
        actions.clickAndHold(studentF).build().perform();
        MyFunc.Wait(1);
        actionB.perform();
        MyFunc.Wait(1);

        WebElement studentG = driver.findElement(By.id("node7"));
        actions.clickAndHold(studentG).build().perform();
        MyFunc.Wait(1);
        actionB.perform();
        MyFunc.Wait(1);

        WebElement studentH = driver.findElement(By.id("node8"));
        actions.clickAndHold(studentH).build().perform();
        MyFunc.Wait(1);
       actionB.perform();
        MyFunc.Wait(1);

        WebElement studentI = driver.findElement(By.id("node9"));
        actions.clickAndHold(studentI).build().perform();
        MyFunc.Wait(1);
        Action actionC = actions.moveToElement(teamC).release().build();
        actionC.perform();
        MyFunc.Wait(1);

        WebElement studentJ = driver.findElement(By.id("node10"));
        actions.clickAndHold(studentJ).build().perform();
        MyFunc.Wait(1);
        actionC.perform();
        MyFunc.Wait(1);

        WebElement studentK = driver.findElement(By.id("node11"));
        actions.clickAndHold(studentK).build().perform();
        MyFunc.Wait(1);
       actionC.perform();
        MyFunc.Wait(1);

        WebElement studentL = driver.findElement(By.id("node12"));
        actions.clickAndHold(studentL).build().perform();
        MyFunc.Wait(1);
        actionC.perform();
        MyFunc.Wait(1);

        WebElement studentM = driver.findElement(By.id("node13"));
        actions.clickAndHold(studentM).build().perform();
        MyFunc.Wait(1);
        Action actionD = actions.moveToElement(teamD).release().build();
        actionD.perform();
        MyFunc.Wait(1);

        WebElement studentN = driver.findElement(By.id("node14"));
        actions.clickAndHold(studentN).build().perform();
        MyFunc.Wait(1);
        actionD.perform();
        MyFunc.Wait(1);

        WebElement studentO = driver.findElement(By.id("node15"));
        actions.clickAndHold(studentO).build().perform();
        MyFunc.Wait(1);
       actionD.perform();
        MyFunc.Wait(1);

        WebElement studentP = driver.findElement(By.id("node16"));
        actions.clickAndHold(studentP).build().perform();
        MyFunc.Wait(1);
        Action actionE = actions.moveToElement(teamE).release().build();
        actionE.perform();
        MyFunc.Wait(1);

        WebElement studentQ = driver.findElement(By.id("node17"));
        actions.clickAndHold(studentQ).build().perform();
        MyFunc.Wait(1);
        actionE.perform();
        MyFunc.Wait(1);

        WebElement studentR = driver.findElement(By.id("node18"));
        actions.clickAndHold(studentR).build().perform();
        MyFunc.Wait(1);
        actionE.perform();
        MyFunc.Wait(1);

        WebElement studentS = driver.findElement(By.id("node19"));
        actions.clickAndHold(studentS).build().perform();
        MyFunc.Wait(1);
        actionE.perform();
        MyFunc.Wait(1);

        WebElement studentT = driver.findElement(By.id("node20"));
        actions.clickAndHold(studentT).build().perform();
        MyFunc.Wait(1);
        actionE.perform();
        MyFunc.Wait(1);

        WebElement studentU = driver.findElement(By.id("node21"));
        actions.clickAndHold(studentU).build().perform();
        MyFunc.Wait(1);
        actionE.perform();
        MyFunc.Wait(1);

        waitClose();
    }
}
