package CondicionaisSimples;

import java.util.Scanner;

class Exercicio13_CalculadoraSimples {
    public static void main(String[] args) {
        double valor1, valor2, resultado;
        String operador;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.print("Digite o operador: ");
        operador = scan.next();

        scan.close();

        if (operador.equals("+")) {
            resultado = valor1 + valor2;
            System.out.printf("Resultado: %.1f %s %.1f = %.1f", valor1, operador, valor2, resultado);
        } else if (operador.equals("-")) {
            resultado = valor1 - valor2;
            System.out.printf("Resultado: %.1f %s %.1f = %.1f", valor1, operador, valor2, resultado);
        } else if (operador.equals("/")) {
            resultado = valor1 / valor2;
            System.out.printf("Resultado: %.1f %s %.1f = %.1f", valor1, operador, valor2, resultado);
        } else if (operador.equals("*")) {
            resultado = valor1 * valor2;
            System.out.printf("Resultado: %.1f %s %.1f = %.1f", valor1, operador, valor2, resultado);
        } else {
            System.out.print("Digite um operador válido.");
        }
    }
}
