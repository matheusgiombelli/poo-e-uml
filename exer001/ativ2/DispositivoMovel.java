package ativ2;

class DispositivoMovel {
    String fabricante;
    String modeloDispositivo;
    int capacidadeBateria;
    boolean estaLigado = false;

    void ativar() {
        if (!estaLigado) {
            estaLigado = true;
            System.out.println("Dispositivo ligado.");
        } else {
            System.out.println("Dispositivo já está ligado.");
        }
    }

    void desativar() {
        if (estaLigado) {
            estaLigado = false;
            System.out.println("Dispositivo desligado.");
        } else {
            System.out.println("Dispositivo já está desligado.");
        }
    }
}
