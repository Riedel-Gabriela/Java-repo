package OperadoresLogicos;

import java.util.Scanner;

public class Exercicio4_SetorFazenda {
    public static void main(String[] args) {
        int x, y;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite as coordenadas da localização: ");
        x = scan.nextInt();
        y = scan.nextInt();

        scan.close();

        if (x >= 0 && x <= 2000) {
            if (y >= 0 && y <= 3000) {
                System.out.print("Setor A");
            } else if (y > 3000 && y <= 6000) {
                System.out.print("Setor B");
            } else if (y > 6000 && y <= 8000) {
                System.out.print("Setor D");
            }
        } else if (x > 2000 && x <= 5000) {
            if (y > 3000 && y <= 5000) {
                System.out.print("Setor C");
            } else if (y > 3000 && y <= 6000) {
                System.out.print("Setor B");
            } else if (y > 6000 && y <= 8000) {
                System.out.print("Setor D");
            }
        } else {
            System.out.println("Pontos fora do mapa.");
        }

    }
}
