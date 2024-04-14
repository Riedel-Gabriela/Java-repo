package CondicionaisSimples;

import java.util.Scanner;

public class Exercicio14_ImpostoImovel {
    public static void main(String[] args) {
        double adquirido, valorVenda, comissao, lucro, aliquota1, aliquota2, aliquota3, aliquota4;
        String venda;

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do imóvel adquirido: ");
        adquirido = scan.nextDouble();

        System.out.print("Digite o valor de venda do imóvel: ");
        valorVenda = scan.nextDouble();

        System.out.print("Este imóvel será vendido em até 180 dias? ");
        venda = scan.next();

        lucro = valorVenda - adquirido;

        comissao = valorVenda*0.06;

        if (venda.equals("não")) {
            if (lucro - comissao <= 5000000) {
                aliquota1 = (lucro - comissao)*0.15;
                System.out.printf("IR: %.2f\n", aliquota1);
            } else if (lucro - comissao <= 10000000) {
                aliquota1 = 5000000*0.15;
                aliquota2 = (lucro - comissao - 5000000)*0.175;
                System.out.printf("IR: %.2f\n", aliquota1+aliquota2);
            } else if (lucro - comissao <= 30000000) {
                aliquota1 = 5000000*0.15;
                aliquota2 = 5000000*0.175;
                aliquota3 = (lucro - comissao - 10000000)*0.20;
                System.out.printf("IR: %.2f\n", aliquota1+aliquota2+aliquota3);
            } else if (lucro - comissao > 30000000) {
                aliquota1 = 5000000*0.15;
                aliquota2 = 5000000*0.175;
                aliquota3 = 20000000*0.20;
                aliquota4 = (lucro - comissao - 30000000)*0.225;
                System.out.printf("IR: %.2f\n", aliquota1+aliquota2+aliquota3+aliquota4);
            }
        } else {
            System.out.println("Isento de IR.");
        }
    }
}
