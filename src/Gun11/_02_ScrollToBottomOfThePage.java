package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class _02_ScrollToBottomOfThePage extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://p-del.co/");
        MyFunc.Wait(2);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        MyFunc.Wait(2);

        js.executeScript("window.scrollTo(0,0)"); // en basa direk gerir 0 noktasina git
        //js.executeScript("window.scrollBy(0,0)"); // oldugu yerden 0 qeder get


        waitClose();
    }
}
