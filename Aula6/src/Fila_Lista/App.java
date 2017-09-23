/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fila_Lista;

import java.util.Scanner;
/**
 *
 * @author Leonardo Cesca
 */
public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Fila_Linked fila = new Fila_Linked();
        String msg = "1 - Adiciona\n2 - Remove\n3 - Exibe\n9 - Sair";
        int opc, e;

        do {
            System.out.println(msg);
            opc = leitor.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("Elemento: ");
                    e = leitor.nextInt();
                    fila.adiciona(e);
                    break;
                case 2:
                    System.out.println("Removido: " + fila.remove());
                    break;
                case 3:
                    fila.exibe();
                    break;
            }
        } while (opc != 9);
    }
}
