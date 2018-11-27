

package DAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Pessoa;

@Stateless
public class PessoaDAO {
    
    @PersistenceContext
    EntityManager em;

    public void incluir(Pessoa pessoa) {
        em.persist(pessoa);
    }
    public void alterar(Pessoa pessoa) {
        em.merge(pessoa);
    }
    public void excluir(Pessoa pessoa) {
        em.remove(em.merge(pessoa));
    }
    
     public List<Pessoa> getItensCompra() {
        Query  q = em.createQuery("Select  c from Pessoa  c ");
        return q.getResultList();
    }

    public List<Pessoa> getPessoas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
