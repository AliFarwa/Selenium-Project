package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        //HW  (only use XPATH //navigate to fb.com
        //click on create new account //fill up all the textboxes
        //close the popup //close the browser
        //Note : in order for ur code to work
        //u have to put Thread.sleep(2000) after clicking on Create new account
        WebDriver driver= new ChromeDriver();
       driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement createAccount = driver.findElement(By.xpath("//a[text()= 'Create new account']"));
        createAccount.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@name= 'lastname']")).sendKeys("Rodriguez");
        driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("JR@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("JR@gmail.com");
        driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("abc123");
        driver.findElement(By.xpath("//select[@aria-label ='Month']")).sendKeys("June");
        driver.findElement(By.xpath("//select[@aria-label= 'Day']")).sendKeys("20");
        driver.findElement(By.xpath("//select[@aria-label= 'Year']")).sendKeys("2002");
         WebElement gender= driver.findElement(By.xpath("//label[text()= 'Male']" ));
         gender.click();
        WebElement signUp= driver.findElement(By.xpath("//button[text()= 'Sign Up']" ));
        signUp.click();
        driver.quit();





    }
}
