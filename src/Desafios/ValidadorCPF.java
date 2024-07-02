package Desafios;
import java.util.Scanner;

public class ValidadorCPF {
    public static void main(String[] args) {
        String cpf;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu CPF: ");
        cpf = scan.nextLine();

        scan.close();

        cpf = cpf.replaceAll("[^\\d]", "");

        if (cpf.length() != 11) {
            System.out.println("CPF invalido");
        } else {
            int d1 = Integer.parseInt(cpf.substring(0, 1));
            int d2 = Integer.parseInt(cpf.substring(1, 2));
            int d3 = Integer.parseInt(cpf.substring(2, 3));
            int d4 = Integer.parseInt(cpf.substring(3, 4));
            int d5 = Integer.parseInt(cpf.substring(4, 5));
            int d6 = Integer.parseInt(cpf.substring(5, 6));
            int d7 = Integer.parseInt(cpf.substring(6, 7));
            int d8 = Integer.parseInt(cpf.substring(7, 8));
            int d9 = Integer.parseInt(cpf.substring(8, 9));
            int d10 = Integer.parseInt(cpf.substring(9, 10));
            int d11 = Integer.parseInt(cpf.substring(10, 11));

            int check1 = d1*10 + d2*9 + d3*8 + d4*7 + d5*6 + d6*5 + d7*4 + d8*3 + d9*2;
            check1 = check1*10 % 11;
            check1 %= 10;

            int check2 = d1*11 + d2*10 + d3*9 + d4*8 + d5*7 + d6*6 + d7*5 + d8*4 + d9*3 + d10*2;
            check2 = check2*10 % 11;
            check2 %= 10;

            if (check1 == d10 && check2 == d11) {
                String cpfFormatado = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-" + cpf.substring(9, 11);
                System.out.println(cpfFormatado);
            } else {
                System.out.println("CPF Invalido");
            }
        }
    }
}
