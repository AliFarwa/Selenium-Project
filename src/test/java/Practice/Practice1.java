package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Practice1 extends CommonMethods {
    public static void main(String[] args) {

//simple form Demo
        String url = "http://demo.seleniumeasy.com/basic-first-form-demo.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement entermsg= driver.findElement(By.id("user-message"));
        entermsg.sendKeys("Hello Selenium");
        WebElement showmsgbtn= driver.findElement(By.xpath("  //button[@onclick='showInput();']"));
        showmsgbtn.click();
        System.out.println(showmsgbtn.getText());
        WebElement enterA= driver.findElement(By.xpath("  //input[@id='value1']"));
        enterA.sendKeys("2");
        WebElement enterB= driver.findElement(By.xpath("  //input[@id='value2']"));
        enterB.sendKeys("2");
        WebElement getTotal= driver.findElement(By.xpath("  //button[@onclick='return total()']"));
        getTotal.click();
    }
}
