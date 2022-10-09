package teste;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.tp1.gabriela.Repository.FuncionarioRepository;
import br.tp1.gabriela.model.*;

public class TesteJPA {

	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("GabrielaA1");
		EntityManager em = emf.createEntityManager();
		
		Funcionario usuario = new Funcionario();
		
		usuario.setNome("2Carlos Henrique");
		usuario.setLogin("2carlos");
		usuario.setEmail("carlos@gmail.com");
		usuario.setSenha("123");
		
		em.getTransaction().begin();
		em.persist(usuario);
		em.getTransaction().commit();
		System.out.println("Fim");
		
		FuncionarioRepository repo = new FuncionarioRepository();
		if(repo.logar("carlos", "123")!= null) {
			System.out.println("teste 1");
		};
		if(repo.logar("carlos@gmail.com", "123")!= null) {
			System.out.println("teste 2");
		};
		//travando o progama
		Scanner in = new Scanner(System.in); 
	    String s = in.nextLine();
	    s = in.nextLine();
		
		
	}
}
