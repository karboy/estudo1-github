package entidades;

public class _90Classe {
	
	private String nome;
	private String email;
	
	public _90Classe(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return nome + ", " + email;
	}
}
