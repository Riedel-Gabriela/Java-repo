package CondicionaisSimples;
import java.util.Scanner;
public class Exercicio2_ParOuImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int number = scan.nextInt();

        scan.close();

        if (number %2 == 0) {
            System.out.printf("o número %d é par.\n", number);
        } else {
            System.out.printf("o número %d é ímpar.\n", number);
        }
    }
}
