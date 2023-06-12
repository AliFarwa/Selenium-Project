package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Alertpractice extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement alertbtn=driver.findElement(By.xpath(" //button[@onclick='myAlertFunction()']"));
        alertbtn.click();

        Thread.sleep(2000);

        Alert confirm=driver.switchTo().alert();
        confirm.accept();

        Thread.sleep(2000);

        WebElement alertbtn2= driver.findElement(By.xpath(" //button[@onclick='myConfirmFunction()']"));
        alertbtn2.click();
        Thread.sleep(2000);

        Alert confirm2=driver.switchTo().alert();
        confirm2.dismiss();
        Thread.sleep(2000);

        WebElement alerbtn3=driver.findElement(By.xpath(" //button[@onclick='myPromptFunction()']"));
        alerbtn3.click();
        Thread.sleep(2000);

        Alert confirm3=driver.switchTo().alert();
        confirm3.sendKeys("Farwa Ali");
        Thread.sleep(2000);
       Alert accept=driver.switchTo().alert();
       accept.accept();



    }
}
