package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdownspractice extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.amazon.com/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement searchBar= driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
        searchBar.click();

        List<WebElement> departments=driver.findElements(By.xpath("//option[contains(@value, 'search-alias')]"));
        for (WebElement dept:departments){
            String depts=dept.getText();
            System.out.println(depts);



            WebElement computer= driver.findElement(By.xpath("//select[@name='url']"));
            Select sel=new Select(computer);
            sel.selectByVisibleText("Computers");

            }
        }

    }

