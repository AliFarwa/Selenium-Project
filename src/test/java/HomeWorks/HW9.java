package HomeWorks;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW9 extends CommonMethods {
    public static void main(String[] args) {
//goto https://chercher.tech/practice/frames
//
//click on check box
//then select baby cat from drop down
//then enter text in text box
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //switch to iframe 1 with index 0
        driver.switchTo().frame(0);
        //send text to the text box
        WebElement topic= driver.findElement(By.xpath("//input"));
        topic.sendKeys("Hello");


        //switch to frame 3
        driver.switchTo().frame("frame3");// or I could use index0
        //check the check box
         driver.findElement(By.id("a")).click();

        driver.switchTo().defaultContent();

         //switch to frame 2
        driver.switchTo().frame(1);

        WebElement animal= driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        WebElement dropdown= driver.findElement(By.cssSelector("select#animals"));
        Select sel =new Select(dropdown);
       sel.selectByValue("babycat");

    }
}
