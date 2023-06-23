package Practice;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class practice5 extends CommonMethods {
    public static void main(String[] args) {
        //drag and drop practice
        String url="http://practice.syntaxtechs.net/drag-and-drop-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement drag= driver.findElement(By.xpath(" //span[@draggable='true'][1]"));
        WebElement drop= driver.findElement(By.xpath("  //div[@id='mydropzone']"));
        Actions actions=new Actions(driver);
       actions.dragAndDrop(drag,drop).perform();

    }
}
