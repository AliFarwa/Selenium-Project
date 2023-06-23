package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JScolorbackground extends CommonMethods {
    public static void main(String[] args) {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement password= driver.findElement(By.xpath("//input[@id='txtPassword']"));
        js.executeScript("arguments[0].style.backgroundColor='2px solid red",password);


    }
}
