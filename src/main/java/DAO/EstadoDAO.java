
package DAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Estado;

@Stateless
public class EstadoDAO {
    @PersistenceContext
    EntityManager em;

    public void incluir(Estado estado) {
        em.persist(estado);
    }
    public void alterar(Estado estado) {
        em.merge(estado);
    }
    public void excluir(Estado estado) {
        em.remove(em.merge(estado));
    }
    
     public List<Estado> getItensCompra() {
        Query  q = em.createQuery("Select  c from Estado  c ");
        return q.getResultList();
    }

    
    
}
