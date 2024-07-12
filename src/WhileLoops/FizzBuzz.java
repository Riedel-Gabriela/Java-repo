package WhileLoops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        input.close();

        int contador = 1;

        while (contador <= num) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (contador % 3 == 0) {
                System.out.print("Fizz ");
            } else if (contador % 5 == 0) {
                System.out.print("Buzz ");
            } else  {
                System.out.print(contador + " ");
            }
            contador++;
        }
    }
}
