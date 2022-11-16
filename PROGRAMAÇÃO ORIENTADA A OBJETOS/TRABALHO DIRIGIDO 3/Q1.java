import java.util.*;

class ContaLuz {

	int codigodaConta;
	int quantKW;
	float valor;
	String pago;
	int diaLeitura;
	int mesLeitura;
	int anoLeitura;
	int diaVencimento;
	int mesVencimento;
	int anoVencimento;
	int diaPagamento;
	int mesPagamento;
	int anoPagamento;
	
}

public class Q1 {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			int n;

			System.out.print("Digite a quantidade de contas que deseja cadastrar: ");
			n = input.nextInt();

			ContaLuz vet[] = new ContaLuz[n];

			for (int i = 0; i < n; i++) {
				vet[i] = new ContaLuz();
			}

			for (int i = 0; i < n; i++) {

				System.out.printf("\nDigite o codigo da conta %d: ", i + 1);
				vet[i].codigodaConta = input.nextInt();

				do {

					System.out.printf("Digite data de leitura da conta %d (Separado por espaco): ", i + 1);
					vet[i].diaLeitura = input.nextInt();
					vet[i].mesLeitura = input.nextInt();
					vet[i].anoLeitura = input.nextInt();

				} while ((vet[i].diaLeitura > 31) && (vet[i].mesLeitura > 12));

				System.out.printf("Digite a quantidade de KW da conta %d: ", i + 1);
				vet[i].quantKW = input.nextInt();

				System.out.printf("Digite o preco da conta %d: ", i + 1);
				vet[i].valor = input.nextFloat();

				do {

					System.out.printf("Digite data de vencimento da conta %d (Separado por espaco): ", i + 1);
					vet[i].diaVencimento = input.nextInt();
					vet[i].mesVencimento = input.nextInt();
					vet[i].anoVencimento = input.nextInt();

				} while ((vet[i].diaVencimento > 31) && (vet[i].mesVencimento > 12));

				System.out.printf("Digite se a conta foi paga ou nao (Sim ou Nao): ");
				vet[i].pago = input.next();

				if (vet[i].pago.equals("Sim") || vet[i].pago.equals("SIM") || vet[i].pago.equals("sim")) {

					do {
						System.out.printf("Digite a data de pagamento da conta %d (Separado por espaco): ", i + 1);
						vet[i].diaPagamento = input.nextInt();
						vet[i].mesPagamento = input.nextInt();
						vet[i].anoPagamento = input.nextInt();

					} while ((vet[i].diaPagamento > 31) && (vet[i].mesPagamento > 12));

				}
			}

			for (int i = 0; i < n; i++) {
				
				System.out.printf("\n\n_____ Informacoes da conta %d _____\n", i + 1);
				
				System.out.printf("\nCodigo: " + vet[i].codigodaConta);
				System.out.printf("\nData de leitura: " + vet[i].diaLeitura + "/" + vet[i].mesLeitura + "/" + vet[i].anoLeitura);
				System.out.printf("\nQuantidade de KW: " + vet[i].quantKW);
				System.out.printf("\nPreco: " + vet[i].valor);
				System.out.printf("\nData de vencimento: " + vet[i].diaVencimento + "/" + vet[i].mesVencimento + "/"+ vet[i].anoVencimento);
				System.out.printf("\nA conta foi paga? ");

				if (vet[i].pago.equals("Sim") || vet[i].pago.equals("SIM") || vet[i].pago.equals("sim")) {
					System.out.printf("Sim.\n");
					System.out.printf("Data de pagamento: " + vet[i].diaPagamento + "/" + vet[i].mesPagamento + "/"+ vet[i].anoPagamento + "\n");
				} else {
					System.out.printf("Nao.\n");
				}
			}

			int maiorC = vet[0].quantKW, menorConsumo = vet[0].quantKW;
			int m = 0, men = 0;

			for (int i = 0; i < n; i++) {

				if (n > 1) {

					if (vet[i].quantKW >= maiorC) {
						
						maiorC = vet[i].quantKW;
						m = i;
						
						
					}if (vet[i].quantKW < menorConsumo) {

						menorConsumo = vet[i].quantKW;
						men = i;
						
					}

				} else {
					System.out.print("\n\nO mes de maior consumo foi o mes: " + vet[i].mesLeitura);
				}
			}

			System.out.print("\nO mes de maior consumo foi o mes " + vet[m].mesLeitura + " referente a conta: " + (m + 1));
			System.out.print("\nO mes de menor consumo foi o mes " + vet[men].mesLeitura + " referente a conta: " + (men + 1));

			float media = 0;
			float soma = 0;

			for (int i = 0; i < n; i++) {
				soma += vet[i].quantKW;
				media = soma / n;
			}

			System.out.print("\n\nA media de consumo foi de " + media + " KW\n\n");

			for (int i = 0; i < n; i++) {

				if (vet[i].pago.equals("Nao") || vet[i].pago.equals("NAO") || vet[i].pago.equals("nao")) {
					System.out.print("A conta " + vet[i].codigodaConta + " nao foi paga.\n");
				}

				if (vet[i].pago.equals("Sim") || vet[i].pago.equals("SIM") || vet[i].pago.equals("sim")) {

					if ((vet[i].diaPagamento <= vet[i].diaVencimento && vet[i].mesPagamento <= vet[i].mesVencimento)
							|| (vet[i].diaPagamento > vet[i].diaLeitura && vet[i].mesPagamento < vet[i].mesVencimento)) {
						if (vet[i].mesPagamento <= vet[i].mesVencimento && vet[i].mesPagamento >= vet[i].mesLeitura) {
							if (vet[i].anoPagamento == vet[i].anoVencimento) {
								System.out.print("A conta " + vet[i].codigodaConta
										+ " foi paga antes ou ate o dia do vencimento. \n");
							}
						}
					}

					else if (vet[i].diaPagamento > vet[i].diaVencimento && vet[i].mesPagamento >= vet[i].mesVencimento) {
						if (vet[i].anoPagamento >= vet[i].anoVencimento) {
							System.out.print("A conta " + vet[i].codigodaConta + " foi paga depois do vencimento. \n");
						}
					}
				}
			}
		}
	}
}

