package br.com.fiapride.main;

import br.com.fiapride.main.Computador;

public class TesteMeuObjeto {
    public static void main(String[] args) {
        System.out.println("--- Teste do Meu Projeto Pessoal ---");

        Computador computadorFiap = new Computador();

        computadorFiap.cor = "Preto";
        computadorFiap.marca = "Dell";

        System.out.println("Cor da garrafa: " + computadorFiap.cor);
        System.out.println("Capacidade: " + computadorFiap.marca);
    }
}
