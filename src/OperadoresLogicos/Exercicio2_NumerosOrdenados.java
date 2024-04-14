package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio2_NumerosOrdenados {
    public static void main(String[] args) {
        int n1, n2, n3, n4;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite quatro números inteiros separados por espaço: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();
        n4 = scan.nextInt();

        scan.close();

        if (n1 > n2 && n2 > n3 && n3 > n4 || n4 > n3 && n3 > n2 && n2 > n1) {
            System.out.println("ORDENADOS");
        } else {
            System.out.println("DESORDENADOS");
        }
    }
}
