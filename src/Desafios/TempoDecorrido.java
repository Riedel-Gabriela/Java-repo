package Desafios;
import java.util.Scanner;

public class TempoDecorrido {
    public static void main(String[] args) {
        int d1, h1, m1, s1, d2, h2, m2, s2;
        int dDecorridos, hDecorridas, mDecorridos, sDecorridos;
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o momento inicial: ");
        d1 = scan.nextInt();
        h1 = scan.nextInt();
        m1 = scan.nextInt();
        s1 = scan.nextInt();

        System.out.println("Digite o momento final: ");
        d2 = scan.nextInt();
        h2 = scan.nextInt();
        m2 = scan.nextInt();
        s2 = scan.nextInt();

        scan.close();

        //transforma tudo em segundos
        d1 = d1 * 86400;
        h1 = h1 * 3600;
        m1 = m1 * 60;
        int segundosTotaisMomento1 = s1 + m1 + h1 + d1;

        d2 = d2 * 86400;
        h2 = h2 * 3600;
        m2 = m2 * 60;
        int segundosTotaisMomento2 = s2 + m2 + h2 + d2;

        //Diferença de dias
        int tempoDecorrido = segundosTotaisMomento2 - segundosTotaisMomento1;

        dDecorridos = Math.floorDiv(tempoDecorrido, 86400);
        hDecorridas = Math.floorDiv((tempoDecorrido % 86400), 3600);
        mDecorridos = Math.floorDiv((int) (hDecorridas % 3600), 60);
        sDecorridos = mDecorridos % 60;

        System.out.printf("Tempo Decorrido: %02d %02d:%02d:%02d", dDecorridos, hDecorridas, mDecorridos, sDecorridos);
    }
}
