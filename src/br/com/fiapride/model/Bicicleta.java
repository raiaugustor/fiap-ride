package br.com.fiapride.model;

public class Bicicleta extends Veiculo{
    private int marcha;

    public Bicicleta(String placa, String modelo, int marcha) {
        super(placa, modelo);
        this.marcha = marcha;
    }

    @Override
    public void exibirTipo() {
        System.out.println("Sou uma bicicleta");
    }
}
