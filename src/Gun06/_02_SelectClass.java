package Gun06;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClass extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.amazon.com/");

        WebElement weMenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(weMenu);
        ddMenu.selectByIndex(2); //ister bunu sec
        //  ddMenu.selectByValue("value deyeri"); // ister bunu
        //  ddMenu.selectByVisibleText("gorunen texti"); // ister bunu


        System.out.println("ddMenu.getOptions.size = " + ddMenu.getOptions().size());


        waitClose();

    }

}
