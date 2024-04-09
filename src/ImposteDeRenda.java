import java.util.Scanner;

public class ImposteDeRenda {
    public static void main(String[] args) {
        double salario, imposto;
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o valor do seu salário: ");

        salario = scan.nextDouble();

        scan.close();

        if (salario > 4664.68) {
            imposto = salario*0.275;
            System.out.printf("IRPF: R$%.2f\n", imposto);
        } else if (salario > 3751.06) {
            imposto = salario*0.225;
            System.out.printf("IRPF: R$%.2f\n", imposto);
        } else if (salario > 2826.66) {
            imposto = salario*0.015;
            System.out.printf("IRPF: R$%.2f\n", imposto);
        } else if (salario > 2259.21) {
            imposto = salario*0.075;
            System.out.printf("IRPF: R$%.2f\n", imposto);
        } else {
            System.out.println("IRPF: R$0.00");
        }
    }
}