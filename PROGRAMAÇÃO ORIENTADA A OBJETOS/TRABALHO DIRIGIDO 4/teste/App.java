package teste;

import empresa.Funcionario;
import empresa.OperacaoFuncionario;
import java.text.SimpleDateFormat;
import java.util.*;

public class App {

	public static void main(String[] args) {
		
		GregorianCalendar data1 = new GregorianCalendar();
		GregorianCalendar data2 = new GregorianCalendar();
		GregorianCalendar data21 = new GregorianCalendar();
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

		try (Scanner input = new Scanner(System.in)) {

			int d, e;

			System.out.print("Digite quantos funcionarios deseja cadastrar: ");
			d = input.nextInt();

			Funcionario[] vet = new Funcionario[d];

			for (int i = 0; i < d; i++) {

				vet[i] = new Funcionario();
			}

			System.out.print(
					"Deseja cadastrar a data de admissao dos funcionarios de acordo com o SO? (1 - SIM ou 2 - NAO) : ");
			e = input.nextInt();

			input.nextLine();

			if (e == 1) {
				for (int i = 0; i < d; i++) {

					System.out.printf("\n______ DIGITE OS DADOS DO FUNCIONARIO %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f');

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia = input.nextInt();
					int mes = input.nextInt();
					int ano = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0;
					mes--;

					data1.set(ano, mes, dia);

					vet[i].setIdade(vet[i].converterDataNas(dia, mes, ano));
					
					vet[i].setNome(nome);
					vet[i].setCPF(cpf);
					vet[i].setSexo(sexo);
					vet[i].setDatadeNascimento(data1);
					vet[i].setSalarioBruto(salario);
					
					System.out.println(vet[i].toString());
					
					
					input.nextLine();
				}
			} else if (e == 2) {

				for (int i = 0; i < d; i++) {

					System.out.printf("\n______ DIGITE OS DADOS DO FUNCIONARIO %d ______\n\n", i + 1);

					System.out.printf("Digite o nome: ");
					String nome = input.nextLine();

					System.out.printf("Digite o CPF: ");
					String cpf = input.next();

					System.out.printf("Digite a data de admissao (separado por espaco): ");
					int di = input.nextInt();
					int m = input.nextInt();
					int a = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0.
					m--;

					data2.set(a, m, di);

					vet[i].setDatadeAdmissao(data2);

					vet[i] = new Funcionario(cpf, nome, data2);

					char sexo;

					do {

						System.out.printf("Digite o sexo (F/M): ");
						sexo = input.next().charAt(0);

					} while (sexo != 'M' && sexo != 'F' && sexo != 'm' && sexo != 'f' );

					System.out.printf("Digite o salario: ");
					double salario = input.nextDouble();

					System.out.printf("Digite a data de nascimento (separado por espaco): ");
					int dia1 = input.nextInt();
					int mes1 = input.nextInt();
					int ano1 = input.nextInt();

					// como o gregorian começa com mês 0, se o usuário digitar 1, irá ser 0.
					mes1--;

					data21.set(ano1, mes1, dia1);

					vet[i].setIdade(vet[i].converterDataNas(dia1, mes1, ano1));

					vet[i].setSexo(sexo);
					vet[i].setSalarioBruto(salario);
					vet[i].setDatadeNascimento(data21);

					System.out.println(vet[i].toString());
					input.nextLine();
				}
			}

			OperacaoFuncionario.dadosValidos(vet);
			OperacaoFuncionario.quantidadeSexo(vet);
			OperacaoFuncionario.maiorMenor(vet);
			OperacaoFuncionario.maisVelhoNovo(vet);

			System.out.println("\n");
			
			
			for (int i = 0; i < d; i++) {
				for (int j = i + 1; j < d; j++) {

					if (vet[i].equals(vet[j])) {
						System.out.println("\nFuncionario " + (i + 1) + " e o mesmo que " + (j + 1));
					}
				}
			}
		}
	}
}
