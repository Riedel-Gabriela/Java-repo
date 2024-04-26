package Strings;

import java.util.Scanner;

public class Exercicio4_VerificaSenha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu senha: ");
        String senha = scan.next();

        scan.close();

        if (!senha.isBlank()) {
            if (senha.equals("bacurau")) {
                System.out.println("Senha aceita.");
            } else {
                System.out.println("Senha incorreta.");
            }
        } else {
            System.out.println("Senha não informada.");
        }
    }
}
