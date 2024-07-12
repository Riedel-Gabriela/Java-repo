package WhileLoops;

import java.util.Scanner;

public class PG {
    public static void main(String[] args) {
        int a1, n, q, k, an;
        // fórmula PG: an = a1*q^(n-1)
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a razão da PG: ");
        q = input.nextInt();
        System.out.print("Digite o primeiro termo da PG: ");
        a1 = input.nextInt();
        System.out.print("Digite o a quantidade de termos que você quer ver: ");
        n = input.nextInt();

        input.close();

        k = 1;

        while (k <= n) {
            an = (int) (a1 * Math.pow(q, (k - 1)));
            System.out.print(an + " ");
            k++;
        }
    }
}