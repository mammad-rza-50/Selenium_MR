package Seleniumassignment_2;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DemoSelenumEasy extends BaseDriver {

    @Test
    public void Test1() {

//        Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
//        Normal success message'a tıklayınız.
//        Açılan yeşil penceredeki x buttonuna tıklayınız.

        driver.get(" http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement normalSuccess = driver.findElement(By.id("normal-btn-success"));
        normalSuccess.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//button[@class='close'])[1]"))).click();

        MyFunc.Wait(4);

    }

    @Test
    public void Test2() {

//        Bu web sitesine gidiniz. http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html
//        Normal success message'a tıklayınız.
//        Açılan penceredeki x buttonuna tıklayınız.
//        Mesaj görünmemelidir.

        driver.get(" http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement normalSuccess = driver.findElement(By.id("normal-btn-success"));
        normalSuccess.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//button[@class='close'])[1]"))).click();

        MyFunc.Wait(4);
    }

    @Test
    public void Test3() {

//        Bu web sitesine gidiniz. http://demo.seleniumeasy.com/basic-checkbox-demo.html
//        check all button'a tıklayınız.
//        Uncheck All button'da " Uncheck All" yazısını yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");

        WebElement check1 = driver.findElement(By.id("check1"));
        check1.click();

        WebElement uncheckAll = driver.findElement(By.xpath("//input[@id='check1']"));
        System.out.println(uncheckAll.getAttribute("value"));


    }

    @Test
    public void Test4() {

//        Bu web sitesine gidiniz.   http://demo.seleniumeasy.com/basic-select-dropdown-demo.html
//        Select a day dropdown'ından rastgele bir seçenek seçiniz.
//        5 kere wednesday seçtikten sonra döngüyü durdurun.
//        Kaç kere Wednesday seçtiğinizi yazdırınız.
//        Sonuç 5 olmalıdır.

        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        WebElement selectDay = driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select select = new Select(selectDay);

        int count = 0;
        for (int i = 0; i < 5; i++) {

            select.selectByValue("Friday");
            count++;
        }
        System.out.println(count);

        MyFunc.Wait(4);
    }

    @Test
    public void Test5() {

//        Bu siteye gidiniz.  http://demo.seleniumeasy.com/basic-first-form-demo.html
//        Input forms'a tıklayınız.
//        Ajax from Submit'e tıklayınız.
//        Name giriniz.
//        Comment giriniz.
//        Submit'e tıklayınız.
//        Form submited Successfully! yazısı görüntülenmelidir.
//        Yazıyı yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement inputForms = driver.findElement(By
                .xpath("//a[text()='Input Forms']"));
        inputForms.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//a[text()='Ajax Form Submit'])[2]"))).click();

        WebElement name = driver.findElement(By.xpath("//input[@id='title']"));
        name.sendKeys("Memmed");

        WebElement comment = driver.findElement(By
                .xpath("//textarea[@id='description']"));
        comment.sendKeys("I study Test Tools");

        WebElement submit = driver.findElement(By.xpath("//input[@id='btn-submit']"));
        submit.click();

        WebElement message = driver.findElement(By
                .xpath("//div[text()='Form submited Successfully!']"));

        System.out.println(message.getText());

        MyFunc.Wait(4);


    }

    @Test
    public void Test6() {

//        Bu websitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html]
//        List box'a tıklayınız.
//                [Bootstrap List Box'a tıklayınız.](http://demo.seleniumeasy.com/bootstrap-dual-list-box-demo.html)
//                **bootstrap-duallist**'e tıklayınız. Sonra sağ ok (>)'a tıklayınız.
//**Dapibus ac facilisis in'**e tıklayınız ve sağ ok (>)'a tıklayınız.
//        Sağa gönderilen elemanların üstüne bir kere daha tıklayıp beyaz hale getiriniz.
//                **Cras husto odio**'a tıklayınız ve sol ok(<)'a tıklayınız.
//**Morbi leo risus**'a tıklayınız ve sol ok(<)'a tıklayınız.

//        Sol kutu bu şekilde olmalıdır.
//                - Morbi leo risus
//        - Porta ac consectetur ac
//                - Vestibulum at eros
//        - Cras justo odio
//        Morbi leo risus
//
//        Sağ kutu bu şekilde olmalıdır.
//              - Dapibus ac facilisis in
//        - Porta ac consectetur ac
//                - Vestibulum at eros
//        - bootstrap-duallist
//                - Dapibus ac facilisis in

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement listBoxs = driver.findElement(By.xpath("//a[text()='List Box']"));
        listBoxs.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//a[text()='Bootstrap List Box'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//li[text()='bootstrap-duallist ']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[@class='glyphicon glyphicon-chevron-right']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//li[text()='Dapibus ac facilisis in'])[1]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//span[@class='glyphicon glyphicon-chevron-right'])[1]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//li[text()='bootstrap-duallist ']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//li[text()='Dapibus ac facilisis in'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//li[text()='Cras justo odio']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[@class='glyphicon glyphicon-chevron-left']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//li[text()='Morbi leo risus'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[@class='glyphicon glyphicon-chevron-left']"))).click();

        MyFunc.Wait(4);
    }

    @Test
    public void Test7() {

//        Bu web sitesine gidiniz.  [http://demo.seleniumeasy.com/basic-first-form-demo.html]
//        Mesajınızı giriniz.
//        Show message'a tıklayınız.
//        Show message button'unun altında mesajınızı yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement enterMessage = driver.findElement(By.xpath("//input[@id='user-message']"));
        enterMessage.sendKeys("I study Test Tools");

        WebElement showMessage = driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessage.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[@id='display']")));
        WebElement yourMessage = driver.findElement(By.xpath("//span[@id='display']"));
        System.out.println(yourMessage.getText());

        MyFunc.Wait(4);


    }

    @Test
    public void Test8() {

//        Bu web sitesine gidiniz. [http://demo.seleniumeasy.com/basic-first-form-demo.html]
//        "Enter a" ya bir değer giriniz.
//        "Enter b" ye bir değer giriniz.
//        Get Total'a basınız.
//        Web sitesindeki sonucu yazdırınız.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement number1 = driver.findElement(By.xpath("//input[@id='sum1']"));
        number1.sendKeys("12");
        WebElement number2 = driver.findElement(By.xpath("//input[@id='sum2']"));
        number2.sendKeys("14");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[@onclick='return total()']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//span[@id='displayvalue']")));

        WebElement total = driver.findElement(By
                .xpath("//span[@id='displayvalue']"));

        String totalUrl = driver.getCurrentUrl();
        System.out.println(totalUrl + "--> total= " + total.getText());

        MyFunc.Wait(4);


    }

    @Test
    public void Test9() {

//        Bu web sitesine gidiniz.
//        (http://demo.seleniumeasy.com/basic-first-form-demo.html)
//        Input Forms'a tıklayınız.
//        Radio buttons Demo'a tıklayınız.
//        Get checked value buttonuna tıklayınız.
//        " **Radio button is Not checked** " görüntülenmelidir.
//                Male Radio buttonuna tıklayınız.
//                Get checked value buttonuna tıklayınız.
//        " **Radio button 'Male' is checked** " görüntülenmelidir.
//                Female Radio button'a tıklayınız.
//        Get Checked Value buttonuna tıklayınız.
//        " **Radio button 'Female' is checked** " görüntülenmelidir.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement inputForms = driver.findElement(By
                .xpath("//a[text()='Input Forms']"));
        inputForms.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//a[text()='Radio Buttons Demo'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[@id='buttoncheck']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[text()='Radio button is Not checked']")));
        WebElement message1 = driver.findElement(By
                .xpath("//p[text()='Radio button is Not checked']"));
        System.out.println(message1.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//input[@value='Male'])[1]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[@id='buttoncheck']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='radiobutton']")));
        WebElement message2 = driver.findElement(By
                .xpath("//p[@class='radiobutton']"));
        System.out.println(message2.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//input[@value='Female'])[1]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[@id='buttoncheck']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='radiobutton']")));
        WebElement message3 = driver.findElement(By
                .xpath("//p[@class='radiobutton']"));
        System.out.println(message3.getText());

        MyFunc.Wait(4);

    }

    @Test
    public void Test10() {

//        Bu web sitesine gidiniz.
//        (http://demo.seleniumeasy.com/basic-first-form-demo.html)
//        Input forms'a tıklayınız.
//        Radio buttons Demo'ya tıklayınız.
//        Group Radio Buttons Demo tablosunda;
//        male'a tıklayınız.
//        0 to 5'e tıklayınız.
//        Sonucu yazdırınız.
//        Sonuç **Sex : Male   Age group: 0 - 5** olmalıdır**.**
//        5 to 15' tıklayınız.
//        Sonucu yazdırınız.
//        Sonuç **Sex : Male   Age group: 5 - 15** olmalıdır.
//        15 to 50'ye tıklayınız.
//        Sonucu yazdırınız.
//        Sonuç **Sex : Male   Age group: 15 - 50** olmalıdır.
//                female'a tıklayınız.
//        0 to 5'e tıklayınız.
//        Sonucu yazdırınız.
//        Sonuç **Sex : female Age group: 0 - 5** olmalıdır.
//        5 to 15'e tıklayınız.
//        Sonucu yazdırınız.
//        Sonuç  **Sex : female Age group: 5 - 15** olmalıdır.
//        15 to 50'ye tıklayınız.
//        Sonucu yazdırınız.
//        Sonuç  **Sex : female Age group: 15 - 50** olmalıdır.

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12));

        WebElement inputForms = driver.findElement(By
                .xpath("//a[text()='Input Forms']"));
        inputForms.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//a[text()='Radio Buttons Demo'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//input[@value='Male'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//input[@value='0 - 5']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[text()='Get values']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='groupradiobutton']")));
        WebElement message1 = driver.findElement(By
                .xpath("//p[@class='groupradiobutton']"));
        System.out.println(message1.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//input[@value='5 - 15']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[text()='Get values']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='groupradiobutton']")));
        WebElement message2 = driver.findElement(By
                .xpath("//p[@class='groupradiobutton']"));
        System.out.println(message1.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//input[@value='15 - 50']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[text()='Get values']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='groupradiobutton']")));
        WebElement message3 = driver.findElement(By
                .xpath("//p[@class='groupradiobutton']"));
        System.out.println(message3.getText());


        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("(//input[@value='Female'])[2]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//input[@value='0 - 5']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[text()='Get values']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='groupradiobutton']")));
        WebElement message4 = driver.findElement(By
                .xpath("//p[@class='groupradiobutton']"));
        System.out.println(message4.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//input[@value='5 - 15']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[text()='Get values']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='groupradiobutton']")));
        WebElement message5 = driver.findElement(By
                .xpath("//p[@class='groupradiobutton']"));
        System.out.println(message5.getText());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//input[@value='15 - 50']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//button[text()='Get values']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("//p[@class='groupradiobutton']")));
        WebElement message6 = driver.findElement(By
                .xpath("//p[@class='groupradiobutton']"));
        System.out.println(message6.getText());

        MyFunc.Wait(4);


    }

    @Test
    public void Test11() {

//        Bu web sitesine gidiniz.
//        http://demo.seleniumeasy.com/table-search-filter-demo.html
//        Task tablosunda;
//        "in progress" giriniz.
//                Tablodaki bütün Taskları bulun ve yazdırın.
//                Tablodaki bütün Assignee olanları bulun ve yazdırın.
//        Not: find element kullanın ve yazdırırken for loop kullanın.

        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");

        WebElement inProqress = driver.findElement(By
                .xpath("//input[@id='task-table-filter']"));
        inProqress.sendKeys("in progress");

        MyFunc.Wait(4);

        List<WebElement> tasksName = driver.findElements(By
                .xpath("//td[text()='in progress']/..//td[2]"));

        for (WebElement name : tasksName) {

            System.out.println("Task name= " + name.getText());
        }

        List<WebElement> assigneeName = driver.findElements(By
                .xpath("//td[text()='in progress']/..//td[3]"));

        for (WebElement name : assigneeName) {

            System.out.println("Assignee name= " + name.getText());
        }

    }

    @Test
    public void Test12() {

//        Bu websitesine gidiniz.
//        (http://demo.seleniumeasy.com/table-search-filter-demo.html)
//        Listed users tablosunun içinde;
//        First Name filtre kutusuna "an" giriniz.
//                web sitesindeki first name'leri bulunuz. (içinde "an" olanlar.)
//        Bu first name'leri yazdırınız.
//        First Name filtre kutusundaki yazıyı siliniz.
//        Usernames filtre kutusuna "ar" giriniz.
//                Web sitesindeki username'leri bulunuz (içinde "ar" olanlar.)
//        Bu username'leri yazdırınız.
//        Not: find elements kullanınız.ve for loop kullanınız.

        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");

        WebElement filterBtn = driver.findElement(By
                .xpath("//button[@class='btn btn-default btn-xs btn-filter']"));
        filterBtn.click();
        WebElement firstName = driver.findElement(By
                .xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("an");
        List<WebElement> firstNames = driver.findElements(By
                .xpath("//tr[@style='display: table-row;']/td[3]"));

        for (WebElement name : firstNames) {

            System.out.println(name.getText());
        }

        WebElement firstNameClear = driver.findElement(By
                .xpath("//input[@placeholder='First Name']"));
        firstNameClear.clear();

        WebElement userName = driver.findElement(By
                .xpath("//input[@placeholder='Username']"));
        userName.sendKeys("ar");
        List<WebElement> userNames = driver.findElements(By
                .xpath("//tr[@style='display: table-row;']/td[2]"));

        for (WebElement name : userNames) {

            System.out.println(name.getText());
        }

        MyFunc.Wait(4);

        waitClose();

    }

}
