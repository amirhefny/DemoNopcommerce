package FollowUs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;

public class FollowUsPage {
private WebDriver driver;
	
	public FollowUsPage(WebDriver driver){
        this.driver = driver;
    }
    public List<String > getWindowsTitles(){
        List<String> pagesTitles = new ArrayList<>();
        var mainWindow = driver.getWindowHandle();
        var newWindows = driver.getWindowHandles();
        Iterator<String> iterator = newWindows.iterator();
            for (int i = 0; i < newWindows.size(); i++){
                String newWindow = iterator.next();
                if(!mainWindow.equals(newWindow)){

                String pageTitle = driver.switchTo().window(newWindow).getCurrentUrl();
                pagesTitles.add(pageTitle);
            }
        }
            return pagesTitles;
    }
}
