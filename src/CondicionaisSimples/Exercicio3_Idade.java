package CondicionaisSimples;
import java.util.Scanner;
public class Exercicio3_Idade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a sua idade: ");

        int number = scan.nextInt();

        scan.close();

        if (number >= 18) {
            System.out.print("Acesso liberado.");
        } else {
            System.out.print("Acesso negado.");
        }
    }
}
