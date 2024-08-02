package Methods;

import java.util.Scanner;

public class VerificaNegativoPositivo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        double valor = entrada.nextDouble();

        entrada.close();

        System.out.println(verifica_sinal(valor));

    }

    public static String verifica_sinal(double valor) {
        if (valor < 0) {
            return "Negativo";
        } else if (valor > 0) {
            return "Positivo";
        } else {
            return "Zero";
        }
    }
}
