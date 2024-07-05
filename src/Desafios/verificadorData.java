package Desafios;
import java.util.Scanner;

public class verificadorData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data: ");

        String data = scan.nextLine();

        scan.close();

        int dia = Integer.parseInt(data.substring(0,2));
        String mes = data.substring(3,5);
        int ano = Integer.parseInt(data.substring(6,10));

        switch (mes) {
            case "01", "03", "05", "07", "08", "10", "12":
                if ( dia < 0 || dia > 31) {
                    System.out.println("Data inválida.");
                }
                break;
            case "02":
                if ( dia < 0 || dia > 29) {
                    System.out.println("Data inválida.");
                }
                break;
            case "04", "06", "09", "11":
                if ( dia < 0 || dia > 30) {
                    System.out.println("Data inválida.");
                }
                break;
            default:
                throw new IllegalStateException("Data inválida.");
        }
    }
}
