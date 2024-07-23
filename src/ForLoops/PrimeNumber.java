package ForLoops;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        scan.close();

        boolean flag = false;
        for (int i= 2; i <= num / 2; i++) {
            // condição para não primos
            if (num % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " é um número primo.");
        else
            System.out.println(num + " não é um número primo.");
    }
}