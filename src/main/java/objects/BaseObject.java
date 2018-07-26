package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Paulo on 25/07/2018.
 */
public class BaseObject {
    private WebDriver driver;

    public WebDriver getDriver(){
        return driver;
    }

    public BaseObject(WebDriver driver){
        this.driver = driver;
    }

    public BaseObject(){
        this.driver = new FirefoxDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    public void navigate(String url){
        driver.navigate().to(url);
    }

    public void closeBrowser(){
        getDriver().close();
    }
}
