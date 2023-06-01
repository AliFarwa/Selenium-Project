package Class06;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ImplicitWait extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://www.facebook.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//this is global wait once implemented it will be implemented throughout so it should be in the start
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        //click on create new account
        WebElement createnewaccount= driver.findElement(By.xpath ("//a[text()='Create new account']"));
        createnewaccount.click();

//        Send the first name
        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        sendText("Farwa", firstName);
    }
}
