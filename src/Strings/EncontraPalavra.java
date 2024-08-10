package Strings;

import java.util.Scanner;

public class EncontraPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o input de dados: ");
        String palavra = scanner.nextLine();

        scanner.close();
        // Procura a palavra "cotação=" e retorna o index.
        int pos1 = palavra.indexOf("cotaçao=");
        // Caso haja essa palavra na entrada do teclado, ele devolve um index diferente de -1, caso não tenha, retorna -1.
        if (pos1 != -1) {
            String valor;
            // Procura o que há entre cotação e o ";" logo em seguida. Perceba que começa no "pos1".
            int pos2 = palavra.indexOf(";", pos1);
            if (pos2 != -1) {
                valor = palavra.substring(pos1 + 8, pos2);
            } else {
                valor = palavra.substring(pos1 + 8);
            }
            System.out.println(valor);
        }
    }
}
