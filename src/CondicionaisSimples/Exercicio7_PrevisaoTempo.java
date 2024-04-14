package CondicionaisSimples;
import java.util.Scanner;
public class Exercicio7_PrevisaoTempo {
    public static void main(String[] args) {
        String termometro, barometro, subindo, baixando, estacionario;

        Scanner scan = new Scanner(System.in);

        System.out.print("Termômetro: ");
        termometro = scan.nextLine();

        System.out.print("Barômetro: ");
        barometro = scan.nextLine();

        scan.close();

        estacionario = "estacionario";
        baixando = "baixando";
        subindo = "subindo";

        if (termometro.equals(subindo)) {
            if (barometro.equals(subindo)){
                System.out.println("Tempo bom, ventos quentes e secos.");
            } else if (barometro.equals(estacionario)) {
                System.out.println("Tempo mudando para bom, ventos de leste.");
            } else if (barometro.equals(baixando)) {
                System.out.println("Tempo instável, aproximação de frente.");
            }
        } else if (termometro.equals(estacionario)) {
            if (barometro.equals(subindo)){
                System.out.println("Tempo bom, ventos de leste frescos.");
            } else if (barometro.equals(estacionario)) {
                System.out.println("Tempo incerto, ventos variáveis.");
            } else if (barometro.equals(baixando)) {
                System.out.println("Frente quente com chuvas prováveis.");
            }
        } else if (termometro.equals(baixando)) {
            if (barometro.equals(subindo)){
                System.out.println("Tempo bom, ventos de sul a sudeste.");
            } else if (barometro.equals(estacionario)) {
                System.out.println("Chuva provável, ventos de sul a sudeste.");
            } else if (barometro.equals(baixando)) {
                System.out.println("Chuvas abundantes, ventos de sul a sudoeste fortes.");
            }
        }
    }
}
