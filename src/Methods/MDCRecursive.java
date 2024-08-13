package Methods;

import java.util.Scanner;

public class MDCRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois números para obter o MDC separados por espaço: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int MDC = MDC(a, b);
        System.out.println(MDC);


    }
    static int MDC(int a, int b) {
        if (b == 0) return a;
        return (MDC(b, a % b));
    }
}
