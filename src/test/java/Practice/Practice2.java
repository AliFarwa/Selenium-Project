package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Instant;

public class Practice2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        //Checkbox Demo
        String url = "http://demo.seleniumeasy.com/basic-checkbox-demo.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement checkbox= driver.findElement(By.xpath(" //input[@id='isAgeSelected']"));
        checkbox.click();
        //WebElement checkbox2= driver.findElement(By.xpath("//label[@class='checkbox-inline'][1]"));
     //   checkbox2.click();
        WebElement checkAll= driver.findElement(By.xpath("  //input[@value='Check All']"));
        checkAll.click();
        Thread.sleep(2000);

        WebElement uncheckAll= driver.findElement(By.xpath("  //input[@value='Uncheck All']"));
        uncheckAll.click();
    }
}
