package OperadoresLogicos;
import java.util.Scanner;

public class Exercicio1_Diagnostico {
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
         if (pressao_sistolica > 91) {
             System.out.print("URGENTE");
         } else if (pressao_sistolica < 91 && idade > 62.5 && sinus_taquicardia.equals("sim")) {
             System.out.print("URGENTE");
         } else {
             System.out.print("NORMAL");
         }
    }
}
