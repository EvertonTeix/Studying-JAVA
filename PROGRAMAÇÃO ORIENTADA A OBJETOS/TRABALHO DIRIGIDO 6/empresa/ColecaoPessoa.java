package empresa;

import java.util.Arrays;

public class ColecaoPessoa implements Colecao {
	private Pessoa[] dados = new Pessoa[100];
	private int posicaoCorrente = 0;

	@Override
	public boolean inserir(Pessoa p) {
		for(int i = 0; i < dados.length; i++) {
			if(this.dados[i] == null) {
				this.dados[i] = p;
				this.posicaoCorrente +=1;
				return true;
			}
		}
			
			return false;
	}

	@Override
	public boolean remover() {
		
		for(int g = dados.length - 1; g >= 0; g--) {
			if(this.dados[g] != null) {
				this.dados[g] = null;
				System.out.println("Pessoa " + g + " removida.");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean remover(int indice) {
		if(this.dados!= null) {
			this.dados[indice] = null;
			System.out.println("\nPessoa " + indice + " removida!");
			return true;
		}
		
		System.out.println("\nPessoa " + indice + " e nulo");
		return false;
		
	}

	@Override
	public void atualizar(int indice, Pessoa p) {
		this.dados[indice] = p;
	}

	@Override
	public boolean pesquisar(Pessoa p) {
		for(int i = 0; i < dados.length; i++) {
			if(this.dados[i] != null && this.dados[i].equals(p)) {
				System.out.println(p);
				return true;
			}
		}
		
		System.out.println("\nNao esta na colecao.");
		return false;
		
	}

	@Override
	public boolean colecaoEstaVazia() {
		for(int i = 0; i < dados.length; i++) {
			if(this.dados[i] != null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public void imprimirDadosColecao() {
		
		for(int i = 0; i < dados.length; i++) {
			if(this.dados[i] != null) {
				System.out.println(this.dados[i]);
				
			}
		}

	}
	
	@Override
	public String toString() {
		return "ColecaoPessoa [dados =" + Arrays.toString(dados) + ", posicaoCorrente =" + posicaoCorrente + "]";
	}

	@Override
	public Pessoa retornarObjeto(int indice) {
			return this.dados[indice];
	}

	public Pessoa[] getDados() {
		return dados;
	}

	public void setDados(Pessoa[] dados) {
		this.dados = dados;
	}

	public int getPosicaoCorrente() {
		return posicaoCorrente;
	}

	public void setPosicaoCorrente(int posicaoCorrente) {
		this.posicaoCorrente = posicaoCorrente;
	}

}
