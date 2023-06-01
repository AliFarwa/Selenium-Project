package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HW10 extends CommonMethods {
    //HW1:
    //goto  http://practice.syntaxtechs.net/dynamic-elements-loading.php
    //click on start
    //print the text  "welcome syntax technologies "on console
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/dynamic-elements-loading.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        //
        driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(20));

        WebElement startbtn= driver.findElement(By.cssSelector("button#startButton"));
        startbtn.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement welcometext= driver.findElement(By.xpath("//h4[@style='padding: 10%;']"));
        wait.until(ExpectedConditions.visibilityOf(welcometext));
        System.out.println(welcometext.getText());

    }
}
