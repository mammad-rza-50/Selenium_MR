package Css_Assignments;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assignment3 extends BaseDriver {

//    1) Bu siteye gidin. -> https://www.snapdeal.com/
//    2) "teddy bear" aratın ve Search butonuna tıklayın.
//    3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.


    @Test
    public void Test3() {

        driver.get("https://www.snapdeal.com/");
        WebElement searchText = driver.findElement(By.cssSelector("input[id='inputValEnter']"));
        searchText.sendKeys("teddy bear");
        WebElement serchBtn = driver.findElement(By.cssSelector("span[class='searchTextSpan']"));
        serchBtn.click();
        WebElement msg = driver.findElement(By.cssSelector("div[id='searchMessageContainer'] span"));
        Assert.assertTrue("Gozlenen mesaj cixmadi", msg.isDisplayed());
        System.out.println(msg.getText());

        WaitClose();
    }
}
