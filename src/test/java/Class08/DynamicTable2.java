package Class08;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DynamicTable2 extends CommonMethods {
    public static void main(String[] args) {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //enter login
        WebElement userName = driver.findElement(By.cssSelector("input#txtUsername"));
        userName.sendKeys("Admin");
        //enter password
        WebElement password = driver.findElement(By.cssSelector("input#txtPassword"));
        password.sendKeys("Hum@nhrm123");
        //click login
        WebElement loginbtn = driver.findElement(By.cssSelector("input#btnLogin"));
        loginbtn.click();
        //click PIM
        WebElement pimbtn=driver.findElement(By.cssSelector("a#menu_pim_viewPimModule"));
        pimbtn.click();

//get all the ids from the table into the list
        List<WebElement> allIds = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));

        //iterate through the ids and find the id 53502A and click on associated checkbox
        for (int i = 0; i < allIds.size() ; i++) {
            String id = allIds.get(i).getText();
            if (id.equals("53502A")) {
                System.out.println("click in the check box on row number " + (i + 1));

                WebElement checkBox = driver.findElement(By.xpath("//table/tbody/tr[" + (i + 1) + "]/td[1]"));
                checkBox.click();
                ;
            }
        }
    }
}
