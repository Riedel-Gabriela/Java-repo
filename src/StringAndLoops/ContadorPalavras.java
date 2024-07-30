package StringAndLoops;

import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        var frase = scanner.nextLine();
        scanner.close();

        frase = frase.strip();
        // regex para um ou mais espaços em branco: " +"
        String[] palavras = frase.split(" +");
        String nova_frase = String.join(" ", palavras);

        System.out.println(palavras.length);
        System.out.println(nova_frase);
    }
}
