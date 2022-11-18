package empresa;

public abstract class Pessoa {
	private String nome;
	
	public abstract boolean validarDocumento();
	
	public abstract int calcularIdade();
	

	
	@Override
	public String toString() {
		return "Pessoa [nome =" + nome + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
