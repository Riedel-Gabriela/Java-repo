package Testes;

import java.util.Scanner;

public class Teste10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Notas: ");
        String notas_string = sc.nextLine();

        sc.close();

        String[] notas_vetor = notas_string.strip().split(",");

        double[] notas_vetor_inteiros = new double[notas_vetor.length];

        for (int i = 0; i < notas_vetor.length; i++) {
            notas_vetor_inteiros[i] = Double.parseDouble(notas_vetor[i]);
        }

        double soma = 0;
        double maior_nota = 0;
        double menor_nota = 10;

        for (double notas: notas_vetor_inteiros) {
            soma += notas;
            if (notas > maior_nota) {
                maior_nota = notas;
            }
            if (notas < menor_nota) {
                menor_nota = notas;
            }
        }

        double media = soma / notas_vetor_inteiros.length;

        System.out.printf("%.2f/%.2f/%.2f", media, menor_nota, maior_nota);
    }
}
