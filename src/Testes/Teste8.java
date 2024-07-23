package Testes;

import java.util.Scanner;

public class Teste8 {
    public static void main(String[] args) {
        //mostre todos os números múltiplos de X menores ou iguais a N
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite os números X e N, sendo X <= N: ");
        int n = scan.nextInt();
        int x = scan.nextInt();

        scan.close();

        int contador = n;

        while (contador <= x) {
            if (contador % n == 0) {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}
