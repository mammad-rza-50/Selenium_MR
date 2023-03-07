package Gun11;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    ("window.scrollTo(0, 3000);")    -> Verilen pixel e kadar gider.
    ("window.scrollBy(0, 3000);")    -> bulunduğu yerden , Verilen kadar daha ileri gider.
    ("window.scrollTo(0, document.body.scrollHeight);")   -> sayfanın sonuna kadar gider.
    ("arguments[0].scrollIntoView(true);", element)       -> Verilen elemente kadar gider.
                                                   true : element sayfanın üstünde gözükene kadar,
                                                   false: element sayfanın altına gözükene kadar
                                                   default true;

   element.click() -> normal click
   action click()  -> action click
   ("arguments[0].click();", element)    -> javascript click()  -> javascript click.
 */

public class _01_ScrollIntro extends BaseDriver {

    @Test
    public void Test() {

        driver.get("https://p-del.co/");
        MyFunc.Wait(2);

        // Actions actions = new Actions(driver); // driver uzerinden aksiyon icicn
        // Select webSelect =new Select(element); // bir eded element ucucn

        // JavaScript kodlari calisdirmaq ucun is deyiskeni edildi
        JavascriptExecutor js = (JavascriptExecutor) driver;// cast edilir

        js.executeScript("window.scrollBy(0,1200)");
        // (0,1200) -> (x,y) Sayfayı sağa x kadar ve aşağı y kaydırır
        // 1200 pixel kadar aşağı kaydıracak.
        MyFunc.Wait(2);

        js.executeScript("window.scrollBy(0,-700)");// 700 pixel yuxari surusdurur
        MyFunc.Wait(2);

    }
}
