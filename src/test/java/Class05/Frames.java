package Class05;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static Utils.CommonMethods.openBrowserAndLaunchApplication;

public class Frames extends CommonMethods {
    public static void main(String[] args) {

        String url="https://chercher.tech/practice/frames";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        //task1:print baby cat on screen
     //and select babycar fron drop down

        //Step1: as the webElement is inside an iframe
        //first we need to switch to it
      driver.switchTo().frame(1);

//find the WebElement animal. Will print Animal on our console
        WebElement animal = driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());

        //select baby cat
        WebElement dd = driver.findElement(By.xpath("//select[@id='animals']"));//dd stands for dropdown
        Select sel =new Select(dd);
        sel.selectByVisibleText("Baby Cat");

        //switch the focus to the main page//goes back to main
        driver.switchTo().defaultContent();

        //switch to frame containiung text box
        //switch the focus to the main page
        driver.switchTo().defaultContent();

//            switch to frame containing text box
        driver.switchTo().frame("frame1");
        WebElement textBox = driver.findElement(By.xpath("//input"));
        textBox.sendKeys("abracadabra");

        //            click on the check box
//            switch to iframe using webElement method
        WebElement frame3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);

        driver.findElement(By.id("a")).click();
    }
}
