import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int n;
            double media = 0, soma = 0, desvio = 0;

            System.out.print("Digite o tamanho do array que você deseja: ");
            n = input.nextInt();

            int v[] = new int[n];
            
            for (int i = 0; i < n; i++) {

                System.out.printf("Digite o %d valor do array: ", i+ 1);
                v[i] = input.nextInt();
            }
            for (int i = 0; i < n; i++) {
                soma = soma + v[i];
                media = soma / n;
            }

            System.out.printf("\nA media e: %.2f", media);

            double varia = 0;
            double ve = 0;

            for (int i = 0; i < n; i++) {
                ve = v[i] - media;
                varia += Math.pow(ve, 2);
                
            }
            desvio = Math.sqrt(varia / n);
            System.out.printf("\n\nO desvio e: %.2f", desvio);

        }
    }
}
