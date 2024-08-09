package Methods;

import java.util.Scanner;

public class VerificaNota {
    public static void main(String[] args) {
        String[] notas;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as notas dos 7 testes separados por vírgula:");
        notas = entrada.nextLine().split(",");
        System.out.println("Digite a nota da prova: ");
        double prova = entrada.nextDouble();

        entrada.close();

        int[] k = notas_aluno(notas);
        int W1 = peso1(k);
        int W2 = peso2(k);

        double mediaPonderada = media(W1, W2, prova);

        System.out.println("A média ponderada da unidade é: " + mediaPonderada);

    }

    public static int[] notas_aluno(String[] notas) {
        int[] notas_num = new int[7];

        for(int i = 0; i < notas.length; i++) {
            int nota = Integer.parseInt(notas[i]);
            if (nota >= 6) {
                notas_num[i] = Integer.parseInt(notas[i]);
            }
        }
        return (notas_num);
    }

    public static int peso1(int[] notas) {
        // W1 = 5 + min(5, max(0, N-2-K));
        return (5 + Integer.min(5, Integer.max(0, 5 - notas.length)));
    }

    public static int peso2(int[] notas) {
        // W1 = 5 2 min(5, max(0, N-2-K));
        return (5 - Integer.min(5, Integer.max(0, 5 - notas.length)));
    }

    public static double media(int W1, int W2, double prova) {
        return ((W1*prova + W2*5) / 10);
    }
}
