package br.tp1.gabriela.aplication;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

public class Util {
	
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
	public static void redirect(String page) {
		try {
			FacesContext.getCurrentInstance().getExternalContext().redirect(page);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
