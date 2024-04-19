package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio8_DiaUtil {
    public static void main(String[] args) {
        int dia;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dia da semana (domingo = 1, ..., sábado = 7): ");
        dia = scan.nextInt();

        scan.close();

        if (dia == 1 || dia == 7) {
            System.out.println("Fim de semana!");
        } else if (dia == 2 || dia == 3 || dia == 4 || dia == 5 || dia == 6) {
            System.out.println("Dia útil!");
        } else {
            System.out.println("Valor inválido, tente novamente.");
        }
    }
}
