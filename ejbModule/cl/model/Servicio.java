package cl.model;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import cl.entities.Categoria;

/**
 * Session Bean implementation class Servicio
 */
@Stateless
@LocalBean
public class Servicio implements ServicioLocal {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pruebaFinal_EJB");
    private EntityManager em = emf.createEntityManager();
    
    /**
     * Default constructor. 
     */	
    public Servicio() {
    		 
    }


	@Override
	public Categoria addCategoria(Categoria categoria) {
		em.persist(categoria);
		return categoria;		
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> getCategorias() {
		List<Categoria> ret = new ArrayList<Categoria>();
	    Query query = em.createQuery("SELECT c FROM Categoria c");
	    ret = query.getResultList();
	    return ret;
	  }

}
