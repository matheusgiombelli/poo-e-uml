package ativ10;

public class TesteAutomovel {
    public static void main(String[] args) {
        Automovel meuCarro = new Automovel();
        meuCarro.tipoVeiculo = "Sedan";
        meuCarro.placaVeiculo = "XYZ-1234";
        meuCarro.corVeiculo = "Prata";
        meuCarro.reabastecer();
        meuCarro.realizarLavagem();
    }
}
