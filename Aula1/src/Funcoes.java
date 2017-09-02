/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leonardo Cesca
 */
public class Funcoes {

    public int f2(int n) {
        int r = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                r = r + 1;
            }
        }
        return r;
    }

    public int f4(int n) {
        int r = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < 2 * i; j++) {
                for (int k = i; k < j; k++) {
                    r = r + 1;
                }
            }
        }
        return r;
    }

}
