package Methods;

import java.util.Scanner;

public class TempoDecorrido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o momento inicial [DD:HH:MM:SS]: ");
        String[] momentoInicial = scan.nextLine().split(":");


        System.out.println("Digite o momento final [DD:HH:MM:SS]: ");
        String[] momentoFinal = scan.nextLine().split(":");

        scan.close();

        int segundosTotaisMomento1 = calculaSegundosTotais(momentoInicial);
        int segundosTotaisMomento2 = calculaSegundosTotais(momentoFinal);

        String tempoDecorrido = tempoDecorrido(segundosTotaisMomento1, segundosTotaisMomento2);
        System.out.println(tempoDecorrido);
    }
    static int calculaSegundosTotais(String[] vetorMomento) {
        int d, h, m, s;
        d = Integer.parseInt(vetorMomento[0]);
        h = Integer.parseInt(vetorMomento[1]);
        m = Integer.parseInt(vetorMomento[2]);
        s = Integer.parseInt(vetorMomento[3]);
        //transforma tudo em segundos
        d = d * 86400;
        h = h * 3600;
        m = m * 60;
        int segundosTotais = s + m + h + d;

        return segundosTotais;
    }
    static String tempoDecorrido(int segundosTotaisMomento1, int segundosTotaisMomento2) {
        int dDecorridos, hDecorridas, mDecorridos, sDecorridos;

        //Diferença de dias
        int tempoDecorrido = segundosTotaisMomento2 - segundosTotaisMomento1;

        dDecorridos = Math.floorDiv(tempoDecorrido, 86400);
        hDecorridas = Math.floorDiv((tempoDecorrido % 86400), 3600);
        mDecorridos = Math.floorDiv((hDecorridas % 3600), 60);
        sDecorridos = mDecorridos % 60;

        String resultado = String.format("Tempo Decorrido: %02d %02d:%02d:%02d", dDecorridos, hDecorridas, mDecorridos, sDecorridos);

        return resultado;
    }
}
