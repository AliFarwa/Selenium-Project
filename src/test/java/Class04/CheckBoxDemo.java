package Class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxDemo extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://practice.syntaxtechs.net/basic-checkbox-demo.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //check the checkbox if it is already not checked
        WebElement c1 = driver.findElement(By.xpath("//input[@id='isAgeSelected']"));
        if (!c1.isSelected()) {
            c1.click();
            //click all 4 button
            List<WebElement> c2 = driver.findElements(By.xpath("//input[@class='cb1-element']"));

            for (WebElement option : c2) {
                String value = option.getAttribute("value");
                if (value.equals("Option-1")) {
                    option.click();
                    break;
                }
            }
        }
    }
}

