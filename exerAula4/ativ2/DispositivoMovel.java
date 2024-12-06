package ativ2;

class DispositivoMovel {
    private String fabricante;
    private String modeloDispositivo;
    private int capacidadeBateria;
    private boolean estaLigado = false;

    public String getFabricante() {
        return fabricante;
    }

    public String getModeloDispositivo() {
        return modeloDispositivo;
    }

    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public boolean isEstaLigado() {
        return estaLigado;
    }

    public void setFabricante(String fabricante) {
        if (fabricante != null && !fabricante.isEmpty()) {
            this.fabricante = fabricante;
        } else {
            throw new IllegalArgumentException("O fabricante não pode ser vazio.");
        }
    }

    public void setModeloDispositivo(String modeloDispositivo) {
        if (modeloDispositivo != null && !modeloDispositivo.isEmpty()) {
            this.modeloDispositivo = modeloDispositivo;
        } else {
            throw new IllegalArgumentException("O modelo do dispositivo não pode ser vazio.");
        }
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        if (capacidadeBateria > 0) {
            this.capacidadeBateria = capacidadeBateria;
        } else {
            throw new IllegalArgumentException("A capacidade da bateria deve ser maior que zero.");
        }
    }

    public void ativar() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("Dispositivo ligado.");
        } else {
            System.out.println("Dispositivo já está ligado.");
        }
    }

    public void desativar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("Dispositivo desligado.");
        } else {
            System.out.println("Dispositivo já está desligado.");
        }
    }
}
