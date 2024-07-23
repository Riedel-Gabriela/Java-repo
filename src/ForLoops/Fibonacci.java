package ForLoops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite quantos números da sequência gostaria de ver: ");
        int n = input.nextInt();

        input.close();

        //fn = f(n-1) + f(n-2);
        //f1 = 0, f2 = 1

        int f1 = 0, f2 = 1, f3;
        for (int i = 1; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            System.out.printf("%d ", f3);
        }
    }
}
