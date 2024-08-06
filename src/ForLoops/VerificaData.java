package ForLoops;

import java.util.Scanner;

public class VerificaData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a data: ");
        String data = input.nextLine();

        input.close();


        String[] valores_data = data.split("/");
        for (String s : valores_data) {
            System.out.println(s);
        }

        int dia = Integer.parseInt(valores_data[0]);
        int mes = Integer.parseInt(valores_data[1]);
        int ano = Integer.parseInt(valores_data[2]);

        if (dia < 1 || dia > 31) {
            System.out.println("Data invalida");
        } else if (mes < 1 || mes > 12) {
            System.out.println("Data invalida");
        } else if (valores_data[2].length() != 4) {
            System.out.println("Data invalida");
        } else {
            switch (valores_data[1]) {
                case "01", "03", "05", "07", "08", "10", "12":
                    if ( dia > 0 && dia < 32) {
                        System.out.printf("%02d/%02d/%02d", dia, mes, ano);
                    }
                    break;
                case "02":
                    if ( dia > 0 && dia < 30) {
                        System.out.printf("%02d/%02d/%02d", dia, mes, ano);
                    }
                    break;
                case "04", "06", "09", "11":
                    if ( dia > 0 && dia < 31) {
                        System.out.printf("%02d/%02d/%02d", dia, mes, ano);
                    }
                    break;
                default:
                    throw new IllegalStateException("Data inválida.");
            }
        }
    }
}
