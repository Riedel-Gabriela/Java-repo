package Matrizes;

import java.util.Scanner;

public class PrevisorDoTempo {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Digite 1 para subindo, 2 para estacionario e 3 para baixando.\nBarômetro: ");
        int barometro = scan.nextInt();
        System.out.println("Digite 1 para subindo, 2 para estacionario e 3 para baixando.\nTermômetro: ");
        int termometro = scan.nextInt();

        scan.close();

        String[][] tempo = {
                {"Tempo bom, ventos quentes e secos.", "Tempo bom, ventos de leste frescos.", "Tempo bom, ventos de sul a sudeste."},
                {"Tempo mudando para bom, ventos de leste.", "Tempo incerto, ventos variáveis.", "Chuva provável, ventos de sul a sudeste."},
                {"Tempo instável, aproximação de frente.", "Frente quente com chuvas prováveis.", "Chuvas abundantes e ventos de sul a sudoeste fortes."}
        };

        System.out.println(tempo[barometro][termometro]);

    }
}
