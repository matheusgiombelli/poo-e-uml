package ativ6;

class ComputadorPessoal {
    String tipoProcessador;
    int tamanhoMemoriaRAM;
    int espacoArmazenamento;
    boolean estaAtivo = false;

    void ligarSistema() {
        if (!estaAtivo) {
            estaAtivo = true;
            System.out.println("Computador ligado.");
        } else {
            System.out.println("Computador já está ligado.");
        }
    }

    void desligarSistema() {
        if (estaAtivo) {
            estaAtivo = false;
            System.out.println("Computador desligado.");
        } else {
            System.out.println("Computador já está desligado.");
        }
    }
}
