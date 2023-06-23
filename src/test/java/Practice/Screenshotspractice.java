package Practice;

import Utils.CommonMethods;

public class Screenshotspractice extends CommonMethods {
    public static void main(String[] args) {

        //this is how we will use the screenshot method everytime we want to take screenshots
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        ScreenShot("test2");//everytime you want to take screenshot just change the name if the file

    }
}
