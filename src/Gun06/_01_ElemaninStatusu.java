package Gun06;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemaninStatusu extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement tuesday = driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println("tuesday.isDisplayed() = " + tuesday.isDisplayed());
        System.out.println("tuesday.isEnabled() = " + tuesday.isEnabled());
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());
        tuesday.click();
        MyFunc.Wait(2);
        System.out.println("tuesday.isSelected() = " + tuesday.isSelected());

        WebElement friday = driver.findElement(By.id("gwt-debug-cwCheckBox-Friday-input"));
        System.out.println("friday.isDisplayed() = " + friday.isDisplayed());
        System.out.println("friday.isEnabled() = " + friday.isEnabled());
        System.out.println("friday.isSelected() = " + friday.isSelected());
        friday.click();
        MyFunc.Wait(2);
        System.out.println("friday.isSelected() = " + friday.isSelected());
        


        WaitClose();

    }
}
