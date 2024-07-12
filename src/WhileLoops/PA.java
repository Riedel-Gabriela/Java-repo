package WhileLoops;

import java.util.Scanner;

public class PA {
    public static void main(String[] args) {
        int an, a1, n, r, k;
        // fórmula PA: an = a1 + (n - 1) * r
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a razão da PA: ");
        r = input.nextInt();
        System.out.print("Digite o primeiro termo da PA: ");
        a1 = input.nextInt();
        System.out.print("Digite o a quantidade de termos que você quer ver: ");
        n = input.nextInt();

        input.close();

        k = 1;

        while (k <= n) {
            an = a1 + (k - 1) * r;
            System.out.print(an + " ");
            k++;
        }
    }
}
