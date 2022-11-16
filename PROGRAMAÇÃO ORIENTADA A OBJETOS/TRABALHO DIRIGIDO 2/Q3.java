import java.util.*;

public class Q3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Random elementos = new Random();

            int tam = 0, var = 0;

            System.out.print("Digite o tamanho do array desejado: ");
            tam = entrada.nextInt();

            int vet[] = new int[tam];

            for (int i = 0; i < tam; i++) {
                vet[i] = elementos.nextInt(100);
            }

            System.out.println("\nOs valores do array sao: ");

            for (int i = 0; i < tam; i++) {
                System.out.printf("%d ", vet[i]);
            }

            int maior = vet[0];

            for (int i = 0; i < tam; i++) {

                if (vet[i] > maior) {

                maior = vet[i];
                var = i;

                } else if (vet[i] == maior) {

                    if (i < var) {
                        maior = vet[i];
                        var = i;
                    }
                }
            }

            System.out.printf("\n\nO maior valor e (%d) na posição %d (do array).", maior, var);
        }
        
     }
}
