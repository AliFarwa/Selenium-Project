package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW5 {
    //Go to “http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D
    //Enter valid username
    //Leave password field empty
    //Click on login button
    //Verify error message with text “Password cannot be empty” is displayed.
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
        loginBtn.click();
        driver.quit();

        //Password cannot be empty displayed



    }



}
