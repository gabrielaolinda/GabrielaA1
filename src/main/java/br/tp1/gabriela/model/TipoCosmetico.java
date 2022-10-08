package br.tp1.gabriela.model;



public enum TipoCosmetico {
	CREME(1, "Creme"), 
	MAQUIAGEM(2, "Maquiagem"), 
	PROTETOR(3, "Protetor");


	private int id;
	private String label;
	
	TipoCosmetico(int id, String label) {
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
