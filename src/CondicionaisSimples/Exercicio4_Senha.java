package CondicionaisSimples;
import java.util.Scanner;
public class Exercicio4_Senha {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a senha: ");

        String senha_input = scan.nextLine();

        scan.close();

        String senha = "pleiades";

        if (senha_input.equals(senha)) {
            System.out.println("Acesso liberado.");
        } else {
            System.out.println("Acesso negado.");
        }
    }
}
