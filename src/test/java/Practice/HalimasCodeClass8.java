package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class HalimasCodeClass8 extends CommonMethods {
    public static void main(String[] args) throws IOException {
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginButton.click();

        WebElement recruitment = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitment.click();

        String calenderXpath = "//input[@id='candidateSearch_fromDate']";
        String monthXpath = "//select[@class='ui-datepicker-month']";
        String yearXpath = "//select[@class='ui-datepicker-year']";
        String dateXpath = "//table/tbody/tr/td";
        String selectDate = "12";
        String selectMonth = "Dec";
        String selectYear = "1999";
        //selectDateOnCalendar(calenderXpath,monthXpath,yearXpath,dateXpath,selectDate,selectMonth,selectYear);
    }
}
//    public static void selectDateOnCalendar(String calendarXapth, String monthXpath, String yearXapth, String dateXpath, String selectDate, String selectMonth, String selectYear) throws IOException {
//        WebElement calendar = driver.findElement(By.xpath((calendarXapth)));
//        calendar.click();
//
//        WebElement month = driver.findElement(By.xpath(monthXpath));
//        Select selMonth = new Select(month);
//        selMonth.selectByVisibleText(selectMonth);
//
//        WebElement year = driver.findElement(By.xpath(yearXapth));
//        Select selYear = new Select(year);
//        selYear.selectByValue(selectYear);
//
//        boolean found = false;
//        while (!found) {
//            List<WebElement> allDates = driver.findElements(By.xpath(dateXpath));
//            for (WebElement date : allDates) {
//                String currentDate = date.getText();
//                if (currentDate.equals(selectDate)) {
//                    date.click();
//                    found = true;
//                    break;
//                }
//            }
//        }
//    }

