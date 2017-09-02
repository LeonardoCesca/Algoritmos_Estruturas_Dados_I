/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17180277
 */
public class App {

    public static void main(String[] args) {
        Funcoes f = new Funcoes();
        for (int n = 0; n < 200; n += 10) {
            int r = f.fd(n);
            System.out.println(n + ";" + r);
        }
    }
}
