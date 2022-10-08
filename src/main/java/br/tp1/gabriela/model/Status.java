package br.tp1.gabriela.model;

public enum Status {
	
	ATIVO(1, "Ativo"),  
	INATIVO(2, "Inativo");

	private int id;
	private String label;
	
	Status(int id, String label) {
		this.id = id;
		this.label = label;
	}
	
	public int getId() {
		return id;
	}
	
	public String getLabel() {
		return label;
		
	}
	
	public static Status valueOf(Integer id) {
		if (id == null)
			return null;
		for (Status perfil : Status.values()) 
			if (perfil.getId() == id) 
				return perfil;
		return null;
	}

}
