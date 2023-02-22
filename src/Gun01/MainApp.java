package Gun01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MainApp {
    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
        WebDriver driver = new EdgeDriver();
        //WebDriver driver = new SafariDriver();

        driver.get("https://www.google.com");
    }
}
