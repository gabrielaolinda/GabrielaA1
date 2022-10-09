package br.tp1.gabriela.Repository;

import java.util.List;

import javax.persistence.Query;

import br.tp1.gabriela.model.Funcionario;

public class FuncionarioRepository extends Repository<Funcionario> {

	public List<Funcionario> buscarTodos() {
		Query query = getEntityManager().createQuery("SELECT u FROM Funcionario u");
		return query.getResultList();
	}
	
	public Funcionario logar(String login , String senha) {
		Funcionario funcionarioLogado = null;
		Query query = getEntityManager().createQuery(
				"SELECT u \r\n"
				+ "FROM Funcionario u \r\n"
				+ "WHERE (u.login = :login OR u.email = :login) and\r\n"
				+ "	u.senha = :senha",Funcionario.class);
		query.setParameter("login", login);
		query.setParameter("senha", senha);
		try {
			funcionarioLogado = (Funcionario)query.getSingleResult();			
		} catch (Exception e) {
			System.out.println("Funcionario nao encontrado ");
			System.out.println(login);
			System.out.println(senha);			
			
		}
		return funcionarioLogado;
	}

}
