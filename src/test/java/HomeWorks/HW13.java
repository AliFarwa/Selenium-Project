package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW13 extends CommonMethods {
    public static void main(String[] args) {
        //hw:
        //goto syntax hrms
        //login
        //click on recruitment
        //select a date on the calanader

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName= driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");
        WebElement password= driver.findElement(By.name("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginbtn= driver.findElement(By.id("btnLogin"));
        loginbtn.click();
        WebElement recruitmentbtn=driver.findElement(By.cssSelector("a#menu_recruitment_viewRecruitmentModule"));
        recruitmentbtn.click();
        WebElement calender=driver.findElement(By.cssSelector("input#candidateSearch_fromDate"));
        calender.click();

         WebElement Month= driver.findElement(By.cssSelector("select.ui-datepicker-month"));
         Select month= new Select(Month);
         month.selectByValue("1");

         WebElement Year=driver.findElement(By.cssSelector("select.ui-datepicker-year"));
         Select year=new Select(Year);
         year.selectByVisibleText("2025");

         boolean isfound=false;
         while (!isfound){
             List<WebElement> alldates=driver.findElements(By.xpath("//table/tbody/tr/td"));
             for (WebElement date : alldates) {
                 String currentdate=date.getText();
                 if(currentdate.equals("25")){
                     date.click();
                 }
             }
             isfound=true;
         }
        }
    }

