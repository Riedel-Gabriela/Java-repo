package CondicionaisSimples;

import java.util.Scanner;

class Exercicio11_Diagnostico {
    public static void main(String[] args) {
        int pressao_sistolica;
        double idade;
        String sinus_taquicardia;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite a idade do paciente: ");
        idade = scan.nextInt();

        System.out.print("Digite a pressão sistólica do paciente: ");
        pressao_sistolica = scan.nextInt();

        System.out.print("Há presença de sinus-taquicardia? ");
        sinus_taquicardia = scan.next();

        scan.close();

        if (pressao_sistolica < 91) {
            System.out.print("URGENTE");
        } else if (idade < 62.5) {
            System.out.print("NORMAL");
        } else if (sinus_taquicardia.equals("sim")) {
            System.out.print("URGENTE");
        } else {
            System.out.print("NORMAL");
        }
    }
}
