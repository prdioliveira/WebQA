package objects;

import org.openqa.selenium.WebDriver;

/**
 * Created by Paulo on 25/07/2018.
 */
public class DashBoardObject extends BaseObject {

    public String getTitle(){
        return getDriver().getTitle();
    }

    public DashBoardObject(WebDriver driver){
        super(driver);
    }
}
