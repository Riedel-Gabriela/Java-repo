package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio5_AlunoAprovado {
    public static void main(String[] args) {
        double media;
        int horasAula, faltas;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a média semestral do estudante: ");
        media = scan.nextDouble();

        System.out.println("Digite a carga horária total da matéria: ");
        horasAula = scan.nextInt();

        System.out.println("Digite a quantidade de faltas do aluno, em horas/aula: ");
        faltas = scan.nextInt();

        scan.close();

        if ((horasAula*0.75) >= faltas && media >= 6.0) {
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}
