/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 17180277
 */
public class Funcoes {

    public int fa(int n) {
        int r = 0;
        for (int i = 0; i < n; i++) {
            r++;

        }
        return r;
    }

    public int fb(int n) {
        int r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                r++;

            }
        }
        return r;
    }

    public int fc(int n) {
        int r = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < 2 * i; j++) {

                r++;
            }
        }
        return r;
    }

    public int fd(int n) {
        int r = 0;
        for (int i = 1; i < n; i = i + i) {
            for (int j = 1; j < n; j = j + j) {

                r++;
            }
        }
        return r;
    }

}
