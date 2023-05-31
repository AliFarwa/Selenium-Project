package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.chrome.ChromeDriver;

public class E1 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.facebook.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);


        driver.getCurrentUrl();
        System.out.println(url);

        String title=driver.getTitle();
        System.out.println("The title of this website is : " + title);
    }
}
