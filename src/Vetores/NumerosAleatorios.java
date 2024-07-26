package Vetores;

public class NumerosAleatorios {
    public static void main(String[] args) {
        long[] vetor = new long[5];

        int n = 0;

        while(n <= 4) {
            long numero = 1 + Math.round(9*Math.random());
            boolean unico = true;
            for (int i = 0; unico && i < n; i++) {
                unico = (vetor[i] != numero);
            }
            if (unico) {
                vetor[n] = numero;
                n++;
            }
        }
        System.out.println(vetor[0]+" "+vetor[1]+" "+vetor[2]+" "+vetor[3]+" "+vetor[4]);
    }
}
