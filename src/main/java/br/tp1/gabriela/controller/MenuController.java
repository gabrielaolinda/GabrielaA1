package br.tp1.gabriela.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MenuController {

	public String telaLogin() {

		return "login.xhtml?faces-redirect=true";

	}

	public String telaCosmetico() {

		return "cosmeticos.xhtml?faces-redirect=true";

	}

}
