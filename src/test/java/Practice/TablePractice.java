package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.*;

import java.util.List;

public class TablePractice extends CommonMethods {
    public static void main(String[] args) {
        String url = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        //to print the whole table
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        System.out.println(table.getText());

        System.out.println("***********************************************");
        //to print rows
          List <WebElement> rows=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
           for(WebElement row:rows){
               String Row=row.getText();
               if(Row.contains("Google"))
               System.out.println(row.getText());
           }

        System.out.println("********************************************");
           //to print cells
        List <WebElement> cell=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement cells:cell){
            System.out.println(cells.getText());
        }
        }
    }

