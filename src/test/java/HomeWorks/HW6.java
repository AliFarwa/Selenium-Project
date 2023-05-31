package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Class03.CommonMethods.driver;
import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class HW6 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
//HW1:
//goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
//select , tuesday, thursday and friday one by one
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //maximise the screen
        driver.manage().window().maximize();
        //xpath for drop down
        WebElement days=  driver.findElement(By.xpath("//select[@class='form-control']"));
        //create an object of select class
        Select day=new Select(days);
        //methods to select desired option
        //select by index
        day.selectByIndex(3);
        Thread.sleep(2000);
        //select by value
        day.selectByValue("Thursday");
        Thread.sleep(2000);
        //select by
        day.selectByVisibleText("Friday");
        Thread.sleep(5000);
        driver.quit();




    }
}
