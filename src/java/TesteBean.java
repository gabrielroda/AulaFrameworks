
/**
 * @since 05/10/2015
 * @author Gabriel Henrique Marcondes Roda
 */
import javax.faces.bean.ManagedBean;

@ManagedBean
public class TesteBean {

    private String nome;

    public String getNome() {
        if ("3".equals(nome)){
            return "third";
        }
        else{
        return "second";
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
