package Strings;

import java.util.Scanner;

public class Exercicio1_Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();

        scanner.close();

        palavra = palavra.toUpperCase();

        System.out.printf("Em maiúscula: %s", palavra);
        System.out.printf("\n%s tem %d caracteres", palavra, palavra.length());

        if(palavra.startsWith("IF")) {
            System.out.print("\nInicia com IF");
        }
        if(palavra.endsWith("SC")) {
            System.out.print("\nTermina com SC");
        }

    }
}
