package br.com.fiapride.main;

import br.com.fiapride.main.Computador;

public class TesteMeuObjeto {
    public static void main(String[] args) {
        Computador C1 = new Computador();

        C1.setCor("Preto");
        System.out.println(C1.getCor());
    }
}
