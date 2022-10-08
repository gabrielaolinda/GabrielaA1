package br.tp1.gabriela.Repository;

import java.util.List;

import javax.persistence.Query;

import br.tp1.gabriela.model.Funcionario;

public class UsuarioRepository extends Repository<Funcionario> {

	public List<Funcionario> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT u FROM Funcionario u");
		return query.getResultList();
	}

}
