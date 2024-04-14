package CondicionaisSimples;
import java.util.Scanner;
public class Exercicio6_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n1, n2, n3, media;
        System.out.print("Digite a nota A1: ");
        n1 = scan.nextDouble();
        System.out.print("Digite a nota A2: ");
        n2 = scan.nextDouble();
        System.out.print("Digite a nota A3: ");
        n3 = scan.nextDouble();

        scan.close();

        media = ((2*n1)+(4*n2)+(4*n3))/10.0;

        if (media >= 6.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
