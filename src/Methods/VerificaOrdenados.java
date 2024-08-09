package Methods;

import java.util.Scanner;

public class VerificaOrdenados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a sequencia numérica separada por espaços: ");
        String[] sequencia = entrada.nextLine().split(" ");

        entrada.close();

        double[] numeros = converte_linha(sequencia);

        boolean ordenado = ordenado(numeros);
        if (ordenado) {
            System.out.println("Ordenado");
        } else {
            System.out.println("Desordenado");
        }


    }

    static double[] converte_linha(String[] sequencia) {
        double[] numeros = new double[sequencia.length];
        for (int i = 0; i < sequencia.length; i++) {
            numeros[i] = Double.parseDouble(sequencia[i]);
        }
        return numeros;
    }

    static boolean ordenado(double[] numeros) {
        for(int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
