package Prova2;
import java.util.Scanner;

public class escalaBeaufort {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a velocidade do vento, em km/h: ");
        int vento = entrada.nextInt();

        entrada.close();

        if (vento < 2) {
            System.out.println("Grau 0: Calmaria");
        } else if (vento <= 5) {
            System.out.println("Grau 1: Bafagem");
        } else if (vento <= 11) {
            System.out.println("Grau 2: Aragem");
        } else if (vento <= 19) {
            System.out.println("Grau 3: Fraco");
        } else if (vento <= 28) {
            System.out.println("Grau 4: Moderado");
        } else if (vento <= 38) {
            System.out.println("Grau 5: Fresco");
        } else if (vento <= 49) {
            System.out.println("Grau 6: Muito fresco");
        } else if (vento <= 61) {
            System.out.println("Grau 7: Forte");
        } else if (vento <= 74) {
            System.out.println("Grau 8: Muito forte");
        } else if (vento <= 88) {
            System.out.println("Grau 9: Ventania forte");
        } else if (vento <= 102) {
            System.out.println("Grau 10: Tempestade");
        } else if (vento <= 117) {
            System.out.println("Grau 11: Tempestuoso");
        } else {
            System.out.println("Grau 12: Furacão");
        }
    }
}