package CondicionaisSimples;
import java.util.Scanner;
public class Exercicio1_SinalNumerico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");

        int number = scan.nextInt();

        scan.close();

        if (number > 0) {
            System.out.printf("o número %d é positivo.", number);
        } else if (number < 0) {
            System.out.printf("o número %d é negativo.", number);
        } else {
            System.out.printf("o número %d é igual a zero.\n", number);
        }
    }
}
