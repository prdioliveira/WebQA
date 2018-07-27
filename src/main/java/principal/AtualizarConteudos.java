package principal;

import objects.BaseObject;
import objects.ConteudosObject;
import objects.DashBoardObject;
import objects.LoginObject;
import org.junit.Test;


/**
 * Created by Paulo on 26/07/2018.
 */
public class AtualizarConteudos {
    private BaseObject baseObject = new BaseObject();
    private LoginObject loginObject = new LoginObject(baseObject.getDriver());
    private DashBoardObject dashBoardObject;
    private ConteudosObject conteudosObject;

    @Test
    public void atualizarTodos() throws Throwable{
        navegar();
        Thread.sleep(5000);
        System.out.println(System.getenv("PASS_QA"));
        logar();
    }

    public void navegar(){
        baseObject.navigate("http://web1.qa.sambatech.com:10000/");
    }

    public void logar(){
        this.dashBoardObject = loginObject.logar("avaliacao_qa_samba@sambatech.com.br", System.getenv("PASS_QA"));
    }
}
