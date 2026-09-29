package br.com.fiapride.main;

public class Computador extends Eletrodometicos{

    private String cor;


    //constructor
    public Computador(String marca, String categoria, String cor){
        super(marca, categoria);
        this.cor = cor;
    }

    //getters
    public String getCor() {
        return cor;
    }

    //setters
    public void setCor(String cor){
        this.cor = cor;
    }

}
