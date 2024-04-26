package Testes;

import java.util.Scanner;

public class Teste4 {
    public static void main(String[] args) {
        int ano;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        ano = scan.nextInt();
        scan.close();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println("BISSEXTO");
        } else {
            System.out.println("NORMAL");
        }
    }
}
