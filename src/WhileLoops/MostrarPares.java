package WhileLoops;

import java.util.Scanner;

public class MostrarPares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int number = scan.nextInt();

        scan.close();

        int contador = 1;

        while (contador <= number) {
            if (contador % 2 == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}
