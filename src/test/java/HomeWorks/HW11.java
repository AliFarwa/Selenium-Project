package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW11 extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
        //click on get new user
        //print the firstname of user

        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        WebElement newuserbtn=driver.findElement(By.xpath(" //button[@type='button']"));
        newuserbtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement firstname=driver.findElement(By.xpath(" //div[@id='First-Name']"));
        wait.until(ExpectedConditions.visibilityOf(firstname));
        System.out.println(firstname.getText());
    }
}
