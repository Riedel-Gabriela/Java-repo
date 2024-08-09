package Methods;

import java.util.Scanner;

public class CalculaMedia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite as notas separadas por espaço: ");
        String[] notas = input.nextLine().split(" ");

        input.close();

        double media = calcula_media(notas);
        System.out.printf("\nMédia aritmética: %.2f\n", media);
    }

    static double calcula_media(String[] notas) {
        double[] notasNumericas = new double[notas.length];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            notasNumericas[i] = Double.parseDouble(notas[i]);
            soma += notasNumericas[i];
        }
        return soma / notasNumericas.length;
    }
}
