
package DAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Emprestimo;

@Stateless
public class EmprestimoDAO {
    @PersistenceContext
    EntityManager em;

    public void incluir(Emprestimo emprestimo) {
        em.persist(emprestimo);
    }
    public void alterar(Emprestimo emprestimo) {
        em.merge(emprestimo);
    }
    public void excluir(Emprestimo emprestimo) {
        em.remove(em.merge(emprestimo));
    }
    
     public List<Emprestimo> getItensCompra() {
        Query  q = em.createQuery("Select  c from Emprestimo  c ");
        return q.getResultList();
    }

    public List<Emprestimo> getEmprestimos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
