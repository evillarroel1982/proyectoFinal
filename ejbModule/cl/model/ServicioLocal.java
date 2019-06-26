package cl.model;

import java.util.List;

import javax.ejb.Local;

import cl.entities.Categoria;

@Local
public interface ServicioLocal {
	Categoria addCategoria(Categoria categoria);
	List<Categoria> getCategorias();
}
