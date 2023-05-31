package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {
    public static void main(String[] args) throws InterruptedException {


      //create instance
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
      //pause for few seconds:
        Thread.sleep(2000);
       //navigate to facebook
       driver.navigate().to("https:www.facebook.com");
       //pause
            Thread.sleep(2000);
       //refresh the page
        driver.navigate().refresh();
        //pause again for 1 sec
       Thread.sleep(1000);
       driver.navigate().back();
       //pause 2 sec
        Thread.sleep(2000);
       //fo forward
    driver.navigate().forward();
       //close the browser
      driver.quit();
      //close current tab
       driver.close();



    }
}