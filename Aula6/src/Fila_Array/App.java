/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila_Array;

import java.util.Scanner;

/**
 *
 * @author Leonardo Cesca
 */
public class App {

    public static void main(String[] args) {
        Fila fila;
        Scanner leitor = new Scanner(System.in);
        int opc, e, pos, removido, c;
        String msg = "1 - Adiciona\n"
                + "2 - Remove\n"
                + "3 - Obtém o Primeiro\n"
                + "4 - Obtém o Último\n"
                + "5 - Exibe Fila\n"
                + "9 - Sair\n\n";

        System.out.print("Tamanho da fila: ");
        c = leitor.nextInt();
        fila = new Fila(c);

        do {
            System.out.println(msg);
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("\nInforme o elemento: ");
                    e = leitor.nextInt();
                    fila.adiciona(e);
                    break;
                case 2:
                    removido = fila.remove();
                    System.out.println("Elemento removido: " + removido);
                    break;
                case 3:
                    System.out.println("\nPrimeiro: " + fila.obtemPrimeiro());
                    break;
                case 4:
                    System.out.println("\nÚltimo: " + fila.obtemUltimo());
                    break;
                case 5:
                    fila.exibe();
            }
        } while (opc != 9);
    }
}
