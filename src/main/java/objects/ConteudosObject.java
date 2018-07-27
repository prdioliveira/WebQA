package objects;

import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Paulo on 25/07/2018.
 */
public class ConteudosObject extends BaseObject {

    public String getTitle(){
        return getDriver().getTitle();
    }

    public ConteudosObject(WebDriver driver){
        super(driver);
    }

    public void ativarTodos(){
        getDriver().findElement(By.id("check-all")).click();
        Select acao = new Select(getDriver().findElement(By.id("bash-action")));
        acao.selectByVisibleText("Ativar");
    }
}
