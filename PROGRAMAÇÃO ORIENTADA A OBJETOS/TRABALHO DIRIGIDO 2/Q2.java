import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int n;

            System.out.print("Digite a quantidade de elementos que você deseja: ");
            n = input.nextInt();

            int vet[] = new int[n];

            for (int i = 0; i < n; i++) {

                System.out.printf("Digite o %d número: ", i + 1);
                vet[i] = input.nextInt();

            }

            int pares = 0, impares = 0, positivos = 0, negativos = 0, neutros = 0;

            for (int i = 0; i < n; i++) {

                if (vet[i] % 2 == 0) {
                    pares++;

                }  else if ((vet[i] % 2 != 0) && (vet[i] != 0)) {
                    impares++;
                    
                } 
                
                if (vet[i] > 0) {
                    positivos++;

                } else if (vet[i] < 0) {
                    negativos++;

                } else {
                    neutros++;
                }
            }

            System.out.print("\nNo array tem " + pares + " números pares!");
            System.out.print("\nNo array tem " + impares + " números impares!");
            System.out.print("\nNo array tem " + positivos + " números positivos!");
            System.out.print("\nNo array tem " + negativos + " números negativos!");
            System.out.print("\nNo array tem " + neutros + " números neutros!");
            
        }
    }
}
