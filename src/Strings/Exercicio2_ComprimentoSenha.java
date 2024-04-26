package Strings;

import java.util.Scanner;

public class Exercicio2_ComprimentoSenha {
    public static void main(String[] args) {
        String senhaCadastrada, senhaConferencia;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a senha: ");
        senhaCadastrada = scan.next();
        System.out.println("Digite a senha novamente: ");
        senhaConferencia = scan.next();

        scan.close();

        if (senhaCadastrada.length() >= 8) {
            if (senhaCadastrada.equals(senhaConferencia)) {
                System.out.println("Senha cadastrada.");
            } else {
                System.out.println("Senhas não conferem.");
            }
        } else {
            System.out.println("A senha não possui 8 caracteres.");
        }
    }
}
