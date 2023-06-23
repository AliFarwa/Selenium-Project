package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightAndDoubleClickActions extends CommonMethods {
    public static void main(String[] args) {

        String url="http://demo.guru99.com/test/simple_context_menu.html";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //find the element to be right click
        WebElement rightclickbtn= driver.findElement(By.xpath("//span[text()='right click me']"));
        //action class
        Actions actions=new Actions(driver);
        //perform the right click
        //right click is also called context click
        actions.contextClick(rightclickbtn).perform();

        //find the element which is edit option
        WebElement editopt= driver.findElement(By.xpath("//span[text()='Edit']"));
        actions.click(editopt).perform();

        //on clicking the adit alert
        //in oder to handle the alert
        Alert alert= driver.switchTo().alert();
        alert.accept();

        //find the webElement to double click
        WebElement doubleclick= driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
       actions.doubleClick(doubleclick).perform();

        Alert alert2= driver.switchTo().alert();
        alert2.accept();

    }
}
