package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorDemo2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="http://amazon.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //perform a scroll operation
        //using java script

        JavascriptExecutor js=(JavascriptExecutor) driver;
        //scroll down
     //   js.executeScript("window.scrollBy(0, 500)");
        //add thread .sleep to observe
        Thread.sleep(2000);
//        scroll up
      //  js.executeScript("window.scrollBy(0, -500)");

        //click on the dropdown "All"
        //us click from jsExecutor.
        WebElement select = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        js.executeAsyncScript("arguments[0].click();",select);
    }
}
