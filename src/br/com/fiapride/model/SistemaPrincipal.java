package br.com.fiapride.model;

import br.com.fiapride.model.Passageiro;
import br.com.fiapride.model.Viagem;
import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("--- Iniciando o Sistema FiapRide --- \n");

        Passageiro ana = new Passageiro("Ana Silva", "222.222.222-22");
        Veiculo carroDoJoao = new Veiculo("ABC-1234", "Toyota Corolla0");

        Viagem viagemDaAna = new Viagem("Avenida Paulista, 1000", ana, carroDoJoao);

        viagemDaAna.exibirResumo();

        ana.adicionarSaldo(50.0);

        System.out.println("Saldo da ana consultado ATRAVÉS da viagem: R$: " + viagemDaAna.getSolicitante().getSaldo());
    }
}