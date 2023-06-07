package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW12 extends CommonMethods {
    public static void main(String[] args) {
//goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
//login
//click on PIM
//
//from the table choose any ID
//and print out the row number of that id
//
//please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly

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

        //find ID 56363A
        List<WebElement> allids=driver.findElements(By.xpath("//table/tbody/tr/td[1]"));
        for (int i = 0; i <allids.size() ; i++) {
            String id= allids.get(i).getText();
            if(id.equals("56363A")){
                System.out.println("The id is: " +id + " the row number is : " + (i+1));
            }
        }
        }


    }
