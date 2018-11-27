
package GUI;

import DAO.EmprestimoDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;
import model.Emprestimo;


@Named(value = "guiemprestimo")
@SessionScoped
public class Guiemprestimo implements Serializable {

    
    private List<Emprestimo>emprestimos;
    private Emprestimo emprestimo;
    private Boolean incluindo;
    
    
    @PersistenceContext
    EmprestimoDAO daoemprestimo;

    
    
    
    public Guiemprestimo() {
    }
    
    public String iniciarListaEmprestimos(){
       emprestimos = daoemprestimo.getEmprestimos();
          return "LstEmprestimos";
                      
        }
    public String novaEmprestimo(){
        emprestimo = new Emprestimo();
        incluindo = true;
        return "CadEmprestimos";
        
    } 

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public Boolean getIncluindo() {
        return incluindo;
    }

    public void setIncluindo(Boolean incluindo) {
        this.incluindo = incluindo;
    }

    public EmprestimoDAO getDaoemprestimo() {
        return daoemprestimo;
    }

    public void setDaoemprestimo(EmprestimoDAO daoemprestimo) {
        this.daoemprestimo = daoemprestimo;
    }
    
     public String gravarEmprestimo(){
        if(incluindo){
            daoemprestimo.incluir(emprestimo);
        }else{
            daoemprestimo.alterar(emprestimo);
        }
        emprestimos = daoemprestimo.getEmprestimos();
        return "LstEmprestimos";
    }

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }
    
}
