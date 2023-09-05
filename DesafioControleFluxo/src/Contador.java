import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();

            contar(numero1, numero2);
        } catch (InputMismatchException e) {
            System.out.println("Entrada do terminal não é um número inteiro");
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 0; i < (numero2-numero1); i++) {
                System.out.println("Contagem n°" + (i+1));
            }
        }
    }
}
