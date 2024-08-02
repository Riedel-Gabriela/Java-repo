package Testes;

import java.util.Scanner;

public class Teste9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comando_usuario;

        boolean executando = true;

        while (executando) {
            System.out.print("> ");
             comando_usuario = sc.nextLine().toLowerCase();

            String[] comandos_validos = {"execute", "ajuda", "mostre", "liste", "remova", "copie", "renomeie", "filtre", "ordene", "bloqueie", "historico", "info", "sair", "limpe", "desligue"}
                    ;

            if (comando_usuario.equals("sair")) {
                executando = false;
                break;
            }

            boolean flag = false;
            for (int i = 0; i < comandos_validos.length; i++) {
                if (comando_usuario.equals(comandos_validos[i])) {
                    flag = true;
                }
            }
            if (flag) {
                System.out.println(comando_usuario + " executado");
            } else {
                System.out.println(comando_usuario + " inválido");
            }
        }
    }
}