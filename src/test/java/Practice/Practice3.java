package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Practice3 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        //Radio Buttons Demo

        String url = "http://demo.seleniumeasy.com/basic-radiobutton-demo.html";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
       //click male radio button.
        WebElement malebutton= driver.findElement(By.xpath("  //input[@value='Male' and @name='optradio']"));
        malebutton.click();
       //click female radio button.
        Thread.sleep(2000);

        WebElement femalebutton= driver.findElement(By.xpath("  //input[@value='Female' and @name='optradio']"));
        femalebutton.click();

        //get checked value.
        WebElement getcheckedbtn= driver.findElement(By.xpath("  //button[@id='buttoncheck']"));
        getcheckedbtn.click();

        //select gender.
        WebElement genderFemale= driver.findElement(By.xpath("  //input[@name='gender' and @value='Female']"));
        genderFemale.click();
        // select age from three options given for the age
       List< WebElement> ageGroup=driver.findElements(By.xpath("//input[@name='ageGroup']"));
       String option="0 - 5";
       for(WebElement age:ageGroup){
           String value=age.getAttribute("value");
                if(value.equals(option)){
                    age.click();
                    break;
            }
        }
       //click the getvalue button.
        WebElement getValues=driver.findElement(By.xpath("//button[@onclick='getValues();']"));
        getValues.click();

        //print on console what has been selected.
        WebElement value=driver.findElement(By.xpath("//p[@class='groupradiobutton']"));
        System.out.println(value.getText());
    }
}
