package ForLoops;

import java.util.Scanner;

public class IniciaisMaiusculas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome completo: ");
        String nome = entrada.nextLine();
        entrada.close();

        String novoNome = "";
        boolean space = true;

        for (int i = 0; i < nome.length(); i++) {
            char c = nome.charAt(i);
            if (c != ' ' && space) {
                c = Character.toUpperCase(c);
            }
            space = (c == ' ');
            novoNome += c;
        }
        System.out.println(novoNome);
    }
}
