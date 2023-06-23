package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        //declare instance
        WebDriver driver=new ChromeDriver();
        //navigate to the HRMS
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //maximise the screen
        driver.manage().window().maximize();
        //find the webelement username in the website
      WebElement userNameTextBox= driver.findElement(By.id("txtUsername"));
      userNameTextBox.sendKeys("Admin");

      //slow down
        Thread.sleep(2000);
      //after sending the username to the textbox clear the textbox
        userNameTextBox.clear();
        //slow down
        Thread.sleep(2000);
        //now I want to send usernam again
        userNameTextBox.sendKeys("Admin");
        //find the password
        WebElement userNamePassword= driver.findElement(By.name("txtPassword"));
        userNamePassword.sendKeys("Hum@nhrm123");
        //press Login
        WebElement userLoginButton= driver.findElement(By.className("button"));
        userLoginButton.click();

       //get the welcome admin message
        WebElement message = driver.findElement(By.linkText("Welcome Admin"));
        String text = message.getText();
        System.out.println(text);

        //click Recruitment tab//with this u can use partail so from Recruitment to Recru
        driver.findElement(By.partialLinkText("Recru")).click();


    }
}
