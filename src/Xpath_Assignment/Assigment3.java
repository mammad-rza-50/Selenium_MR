package Xpath_Assignment;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Assigment3 extends BaseDriver {

//    1) Bu siteye gidin. -> https://www.snapdeal.com/
//    2) "teddy bear" aratın ve Search butonuna tıklayın.
//    3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
//    Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.


    @Test
    public void Test3() {

        driver.get("https://www.snapdeal.com/");
        WebElement searchText = driver.findElement(By.xpath("//input[@id='inputValEnter']"));
        searchText.sendKeys("teddy bear");
        WebElement serchBtn = driver.findElement(By.xpath("//span[@class='searchTextSpan']"));
        serchBtn.click();
        WebElement msg = driver.findElement(By.xpath("//span[@class='nnn']"));
        Assert.assertTrue("Gozlenen mesaj cixmadi", msg.getText().contains("We've got 317 results for teddy bear"));
        System.out.println(msg.getText());

        WaitClose();
    }


}
