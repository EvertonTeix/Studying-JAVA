import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            int h1, h2, m1, m2, minutos = 0;

            System.out.print("Digite a hora atual: ex.:(02 35) ");
            h1 = input.nextInt();
            m1 = input.nextInt();

            System.out.print("Digite o horario que deseja que o alarme toque: ");
            h2 = input.nextInt();
            m2 = input.nextInt();

            if ((h1 >= 0 && h1 <= 23) && (m1 >= 0 && m1 <= 59) && (h2>= 0 && h2 <= 23) && (m2 >= 0 && m2 <= 59)) {
                if ((h1 > h2) || (h1 == h2 && m1 > m2)) {
                    h2 = h2 + 24;
                }

            minutos = (h2 * 60 + m2) - (h1 * 60 + m1);

            System.out.printf("\nVoce tem %d minutos para descansar!", minutos);
            
            } else {
            System.out.print("NUMERO INVALIDO");
            }
        }
    }
}

