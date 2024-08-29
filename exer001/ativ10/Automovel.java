package ativ10;

class Automovel {
    String tipoVeiculo;
    String placaVeiculo;
    String corVeiculo;

    void reabastecer() {
        System.out.println("O veículo " + tipoVeiculo + " de placa " + placaVeiculo + " foi abastecido.");
    }

    void realizarLavagem() {
        System.out.println("O veículo " + tipoVeiculo + " de placa " + placaVeiculo + " foi lavado.");
    }
}