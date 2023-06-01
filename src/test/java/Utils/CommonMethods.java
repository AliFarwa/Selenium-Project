package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String URL, String browser){

        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;

            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
//       maximize thhe window
        driver.manage().window().maximize();
        //navigate to the url
        driver.get(URL);
    }

    public static void closeBrowser() {
        if(driver!=null) {// it will only work now if the driver was opened/
            driver.quit();
        }
    }
    public static void  sendText(String text, WebElement element){
        element.click();
        element.sendKeys(text);
    }
}

