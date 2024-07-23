package Vetores;

import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite cinco números inteiros: ");
        int[] vector = new int[5];
        int i;

        entrada.close();

        for (i = 0; i < vector.length; i++) {
            vector[i] = entrada.nextInt();
        }

        for (i--; i >= 0; i--) {
            System.out.printf("%d", vector[i]);
        }
    }
}
