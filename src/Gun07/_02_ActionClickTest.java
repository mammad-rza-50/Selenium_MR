package Gun07;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionClickTest extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions actions = new Actions(driver);// web sayfası aksiyonlara açıldı.

        Action action = actions.moveToElement(element).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu hazırla.
        System.out.println("Aksion hazirlandi");

        MyFunc.Wait(2);
        action.perform();  // aksiyonu gerçekleştir. , işleme al, uygula, icra et
        System.out.println("Aksion heyata kecdi");

        waitClose();
    }
}
