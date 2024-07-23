package Prova2;
import java.util.Scanner;

public class referenciaABNT {
    public static void main(String[] args) {
        String autor, titulo, revista, localDePublicacao, numeroVolume, paginaInit, paginaFin, mes, ano;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o autor: ");
        autor = entrada.nextLine();
        System.out.println("Digite o titulo: ");
        titulo = entrada.nextLine();
        System.out.println("Digite o revista: ");
        revista = entrada.nextLine();
        System.out.println("Digite o local de publicação: ");
        localDePublicacao = entrada.nextLine();
        System.out.println("Digite o número do volume: ");
        numeroVolume = entrada.nextLine();
        System.out.println("Digite a página inicial: ");
        paginaInit = entrada.nextLine();
        System.out.println("Digite a página final: ");
        paginaFin = entrada.nextLine();
        System.out.println("Digite o mês por extenso: ");
        mes = entrada.nextLine();
        System.out.println("Digite o ano: ");
        ano = entrada.nextLine();

        entrada.close();

        //SOBRENOME, Nome abreviado. Título do artigo. Título da Revista, Local de publicação, número do volume, páginas inicial-final, mês e ano.

        String[] arrayNomeCompleto = autor.split(" ");
        String nome = arrayNomeCompleto[0].substring(0, 1).toUpperCase();
        String sobrenome = arrayNomeCompleto[1].toUpperCase();
        System.out.printf("%s, %s. %s, %s, %s, n.%s, p.%s-%s, %s de %s.", sobrenome, nome, titulo, revista, localDePublicacao, numeroVolume, paginaInit, paginaFin, mes, ano);
    }
}
