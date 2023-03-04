package DragDropassignment;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

import static Utlity.MyFunc.Wait;

public class Question1 extends BaseDriver {

//    http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html
//    buradaki ülke ve şehirleri findElements ile topluca bularak bir
//    döngü ile bütün şehirleri doğru ülkere dağıtınız.

    @Test

    public void Test() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Actions actions = new Actions(driver);


        WebElement norway = driver.findElement(By.id("q1"));
        WebElement oslo = driver.findElement(By.id("a1"));
        actions.clickAndHold(oslo).build().perform();
        Wait(1);
        actions.moveToElement(norway).release().build().perform();
        Wait(1);


        WebElement sweden = driver.findElement(By.id("q2"));
        WebElement stockholm = driver.findElement(By.id("a2"));
        actions.clickAndHold(stockholm).build().perform();
        Wait(1);
        actions.moveToElement(sweden).release().build().perform();
        Wait(1);

        WebElement denmark = driver.findElement(By.id("q3"));
        WebElement copenhagen = driver.findElement(By.id("a3"));
        actions.clickAndHold(copenhagen).build().perform();
        Wait(1);
        actions.moveToElement(denmark).release().build().perform();
        Wait(1);

        WebElement unitedStates = driver.findElement(By.id("q4"));
        WebElement washington = driver.findElement(By.id("a4"));
        actions.clickAndHold(washington).build().perform();
        Wait(1);
        actions.moveToElement(unitedStates).release().build().perform();
        Wait(1);

        WebElement france = driver.findElement(By.id("q5"));
        WebElement paris = driver.findElement(By.id("a5"));
        actions.clickAndHold(paris).build().perform();
        Wait(1);
        actions.moveToElement(france).release().build().perform();
        Wait(1);

        WebElement spain = driver.findElement(By.id("q6"));
        WebElement madrid = driver.findElement(By.id("a6"));
        actions.clickAndHold(madrid).build().perform();
        Wait(1);
        actions.moveToElement(spain).release().build().perform();
        Wait(1);

        WebElement greece = driver.findElement(By.id("q7"));
        WebElement athens = driver.findElement(By.id("a7"));
        actions.clickAndHold(athens).build().perform();
        Wait(1);
        actions.moveToElement(greece).release().build().perform();
        Wait(1);

        WebElement unitedKingdom = driver.findElement(By.id("q8"));
        WebElement london = driver.findElement(By.id("a8"));
        actions.clickAndHold(london).build().perform();
        Wait(1);
        actions.moveToElement(unitedKingdom).release().build().perform();
        Wait(1);

        WebElement austria = driver.findElement(By.id("q9"));
        WebElement vienna = driver.findElement(By.id("a9"));
        actions.clickAndHold(vienna).build().perform();
        Wait(1);
        actions.moveToElement(austria).release().build().perform();
        Wait(1);

        WebElement italy = driver.findElement(By.id("q10"));
        WebElement rome = driver.findElement(By.id("a10"));
        actions.clickAndHold(rome).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(italy).release().build().perform();
        Wait(1);

        WebElement chile = driver.findElement(By.id("q11"));
        WebElement santiago = driver.findElement(By.id("a11"));
        actions.clickAndHold(santiago).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(chile).release().build().perform();
        Wait(1);

        WebElement india = driver.findElement(By.id("q12"));
        WebElement newDehli = driver.findElement(By.id("a12"));
        actions.clickAndHold(newDehli).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(india).release().build().perform();
        Wait(1);

        WebElement kenya = driver.findElement(By.id("q13"));
        WebElement nairobi = driver.findElement(By.id("a13"));
        actions.clickAndHold(nairobi).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(kenya).release().build().perform();
        Wait(1);

        WebElement malaysia = driver.findElement(By.id("q14"));
        WebElement kualaLumpur = driver.findElement(By.id("a14"));
        actions.clickAndHold(kualaLumpur).build().perform();
        MyFunc.Wait(1);
        actions.moveToElement(malaysia).release().build().perform();
        Wait(2);

        WebElement vietnam = driver.findElement(By.id("q15"));
        WebElement hanoi = driver.findElement(By.id("a15"));
        actions.clickAndHold(hanoi).build().perform();
        Wait(1);
        actions.moveToElement(vietnam).release().build().perform();
        Wait(2);


        waitClose();

    }
}
