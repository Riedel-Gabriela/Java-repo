package OperadoresLogicos;
import java.util.Scanner;

public class Exercicio7_PesoIdeal {
    public static void main(String[] args) {
        double peso, altura;
        String sexo;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a altura em centímetros: ");
        altura = scan.nextDouble();
        System.out.print("Digite o sexo M (masculino) ou F (feminino): ");
        sexo = scan.next().toUpperCase();

        scan.close();

        if (sexo.equals("M")) {
            peso = 52 + (0.75 * (altura - 152.4));
            System.out.println("Peso ideal: " + peso);
        } else if (sexo.equals("F")) {
            peso = 52 + (0.67 *(altura - 152.4));
            System.out.println("Peso ideal: " + peso);
        } else {
            System.out.println("Valores incorretos, tente novamente.");
        }
    }
}
