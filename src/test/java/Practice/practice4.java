package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class practice4 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

 //select practice
        String url = "http://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
        String browser = "chrome";
       openBrowserAndLaunchApplication(url,browser);
         //select day
        WebElement day=driver.findElement(By.xpath("//select[@id='select-demo']"));
        Select sel=new Select(day);
        sel.selectByVisibleText("Monday");//will select monday
        Thread.sleep(2000);
        sel.selectByValue("Wednesday");//will select wednesday
        Thread.sleep(2000);
        sel.selectByIndex(5);//will select thursday

        //select state
        WebElement states= driver.findElement(By.xpath("//select[@id='multi-select']"));
        Select state=new Select(states);
        state.selectByIndex(6);
        Thread.sleep(2000);
        state.selectByVisibleText("New York");
        Thread.sleep(2000);
        state.selectByValue("Florida");

        //click the button
        WebElement btn=driver.findElement(By.xpath("//button[@id='printAll']"));
        btn.click();
    }
}
