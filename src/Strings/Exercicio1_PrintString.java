package Strings;

import java.util.Scanner;

public class Exercicio1_PrintString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scan.next();

        scan.close();

        String maiuscula = palavra.toUpperCase();
        String inicio = maiuscula.substring(0, 2);
        String fim = maiuscula.substring(maiuscula.length() - 2);

        String igualIF = "não";
        String igualSC = "não";

        if (inicio.equals("IF")) {
            igualIF = "sim";
        }

        if (fim.equals("SC")) {
            igualSC = "sim";
        }

        int caracteres = palavra.length();

        System.out.printf("Número de caracteres: %d\n%s\nInicia com 'IF'? %s\nTermina com 'SC'? %s\n", caracteres, maiuscula, igualIF, igualSC);
    }
}
