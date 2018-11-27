
package GUI;

import DAO.PessoaDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;
import model.Pessoa;

@Named(value = "guiPessoa")
@SessionScoped
public class GuiPessoa implements Serializable {
    
    private List<Pessoa>pessoas;
    private Pessoa pessoa;
    private Boolean incluindo;
    
    
    @PersistenceContext
    PessoaDAO daopessoa;


    
    public GuiPessoa() {
    }        

    public String iniciarListaPessoas(){
       pessoas = daopessoa.getPessoas();
          return "LstPessoas";
                      
        }
    public String novaPessoa(){
        pessoa = new Pessoa();
        incluindo = true;
        return "CadPessoa";
        
    } 
    
     public String gravarPessoa(){
        if(incluindo){
            daopessoa.incluir(pessoa);
        }else{
            daopessoa.alterar(pessoa);
        }
        pessoas = daopessoa.getPessoas();
        return "LstPessoas";
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Boolean getIncluindo() {
        return incluindo;
    }

    public void setIncluindo(Boolean incluindo) {
        this.incluindo = incluindo;
    }

   
    
    


    }
    
