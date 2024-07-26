package ForLoops;

import java.util.Scanner;

public class MDC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número: ");
        int n = sc.nextInt();
        System.out.println("Número: ");
        int m = sc.nextInt();

        sc.close();

        for (; m != 0;) {
            int resto = n % m;
            n = m;
            m = resto;
        }
        System.out.println("MDC = " + n);

    }
}
