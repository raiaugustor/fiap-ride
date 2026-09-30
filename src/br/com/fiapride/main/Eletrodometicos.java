package br.com.fiapride.main;

public class Eletrodometicos {

    private String marca;
    private String categoria;
    private double bateria;

    //getter e setter marca.
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    //getter e setter categoria.
    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    //Metodo de carregar bateria a partir da quantidade carregada.
    public void carregamento(double quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("A quantidade deve ser positiva");
        }
        this.bateria = Math.min(100.0, this.bateria + quantidade);
    }

    //Metodo de consumir a bateria conforme a quantidade.
    public void descarregar(double quantidade){
        if(quantidade <= 0){
            throw new IllegalArgumentException("A quantidade deve ser positiva");
        }
        this.bateria = Math.min(0.0, this.bateria - quantidade);
    }

    //getter da bateria
    public double getBateria(){
        return bateria;
    }

    //Construtor da classe.
    public Eletrodometicos(String marca, String categoria, double bateriaInicial){
        this.categoria = categoria;
        this.marca = marca;
        this.bateria = bateriaInicial;
    }

}
