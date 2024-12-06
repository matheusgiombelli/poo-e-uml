package ativ10;

class Automovel {
    private String tipoVeiculo;
    private String placaVeiculo;
    private String corVeiculo;

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        if (tipoVeiculo != null && !tipoVeiculo.isEmpty()) {
            this.tipoVeiculo = tipoVeiculo;
        } else {
            throw new IllegalArgumentException("O tipo do veículo não pode ser vazio.");
        }
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        if (placaVeiculo != null && !placaVeiculo.isEmpty()) {
            this.placaVeiculo = placaVeiculo;
        } else {
            throw new IllegalArgumentException("A placa do veículo não pode ser vazia.");
        }
    }

    public void setCorVeiculo(String corVeiculo) {
        if (corVeiculo != null && !corVeiculo.isEmpty()) {
            this.corVeiculo = corVeiculo;
        } else {
            throw new IllegalArgumentException("A cor do veículo não pode ser vazia.");
        }
    }

    public void reabastecer() {
        System.out.println("O veículo " + tipoVeiculo + " de placa " + placaVeiculo + " foi abastecido.");
    }

    public void realizarLavagem() {
        System.out.println("O veículo " + tipoVeiculo + " de placa " + placaVeiculo + " foi lavado.");
    }
}
