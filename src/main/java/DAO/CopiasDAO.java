/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import model.Copias;

@Stateless
public class CopiasDAO {
    @PersistenceContext
    EntityManager em;

    public void incluir(Copias copias) {
        em.persist(copias);
    }
    public void alterar(Copias copias) {
        em.merge(copias);
    }
    public void excluir(Copias copias) {
        em.remove(em.merge(copias));
    }
    
     public List<Copias> getItensCompra() {
        Query  q = em.createQuery("Select  c from Copias  c ");
        return q.getResultList();
    }

    public List<Copias> getCopias() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
