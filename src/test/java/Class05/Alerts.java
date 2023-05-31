package Class05;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Alerts extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);


        WebElement alertBtn = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        alertBtn.click();

        Thread.sleep(3000);

//        switch the focs of the driver to the alert
        Alert confirmationAlert1 = driver.switchTo().alert();
        confirmationAlert1.accept();

//        find the 2nd alert button an click on it

        WebElement alert2Btn = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alert2Btn.click();
//switch to alert
        Alert confirmationAlert2 = driver.switchTo().alert();
        confirmationAlert2.dismiss();



    }
}
