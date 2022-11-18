package empresa;

import java.util.*;

public class App {

	public static void main(String[] args) {
					
			ColecaoPessoa vet = new ColecaoPessoa();
			
			PessoaFisica p1 = new PessoaFisica();
			PessoaFisica p2 = new PessoaFisica();
			PessoaJuridica pj1 = new PessoaJuridica();
			PessoaJuridica pj2 = new PessoaJuridica();
			
			p1.setNome("Eerton Teixeira");
			p1.setCPF("000-000-000-00");
			GregorianCalendar data = new GregorianCalendar(2004, 7, 12);
			p1.setDataNascimento(data);
			
			p2.setNome("Everton");
			p2.setCPF("000-000-000-00");
			GregorianCalendar data2 = new GregorianCalendar(2000, 8, 19);
			p2.setDataNascimento(data2);
			
			pj1.setNome("E&A");
			pj1.setCNPJ("11-22-333-333/4444");
			GregorianCalendar data3 = new GregorianCalendar(2020, 5, 22);
			pj1.setDataCriacao(data3);
			
			pj2.setNome("RRSOTRE");
			pj2.setCNPJ("11-22-333-333/4444");
			GregorianCalendar data4 = new GregorianCalendar(2019, 0, 7);
			pj2.setDataCriacao(data4);
			
			vet.inserir(p1);
			vet.inserir(p2);
			vet.inserir(pj1);
			vet.inserir(pj2);
			
			System.out.println("\nAs pessoas fisicas sao iguais? " + p1.equals(p2) );
			System.out.println("As pessoas juridicas sao iguais? " + pj1.equals(pj2));
			
			System.out.println("\n");
			vet.imprimirDadosColecao();
			
			vet.atualizar(0, pj2);
			
			System.out.println("\n");
			vet.imprimirDadosColecao();
			
			System.out.println("\n");
			vet.pesquisar(p2);
			
			System.out.println("\nColecao esta vazia? "+vet.colecaoEstaVazia());
			
			System.out.println("Retornando objeto: " + vet.retornarObjeto(2));
			
			System.out.println("\n");
			
			vet.remover();
			vet.remover(0);
			
			System.out.println("\n");
			vet.imprimirDadosColecao();
			
			vet.remover(1);
			vet.remover(2);
			
			System.out.println("\nColecao esta vazia? "+vet.colecaoEstaVazia());
		
	}
}
