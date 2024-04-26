package Testes;

import java.util.Scanner;

public class Teste5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do setor: ");
        String setor = scan.next();
        System.out.println("Digite o total arrecadado com taxa de serviço no mês: ");
        double total = scan.nextDouble();

        scan.close();

        switch (setor.toUpperCase()) {
            case "RECEPÇÃO":
                System.out.printf("Valor recebido por funcionário: %.2f\n", (total*0.25)/6);
                break;
            case "BAR E RESTAURANTE":
                System.out.printf("Valor recebido por funcionário: %.2f\n", (total*0.25)/8);
                break;
            case "COZINHA":
                System.out.printf("Valor recebido por funcionário: %.2f\n", (total*0.2)/5);
                break;
            case "MANUTENÇÃO":
                System.out.printf("Valor recebido por funcionário: %.2f\n", (total*0.1)/2);
                break;
            case "CAMAREIRAS":
                System.out.printf("Valor recebido por funcionário: %.2f\n", (total*0.1)/6);
                break;
            case "SEGURANÇA":
                System.out.printf("Valor recebido por funcionário: %.2f\n", (total*0.1)/4);
                break;

        }


    }
}
