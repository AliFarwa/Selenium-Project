package Class03;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDEMO {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        //click in create new account
        WebElement createNewAccount= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
   createNewAccount.click();
        Thread.sleep(2000);
   //Enter firstname
      WebElement firstname= driver.findElement(By.cssSelector("input[name='firstname']"));
      firstname.sendKeys("Farwa");
       // WebElement lastname= driver.findElement(By.cssSelector("input[name='firstname']"));
        //lastname.sendKeys("Ali");








    }
}
