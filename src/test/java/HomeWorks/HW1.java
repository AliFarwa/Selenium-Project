package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    //HW1:
    //navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    //fill out the form
    //close the browser
    //Note: use name or id as locators
  public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
      driver.manage().window().maximize();
       driver.findElement(By.id("customer.firstName")).sendKeys("Megan");
       driver.findElement(By.id("customer.lastName")).sendKeys("Bowels");
      driver.findElement(By.name("customer.address.street")).sendKeys("8055 Acadia ParK");
       driver.findElement(By.id("customer.address.city")).sendKeys("Virginia");
      driver.findElement(By.id("customer.address.state")).sendKeys("USA");
       driver.findElement(By.name("customer.address.zipCode")).sendKeys("20963");
       driver.findElement(By.id("customer.phoneNumber")).sendKeys("290-345-6789");
      driver.findElement(By.name("customer.ssn")).sendKeys("123-45-6789");
       driver.findElement(By.id("customer.username")).sendKeys("megan123");
       driver.findElement(By.name("customer.password")).sendKeys("abc123$");
      driver.findElement(By.id("repeatedPassword")).sendKeys("abc123$");
        Thread.sleep(8000);
      driver.quit();

    }
}
