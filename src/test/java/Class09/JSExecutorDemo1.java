package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JSExecutorDemo1 extends CommonMethods {
    public static void main(String[] args) {
//JS=Java Script Executor
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement userNameTxtBox= driver.findElement(By.xpath("//input[@id='txtUsername']"));

//        JSExecutor
        JavascriptExecutor js= (JavascriptExecutor) driver;
//        script
//        the script should draw a border around the WebElement
        //js.executeScript("arguments[0].style.backgroundColor='blue'",userNameTxtBox);
     js.executeScript("arguments[0].style.border='2px solid red'",userNameTxtBox);
    }
}
