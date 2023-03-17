package Gun12;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _02_WindowSize extends BaseDriver {

    @Test
    public void Test(){

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize();
        MyFunc.Wait(4);
         //  olcu demekdir
        Dimension newSize = new Dimension(700,1200);
        driver.manage().window().setSize(newSize);

        waitClose();

    }
}
