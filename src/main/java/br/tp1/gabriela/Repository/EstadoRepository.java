package br.tp1.gabriela.Repository;

import java.util.List;

import javax.persistence.Query;

import br.tp1.gabriela.model.*;

public class EstadoRepository extends Repository<Cosmeticos> {

	public Cosmeticos buscarPeloId(Integer id) {
		return getEntityManager().find(Cosmeticos.class, id);
	}

	public List<Cosmeticos> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT e FROM Estado e ORDER BY e.nome");
		return query.getResultList();
	}

}
