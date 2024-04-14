package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio6_Aposentadoria {
    public static void main(String[] args) {
        String sexo;
        int idade, contribuicao;
        double mediaSalarial, capitalAplicado, montante, n;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa: ");
        idade = scan.nextInt();

        System.out.println("Digite o tempo de contribuição do candidato: ");
        contribuicao = scan.nextInt();

        System.out.println("Digite a média dos salários de contribuição: ");
        mediaSalarial = scan.nextDouble();

        System.out.println("Digite o sexo da pessoa (M = Masculino, F = Feminino): ");
        sexo = scan.next();

        scan.close();

        if (idade >= 65 && contribuicao >= 15) {
            capitalAplicado = (mediaSalarial*0.6);
            if (sexo.equals("M")) {
                n = contribuicao - 20;
                montante = capitalAplicado*(Math.pow(1.02, n));
                System.out.printf("Deferido R$%.2f\n", montante);
            } else if (sexo.equals("F")) {
                n = contribuicao - 15;
                montante = capitalAplicado*(Math.pow(1.02, n));
                System.out.printf("Deferido R$%.2f\n", montante);
            }
        } else {
            System.out.println("Indeferido.");
        }
    }
}
