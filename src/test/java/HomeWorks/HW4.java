package HomeWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4 {
    //HW1:
    //Open chrome browser
    //Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
    //fill in the complete form
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement firstname= driver.findElement(By.xpath("//input[@name='first_name']"));
        firstname.sendKeys("Farwa");
        WebElement lastname= driver.findElement(By.xpath("//input[@name='last_name']"));
        lastname.sendKeys("Ali");
        WebElement email= driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']"));
        email.sendKeys("abc@gmail.com");
        WebElement numb= driver.findElement(By.xpath("//input[@name='phone']"));
        numb.sendKeys("123-456-7890");
        WebElement address= driver.findElement(By.xpath("//input[@name='address']"));
        address.sendKeys("13650 cedar street");
        WebElement city= driver.findElement(By.xpath("//input[@placeholder='city']"));
        city.sendKeys("Bristow");
        WebElement state= driver.findElement(By.xpath("select[class *= 'control ']"));
        state.sendKeys("Virginia");
        WebElement zipcode= driver.findElement(By.xpath("//input[@name='zip']"));
        zipcode.sendKeys("22193");
        driver.quit();
    }
}
