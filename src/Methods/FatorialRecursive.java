package Methods;

import java.util.Scanner;

public class FatorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int fatorial = fatorial(n);
        System.out.println("Resultado: " + fatorial);

    }

    static int fatorial(int n) {
        // fórmula do fatorial: N! = N.(N-1)!
        if (n == 1 || n == 0) {
            return 1;
        }
        return n*(fatorial(n - 1));
    }
}
