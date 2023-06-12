package Class09;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 extends CommonMethods {
    public static void main(String[] args) {

        String url="https://jqueryui.com/droppable/";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        //as the element is inside an iframe so first we need to switch to ifram
        driver.switchTo().frame(0);
     //find the draggable WebElement
     WebElement draggable=driver.findElement(By.id("draggable"));
     //find the element where you want to drop
     WebElement droppable= driver.findElement(By.id("droppable"));
// to perform both above actions we will implement Actions class
        Actions actions=new Actions(driver);
        actions.dragAndDrop(draggable,droppable).perform();



    }
}
