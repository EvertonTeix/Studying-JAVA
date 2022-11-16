import java.util.Scanner;

class Contatos {

	String nome;
	int telefone;
	String email;
	
	public Contatos(String nome, int telefone, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}
}

class Agenda {

	public static void inserirContato(Contatos contato[], Contatos conta) {
		for (int i = 0; i < contato.length; i++) {
			if (contato[i] == null) {
				contato[i] = conta;
				System.out.println("O contato de [" + contato[i].nome + "] foi inserido com sucesso.");
				break;
			}
		}
	}

	public static void pesquisarContato(Contatos contato[], String n) {
		for (int i = 0; i < contato.length; i++) {
			if ((contato[i].nome).equals(n)) {

				System.out.println("Dados do contato: ");
				System.out.println("Nome: " + contato[i].nome);
				System.out.println("Numero: " + contato[i].telefone);
				System.out.println("Email: " + contato[i].email);
				break;
			}
		}
	}

	public static void apagarContato(Contatos contato[], String n) {

		for (int i = 0; i < contato.length; i++) {
			if (contato[i] == null) {
				System.out.println("Contato inexistente");
				break;
			}
			if ((contato[i].nome).equals(n)) {
				contato[i] = null;
				System.out.println("Contato deletado");

				for (int g = i; g < contato.length - 1; g++) {
					contato[g] = contato[g + 1];
				}

				break;
			}
		}
	}

	public static void atualizarContato(Contatos contato[], String nome, String num, String email) {
		for (int i = 0; i < contato.length; i++) {
			if (contato[i] == null) {

				System.out.println("Contato inexistente.");
				break;
			}
			if ((contato[i].nome).equals(nome)) {

				contato[i].nome = num;
				contato[i].nome = email;

				System.out.println("Contato atualizado.");

				break;
			}
		}
	}

}

public class Q3 {

	public static void main(String[] args) {
		Contatos a[] = new Contatos[100];

		try (Scanner input = new Scanner(System.in)) {
			int j, k, contador = 0;

			do {
				System.out.println("\n_______ MENU _______\n");
				System.out.println("1 - INSERIR");
				System.out.println("2 - PROCURAR");
				System.out.println("3 - REMOVER");
				System.out.println("4 - ATUALIZAR");
				System.out.println("5 - VER LISTA DE CONTATOS\n");

				System.out.print("Digite a opcao que deseja: ");
				k = input.nextInt();

				if (k == 1) {

					System.out.print("\nDigite o nome do contato: ");
					String nome = input.next();

					System.out.print("Digite o email: ");
					String email = input.next();
					
					System.out.print("Digite o numero: ");
					int telefone = input.nextInt();

					Contatos cont = new Contatos(nome, telefone, email);

					Agenda.inserirContato(a, cont);
					
					contador++;

				} else if (k == 2) {

					System.out.print("Digite o nome do contato que deseja pesquisar: ");
					String nome = input.next();

					Agenda.pesquisarContato(a, nome);

				} else if (k == 3) {

					System.out.print("Digite o contato que deseja deletado: ");
					String nome = input.next();

					Agenda.apagarContato(a, nome);
					
					contador --;

				} else if (k == 4) {

					System.out.print("Nome do contato a ser atualizado: ");
					String nome = input.next();

					System.out.print("Digite um novo numero: ");
					String num = input.next();

					System.out.print("Digite um novo email: ");
					String email = input.next();

					Agenda.atualizarContato(a, nome, num, email);
					
				} else if (k == 5) {
					
					System.out.println("\n__________VOCE DESEJA VER__________ \n\n1 - LISTA SO COM NOMES\n2 - LISTA COMPLETA\n");
					System.out.print("\nDigite a opcao: ");
					int l = input.nextInt();

						for (int i = 0; i < contador; i++) {
							
							if (l == 1) {
							System.out.printf("%d - ", i+1);
							System.out.println(a[i].nome);
						
							
						}if (l == 2) {

								System.out.printf("\n\n_____ CONTATO %d _____\n", i+1);

								System.out.printf("\nNome: %s", a[i].nome);
								System.out.printf("\nTelefone: %d", a[i].telefone);
								System.out.printf("\nEmail: %s", a[i].email);
								
							}
						
						
					}
					
				}
				
				System.out.print("\n\nDeseja fazer mais alguma coisa? 1 - SIM ou 2 - NAO ");
				j = input.nextInt();

			} while (j == 1);

		}

	}
}

