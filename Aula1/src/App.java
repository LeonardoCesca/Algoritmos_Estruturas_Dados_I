/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Cesca
 */
public class App {

    public static void main(String[] args) {
        Funcoes f = new Funcoes();
        for (int n = 1; n < 200; n += 10) {
            int r = f.f4(n);
            System.out.println(n + ":" + r);
        }
    }
}
