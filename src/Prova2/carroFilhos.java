package Prova2;
import java.util.Scanner;

public class carroFilhos {
    public static void main(String[] args) {
        int numerofilhos;
        String f1, campo, filhos;
        Scanner scan = new Scanner(System.in);
        System.out.println("Possui filhos? ");
        filhos = scan.nextLine();

        if (filhos.equals("sim")) {
            System.out.println("Possui quantos filhos? ");
            numerofilhos = scan.nextInt();
            if (numerofilhos > 3) {
                System.out.println("Minivan");
            } else {
                System.out.println("SUV");
            }
        } else if (filhos.equals("não")) {
            System.out.println("Assiste fórmula 1? ");
            f1 = scan.nextLine();
            if (f1.equals("sim")) {
                System.out.println("Esportivo");
            } else {
                System.out.println("Gosta de campo? ");
                campo = scan.nextLine();
                if (campo.equals("sim")) {
                    System.out.println("Offroad");
                } else {
                    System.out.println("Sedã");
                }
            }
        } else {
            throw new Error("Unexpected value: " + filhos);
        }
    }
}
