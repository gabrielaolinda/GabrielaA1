package br.tp1.gabriela.controller;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import br.tp1.gabriela.Repository.FuncionarioRepository;
import br.tp1.gabriela.Repository.Repository;
import br.tp1.gabriela.aplication.Util;
import br.tp1.gabriela.model.Funcionario;
import net.bytebuddy.asm.Advice.This;

@Named
@RequestScoped
public class LoginController {
	private Funcionario usuario;
	private String senha;
	private String login;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Funcionario getUsuario() {
		return usuario;
	}
	public void logar(){
		FuncionarioRepository repo = new FuncionarioRepository();
		this.usuario = repo.logar(getLogin(),getSenha() );
		System.out.println("===================");
		System.out.println("tentativa de login ");
		System.out.println("login:"+this.login);
		System.out.println("senha:"+ this.senha);
		
		System.out.println("===================");
		System.out.println("usuario:"+ this.usuario);
		if(this.getUsuario() != null) {
			Util.redirect("menu.xhtml?faces-redirect=true");
		}
	}

	public void setUsuario(Funcionario usuario) {
		this.usuario = usuario;
	}

	public static void addErrorMessage(String valor) {
		addMessage(valor, FacesMessage.SEVERITY_ERROR);
	}
	
	public static void addInfoMessage(String valor) {
		addMessage(valor, FacesMessage.SEVERITY_INFO);
	}
	
	public static void addWarnMessage(String valor) {
		addMessage(valor, FacesMessage.SEVERITY_WARN);
	}
	
	private static void addMessage(String valor, Severity severity) {
		FacesMessage message = new FacesMessage(
				severity, valor , null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	private LoginController() {
		var repo = new Repository();
		repo.getEntityManager();
	}
	
}
