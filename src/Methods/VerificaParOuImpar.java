package Methods;

import java.util.Scanner;

public class VerificaParOuImpar {
    public static String par_ou_impar(int num) {
        if (num % 2 == 0) {
            return "par";
        } else {
            return "ímpar";
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        entrada.close();

        System.out.print(par_ou_impar(num));

    }
}
