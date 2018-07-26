package objects;

import org.openqa.selenium.WebDriver;

/**
 * Created by Paulo on 25/07/2018.
 */
public class LoginObject extends BaseObject {

    public String getTitle(){
        return getDriver().getTitle();
    }

    public LoginObject(WebDriver driver){
        super(driver);
    }
}
