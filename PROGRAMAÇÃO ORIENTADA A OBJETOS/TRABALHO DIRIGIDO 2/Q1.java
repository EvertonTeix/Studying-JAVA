import java.util.Scanner;

public class Q1 {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtracao(int a, int b) {
        return a - b;
    }

    public static int multiplicacao(int a, int b) {
        return a * b;
    }

    public static int divisao(int a, int b) {
        return a / b;
    }

public static void main(String[] args) {
    
    try (Scanner entrada = new Scanner(System.in)) {
        
        int x;
        int y;
        String simbolo;

        System.out.println("\n____MENU____\n\n1 - SOMAR " + "(+)"+ "\n2 - SUBTRAIR " + "(-)" + "\n3 - MULTIPLICAR " + "(*)" + "\n4 -DIVIDIR " + "(/)");
        System.out.print("\nDigite o simbolo da operacao que voce deseja: ");
        simbolo = entrada.next();

            if (simbolo.equals("+") || simbolo.equals("-") || simbolo.equals("*") || simbolo.equals("/")) {

            System.out.print("Digite o primeiro número: ");
            x = entrada.nextInt();

            System.out.print("Digite o segundo número: ");
            y = entrada.nextInt();
            
                if (simbolo.equals("+")) {

                int resultado = soma(x, y);
                System.out.println("Resultado da sua soma é: " + resultado);

                } else if (simbolo.equals("-")) {
                int resultado = subtracao(x, y);
                System.out.println("Resultado da sua subtração é: " + resultado);

                } else if (simbolo.equals("*")) {
                int resultado = multiplicacao(x, y);
                System.out.println("Resultado da sua multiplicação é: " + resultado);

                } else if (simbolo.equals("/")) {

                    if (y != 0) {
                        
                    int resultado = divisao(x, y);
                    System.out.println("Resultado da sua divisão é: " + resultado);

                    } else {
                    System.out.println("Não se pode dividir por 0!");
                    }
                }
            } else {

                System.out.println("Operador Inválido!");
            }
    }

    }
}
