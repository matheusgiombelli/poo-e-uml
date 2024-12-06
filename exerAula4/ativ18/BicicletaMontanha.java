package ativ18;

class BicicletaMontanha {
    private String fabricante;
    private String modeloBicicleta;
    private int tamanhoRodas;

    public String getFabricante() {
        return fabricante;
    }

    public String getModeloBicicleta() {
        return modeloBicicleta;
    }

    public int getTamanhoRodas() {
        return tamanhoRodas;
    }

    public void setFabricante(String fabricante) {
        if (fabricante != null && !fabricante.isEmpty()) {
            this.fabricante = fabricante;
        } else {
            throw new IllegalArgumentException("O fabricante não pode ser vazio.");
        }
    }

    public void setModeloBicicleta(String modeloBicicleta) {
        if (modeloBicicleta != null && !modeloBicicleta.isEmpty()) {
            this.modeloBicicleta = modeloBicicleta;
        } else {
            throw new IllegalArgumentException("O modelo da bicicleta não pode ser vazio.");
        }
    }

    public void setTamanhoRodas(int tamanhoRodas) {
        if (tamanhoRodas > 0) {
            this.tamanhoRodas = tamanhoRodas;
        } else {
            throw new IllegalArgumentException("O tamanho das rodas deve ser maior que zero.");
        }
    }

    public void pedalarBicicleta() {
        System.out.println("Pedalando a bicicleta " + fabricante + " " + modeloBicicleta + ".");
    }

    public void aplicarFreio() {
        System.out.println("Freando a bicicleta " + fabricante + " " + modeloBicicleta + ".");
    }
}
