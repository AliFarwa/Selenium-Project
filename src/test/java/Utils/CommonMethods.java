package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class CommonMethods {
    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(String URL, String browser) {

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;
        }
//       maximize thhe window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void closeBrowser() {
        if (driver != null) {// it will only work now if the driver was opened/
            driver.quit();
        }
    }

    public static void sendText(String text, WebElement element) {
        element.click();
        element.sendKeys(text);
    }

    public static void ScreenShot(String filename) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenShot = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenShot, new File(System.getProperty("user.dir")+"\\screenshot\\"+filename+".png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}