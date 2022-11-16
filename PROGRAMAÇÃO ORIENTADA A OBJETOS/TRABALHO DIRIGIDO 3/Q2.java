import java.util.*;

class Autor {

	String n;
	String atua;

}

class DVD {

	Autor nome = new Autor();
	String titulo;
	int codigo;
	int ano;
	String genero;
	float valor;
	String gravadora;

}

public class Q2{

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
            int n;

            System.out.printf("Digite quando DVD's deseja cadastrar: ");
            n = input.nextInt();

            DVD[] vet = new DVD[n];

            for (int i = 0; i < n; i++) {

            	vet[i] = new DVD();
            }

            for (int i = 0; i < n; i++) {

            	System.out.printf("\n______ DIGITE OS DADOS DO DVD %d ______ \n", i + 1);

            	System.out.printf("\nDigite o nome do Autor: ");
            	vet[i].nome.n = input.next();

            	System.out.printf("Digite como o autor atua (solo ou em grupo): ");
            	vet[i].nome.atua = input.next();

            	System.out.printf("Digite o titulo do DVD: ");
            	vet[i].titulo = input.next();

            	System.out.printf("Digite o codigo do DVD: ");
            	vet[i].codigo = input.nextInt();

            	System.out.printf("Digite o ano de lancamento: ");
            	vet[i].ano = input.nextInt();

            	System.out.printf("Digite o genero musical: ");
            	vet[i].genero = input.next();

            	System.out.printf("Digite o valor pago: ");
            	vet[i].valor = input.nextFloat();

            	System.out.printf("Digite a gravadora: ");
            	vet[i].gravadora = input.next();

            }

            for (int i = 0; i < n; i++) {

            	System.out.printf("\n\n______ DADOS DO DVD %d ______ \n", i + 1);

            	System.out.print("\nO nome do autor e: " + vet[i].nome.n);
            	System.out.print("\nO autor atua em: " + vet[i].nome.atua);
            	System.out.print("\nO titulo do DVD e: " + vet[i].titulo);
            	System.out.print("\nO codigo do DVD e: " + vet[i].codigo);
            	System.out.print("\nO ano de lancamento e: " + vet[i].ano);
            	System.out.print("\nO genero musical e: " + vet[i].genero);
            	System.out.print("\nO valor pago foi: " + vet[i].valor);
            	System.out.print("\nA gravadora e: " + vet[i].gravadora + "\n");

            }

            int[] cont = new int[n];
            int conta = 0;
            int contador = 0;

            for (int i = 0; i < n; i++) {
            	for (int j = i + 1; j < n; j++) {

            		if (vet[i].ano == vet[j].ano) {
            			cont[i]++;
            			if (cont[i] > conta) {
            				conta = cont[i];
            				contador = i;
            			}
            		}

            	}
            	cont[i] = 0;
            }

            System.out.printf("\n\nO ano com maior lancamento de dvd foi: %d ", vet[contador].ano);

            float caro = vet[0].valor;
            float barato = vet[0].valor;
            int m = 0, j = 0;

            for (int i = 0; i < n; i++) {

            	if (n > 1) {

            		if (vet[i].valor > caro) {
            			caro = vet[i].valor;
            			m = i;
            		}

            		if (vet[i].valor < barato) {
            			barato = vet[i].valor;
            			j = i;
            		}

            	} else {
            		System.out.print("\n\nO DVD mais caro foi: " + vet[i].titulo);
            	}
            }

            System.out.print("\n\nO DVD mais caro foi: " + vet[m].titulo);
            System.out.print("\nO DVD mais barato foi: " + vet[j].titulo);
            
            float valorTotal = 0;
            
            for (int i = 0; i < n; i ++) {
            	valorTotal += vet[i].valor;
            }
            
            System.out.printf("\n\nO valor total dos DVD's e: %.2f", valorTotal);
            
            int p = 0;

            for (int i = 0; i < n; i++) {
            	for (int j1 = i + 1; j1 < n; j1++) {

            		if (vet[i].genero.equals(vet[j].genero)) {
            			p = i;
            		}
            	}
            }

            System.out.printf("\n\nO genero preferido do usuario e: %s \n\n", vet[p].genero);
            
            for(int i = 0; i < n; i++) {
            	if(vet[i].nome.atua.equals("solo") || vet[i].nome.atua.equals("Solo") || vet[i].nome.atua.equals("SOLO")) {
            		System.out.printf("O autor do DVD %s segue carreira solo.\n", vet[i].titulo);
            	}
            }
        }

	}

}
