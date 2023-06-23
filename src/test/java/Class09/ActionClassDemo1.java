package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo1 extends CommonMethods {
    public static void main(String[] args) {


        String url = "http://amazon.com/";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
//    find the WebElement that you want to hover ur cursor to
        WebElement signIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//        Action class
        Actions action=new Actions(driver);
//        perform the desried action
        //cursor will move on the sign in option and you will see sign in selected.
        action.moveToElement(signIn).perform();



    }
}