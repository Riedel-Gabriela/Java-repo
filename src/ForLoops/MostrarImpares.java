package ForLoops;

import java.util.Scanner;

public class MostrarImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int number = scan.nextInt();

        scan.close();

        for(int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
