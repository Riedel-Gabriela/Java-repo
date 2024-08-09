package Methods;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a sequência de numeros separada por espaço: ");
        String[] sequencia = scanner.nextLine().split(" ");

        scanner.close();

        int[] numeros = new int[sequencia.length];

        for (int i = 0; i < sequencia.length; i++) {
            numeros[i] = Integer.parseInt(sequencia[i]);
        }

        int maior = maior(numeros);
        System.out.println(maior);

    }

    static int maior(int[] numeros){
        int maior = Integer.MIN_VALUE;
        for (int numero : numeros) {
            if (numero > maior) {
                maior = numero;
            }
        }
        return maior;
    }
}
