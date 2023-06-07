package Class07;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Tables extends CommonMethods {
    public static void main(String[] args) {
        String url="https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
         String browser="chrome";
        openBrowserAndLaunchApplication(url, browser);
//        print the whole table on the console

        //****************table Level Access**********

//        get the whole table//we will use the whole table which is single entity and so we will write element not elements
        WebElement wholeTable = driver.findElement(By.xpath("//table[@id='customers']"));
        String allText=wholeTable.getText();
        System.out.println(allText);//or simply write sout(wholeTable.getText())

        System.out.println();
        //*************************Row Level Access****************

       List<WebElement> allRows= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        for (WebElement allRow : allRows) {
            String rowText=allRow.getText();
            if(rowText.contains("Google"))//print the row that contains Google.
            System.out.println(rowText);
        }

        System.out.println("--------------------------------------------------------");

//*****************column level access************************
//        print each and every data in the table

        List<WebElement> allCellData = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        for(WebElement cell:allCellData){
            String cellData = cell.getText();
            System.out.println(cellData);
        }

    }

}
