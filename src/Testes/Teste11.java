package Testes;

import java.util.Arrays;
import java.util.Scanner;

public class Teste11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite conjunto 1: ");
        String[] conjunto1 = sc.nextLine().toLowerCase().split(",");
        System.out.println("Digite conjunto 2: ");
        String[] conjunto2 = sc.nextLine().toLowerCase().split(",");

        sc.close();


        if(compara_conjuntos(conjunto1, conjunto2)) {
            System.out.println("Resultado: IGUAIS");
        } else {
            System.out.println("Resultado: DIFERENTES");
        }


    }
    static boolean compara_conjuntos(String[] conjunto1, String[] conjunto2) {
        Arrays.sort(conjunto1);
        Arrays.sort(conjunto2);

        boolean flag = false;

        for(int i = 0; i < conjunto1.length; i++) {
            flag = conjunto1[i].equals(conjunto2[i]);
        }
        return flag;
    }
}
