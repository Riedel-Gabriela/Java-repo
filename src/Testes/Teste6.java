package Testes;
import java.util.Scanner;

public class Teste6 {
    public static void main(String[] args) {
        String data;
        int mes, ano;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o mês e o ano separados por barra: ");

        data = scan.nextLine();

        scan.close();

        if (data.contains("/")) {
            String[] array = data.split("/");
            mes = Integer.parseInt(array[0]);
            ano = Integer.parseInt(array[1]);
            if (mes > 0 && mes <= 12) {
                if (ano >= 2020) {
                    System.out.printf("%02d/%04d", mes, ano);
                } else {
                    System.out.println("Ano inválido!");
                }
            } else {
                System.out.println("Mês inválido!");
            }
        } else {
            System.out.println("Separador inválido!");
        }
    }
}
