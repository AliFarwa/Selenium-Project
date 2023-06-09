package Class09;

import Utils.CommonMethods;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;

public class ScreenShots extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //press login button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
//
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();",loginBtn);


//        take the screen shot

//        declare the instance
        TakesScreenshot ts = (TakesScreenshot)driver;

//        take screen shot  as output type FILE
        File screenShot = ts.getScreenshotAs(OutputType.FILE);//we take screenshot at this step

//        save it in your computer
        FileUtils.copyFile(screenShot,new File("C:\\Users\\User\\IdeaProjects\\seleniumSDETbatch16\\screenshot\\testSyntax.png"));


    }
}
