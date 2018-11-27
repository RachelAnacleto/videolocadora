
package GUI;

import DAO.CopiasDAO;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.persistence.PersistenceContext;
import model.Copias;


@Named(value = "guiCopias")
@SessionScoped
public class GuiCopias implements Serializable {

     
    private List<Copias>copias;
    private Copias copia;
    private Boolean incluindo;
    
    
    @PersistenceContext
    CopiasDAO daocopia;


    public GuiCopias() {
    }
    
    public String iniciarListaCopiass(){
       copias = daocopia.getCopias();
          return "LstCopias";
                      
        }
    public String novaCopias(){
        copia = new Copias();
        incluindo = true;
        return "CadCopiass";
        
    }
    
    public String gravarCopias(){
        if(incluindo){
            daocopia.incluir(copia);
        }else{
            daocopia.alterar(copia);
        }
        copias = daocopia.getCopias();
        return "LstCopiass";
    }

    public List<Copias> getCopias() {
        return copias;
    }

    public void setCopias(List<Copias> copias) {
        this.copias = copias;
    }

    public Copias getCopia() {
        return copia;
    }

    public void setCopia(Copias copia) {
        this.copia = copia;
    }

    public Boolean getIncluindo() {
        return incluindo;
    }

    public void setIncluindo(Boolean incluindo) {
        this.incluindo = incluindo;
    }

    public List<Copias> getCopiass() {
        return copias;
    }
    
}
