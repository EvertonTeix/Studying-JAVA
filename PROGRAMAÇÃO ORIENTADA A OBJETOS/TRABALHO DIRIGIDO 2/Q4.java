import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String senha;

            do {

                System.out.printf("\nDigite a senha: ");
                senha = input.next();
                
                if (senha.equals("a76dk09")) {

                    System.out.printf("ACESSO PERMITIDO!");

                } else {

                    System.err.printf("ACESSO NEGADO.");
                    
                }

            } while(!"a76dk09".equals(senha));
            
        }

    }
}
