/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha_Encadeada;

/**
 *
 * @author Leonardo Cesca
 */
public class Pilha {

    private No inicio;

    public class No {

        public No prox;
        public int dado;

        public No(int dado) {
            prox = null;
            this.dado = dado;
        }
    }

    public Pilha() {
        inicio = null;
    }

    public boolean vazia() {
        return inicio == null;
    }

    public void adiciona(int e) {
        No novo = new No(e);
        novo.prox = inicio;
        inicio = novo;
    }

    public int remove() {
        int r = -1;

        if (vazia()) {
            System.err.println("Erro! A pilha está vazia.");
        } else {
            r = inicio.dado;
            inicio = inicio.prox;
        }

        return r;
    }

    public void exibe() {
        if (vazia()) {
            System.err.println("Erro! A lista está vazia.");
        } else {
            No aux = inicio;
            System.out.println("Pilha: ");
            while (aux != null) {
                System.out.printf("|%d|\n", aux.dado);
                aux = aux.prox;
            }
        }
    }
}
