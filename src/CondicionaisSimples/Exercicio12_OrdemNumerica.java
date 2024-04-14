package CondicionaisSimples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Exercicio12_OrdemNumerica {
    public static void main(String[] args) {
        int n1, n2, n3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite três números separados por espaço: ");

        n1 = scan.nextInt();
        n2 = scan.nextInt();
        n3 = scan.nextInt();

        scan.close();

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(n1);
        numeros.add(n2);
        numeros.add(n3);

        Collections.sort(numeros);
        for (Integer i: numeros) {
            System.out.print(i + " ");
        }
    }
}
