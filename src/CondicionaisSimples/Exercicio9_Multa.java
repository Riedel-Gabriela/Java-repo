package CondicionaisSimples;

import java.util.Scanner;

class Exercicio9_Multa {
    public static void main(String[] args) {
        int velocidade_limite, velocidade_veiculo;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a velocidade limite: ");
        velocidade_limite = scan.nextInt();

        System.out.print("Digite a velocidade do veículo: ");
        velocidade_veiculo = scan.nextInt();

        scan.close();

        if (velocidade_veiculo > velocidade_limite*1.5) {
            System.out.print("Infração GRAVÍSSIMA\nCondicionaisSimples.Multa: R$880,41\nPontos na CNH: 07 (sete)\n");
        } else if (velocidade_veiculo > velocidade_limite*1.2) {
            System.out.print("Infração GRAVE\nCondicionaisSimples.Multa: R$195,23\nPontos na CNH: 05 (cinco)\n");
        } else if (velocidade_veiculo > velocidade_limite) {
            System.out.print("Infração MÉDIA\nCondicionaisSimples.Multa: R$130,16\nPontos na CNH: 04 (quatro)\n");
        }
    }
}
