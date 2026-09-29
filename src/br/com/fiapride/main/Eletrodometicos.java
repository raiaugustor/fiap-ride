package br.com.fiapride.main;

public class Eletrodometicos {

    private String marca;
    private String categoria;

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public Eletrodometicos(String marca, String categoria){
        this.categoria = categoria;
        this.marca = marca;
    }

}
