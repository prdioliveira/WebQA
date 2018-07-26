package objects;

import org.openqa.selenium.By;
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

    /*
    * Ao realizar o login a pagina inicial sera a dashboard
    * */
    public DashBoardObject logar(String user, String pass){
        fazerLogin(user, pass);
        return new DashBoardObject(getDriver());
    }

    public void fazerLogin(String user, String pass){
        getDriver().findElement(By.id("inputEmail")).sendKeys(user);
        getDriver().findElement(By.id("inputPassword")).sendKeys(pass);
        getDriver().findElement(By.id("login")).click();
    }
}
