package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Syntaxwebsite extends CommonMethods {
    public static void main(String[] args) {

        String url = "http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement femalebtn= driver.findElement(By.xpath("( //label [text()=\"Female\"])[1]"));
        femalebtn.click();

         boolean femalebtnenabled=femalebtn.isEnabled();
        System.out.println("The female button is enabled : " +femalebtnenabled);

        boolean femalebtnselected= femalebtn.isSelected();

        System.out.println("The Female button is selected : " + femalebtnselected);

    }
}
