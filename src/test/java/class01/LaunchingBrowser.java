package class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
    public static void main(String[] args) throws InterruptedException {
       //navigate to google.com

      WebDriver driver=new ChromeDriver();
        //use.get(url)to navigate to the desired url
       //maximize the window
      driver.manage().window().maximize();
        //get the current url
    String currentUrl= driver.getCurrentUrl();
      System.out.println("the current url od the website is : "+ currentUrl);
       //get the title of the page
      String title =driver.getTitle();
       System.out.println(" The title of the webpage is : " +title);
      //add some wait time
      Thread.sleep(5000);
      //close the webbrowser
     driver.quit();



    }
}
