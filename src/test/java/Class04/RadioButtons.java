package Class04;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioButtons extends CommonMethods {
    public static void main(String[] args) {
        String url="http://practice.syntaxtechs.net/basic-radiobutton-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
//find the radio button male and click on it
        WebElement r1=driver.findElement((By.xpath( "//input[@value='Male' and @name='optradio']")));
        r1.click();

        //check if radio button is selected
        boolean r1isSelected=r1.isSelected();
        System.out.println("The radio Male is selected: "+ r1isSelected);

//check if the radio button is displayed
        boolean r1isDisplayed=r1.isDisplayed();
        System.out.println("The radio Male is Displayed: "+ r1isDisplayed);

        //check if the radio button r1 is enabled
       boolean r1isEnabled= r1.isEnabled();
        System.out.println("The radio Male is Enabled :" + r1isEnabled);

        //deselect the male r1 button
        WebElement r2=driver.findElement((By.xpath( "//input[@value='Female' and @name='optradio']")));
        r2.click();

        //check to see if r1 is deselected
        r1isSelected=r1.isSelected();
        // this will return false
        System.out.println("The male radio button is selected : " +r1isSelected);

    }
}
