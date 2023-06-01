package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HW8 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        //click on the last alert
        //send keys and accept it
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //find element of the button and click
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        button1.click();
       // slow down for 2 seconds
        Thread.sleep(4000);

        //send keys in the alert box
        Alert keys= driver.switchTo().alert();
        keys.sendKeys("Hello");

        //pause for 2 seconds
        Thread.sleep(2000);

       //accept the alert and if you want to dismiss then .dismiss();
        Alert accept=driver.switchTo().alert();
        accept.accept();

      //close page.
        driver.quit();

    }
}
