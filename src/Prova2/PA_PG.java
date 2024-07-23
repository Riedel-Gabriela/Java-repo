package Prova2;
import java.util.Scanner;

public class PA_PG {
    public static void main(String[] args) {
        double  a1, n, r;
        // fórmula PA: an = a1 + (n - 1) * r
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro termo da PA: ");
        a1 = input.nextInt();
        System.out.print("Digite a razão da PA: ");
        r = input.nextInt();
        System.out.print("Digite o termo que você quer ver: ");
        n = input.nextInt();

        input.close();

        double somaPA = (n*(2*a1+(n-1)*r)/2);
        int termoPA = (int) (a1+(n-1)*r);

        System.out.println("Soma PA: " + somaPA + "\n" + n +"º termo da PA: " + termoPA);
    }
}