package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio3_OrdenandoNumeros {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite três números inteiros separados por espaço: ");
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        scan.close();

        if (n1 > n2 && n2 > n3) {
            System.out.printf("%d %d %d", n3, n2, n1);
        } else if (n3 > n2 && n2 > n1) {
            System.out.printf("%d %d %d", n1, n2, n3);
        } else if (n2 > n1 && n1 > n3) {
            System.out.printf("%d %d %d", n2, n1, n3);
        } else if (n2 > n3 && n3 > n1) {
            System.out.printf("%d %d %d", n2, n3, n1);
        } else if(n3 > n1 && n1 > n2) {
            System.out.printf("%d %d %d", n3, n1, n2);
        } else if (n1 > n3 && n3 > n2) {
            System.out.printf("%d %d %d", n1, n3, n2);
        }
    }
}
