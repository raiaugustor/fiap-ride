package br.com.fiapride.model;

public class Viagem {
    private String destino;
    private double valor;

    private Passageiro solicitante;
    private Veiculo veiculoUtilizado;

    public Viagem(String destino, Passageiro solicitante, Veiculo veiculoUtilizado) {
        this.destino = destino;
        this.solicitante = solicitante;
        this.veiculoUtilizado = veiculoUtilizado;
        this.valor = 0.0;

        System.out.println("Nova viagem solicitada para: " + this.destino);
    }

    public void exibirResumo() {
        System.out.println("\n--- RESUMO DA VIAGEM ---");
        System.out.println("Destino: " + this.destino);
        System.out.println("Passageiro: " + this.solicitante.getNome());
        System.out.println("Veículo: " + this.veiculoUtilizado.getModelo() + "Placa: " + this.veiculoUtilizado.getPlaca());
        System.out.println("-----------------\n");
    }

    public String getDestino() {
        return this.destino;
    }
    public Passageiro getSolicitante() {
        return this.solicitante;
    }
    public Veiculo getVeiculoUtilizado() {
        return this.veiculoUtilizado;
    }

}
