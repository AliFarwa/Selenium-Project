package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW7 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        //goto facebook.com
        // click on create account
        //and select the your  date of birth using select class
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.manage().window().maximize();
        WebElement cna= driver.findElement(By.xpath("//a[text()='Create new account']"));
         cna.click();

        Thread.sleep(1000);
        //select method with css selector to select month
        WebElement months= driver.findElement(By.cssSelector("select#month"));
        Select month=new Select(months);
        month.selectByVisibleText("March");

        //select method with css selector to select day
        WebElement days= driver.findElement(By.cssSelector("select#day"));
        Select day=new Select(days);
        day.selectByValue("9");

        //select method with css selector to select year
        WebElement years= driver.findElement(By.cssSelector("select#year"));
        Select year= new Select(years);
        year.selectByIndex(24);

        driver.quit();
    }
}
