package Class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonMethods {

    public static WebDriver driver;// we make driver static so we can use it anywhere

    public static void openBrowserAndLaunchApplication(String url){
        //create instance
         driver= new ChromeDriver();
        //navigate to url
        driver.get(url);
        //maiximize the screen
        driver.manage().window().maximize();

    }
  public static void closeBrowser(){
        driver.quit();
  }

}
