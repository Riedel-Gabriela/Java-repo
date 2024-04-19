package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio9_CalculadoraSwitchCase {
    public static void main(String[] args) {
        double valor1, valor2, resultado=0;
        String operador;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = scan.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor2 = scan.nextDouble();
        System.out.println("Digite o operador: ");
        operador = scan.next();

        scan.close();

        switch (operador) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "/":
                resultado = valor1 / valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            default:
                System.out.printf("Digite um operador válido.");
                break;
        }

        System.out.printf("Primeiro valor: %.1f\nSegundo valor: %.1f\nOperador: %s\n\nResultado: %.1f + %.1f = %.1f\n", valor1, valor2, operador, valor1, valor2, resultado);

    }
}
