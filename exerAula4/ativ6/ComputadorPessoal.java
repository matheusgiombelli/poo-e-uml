package ativ6;

class ComputadorPessoal {
    private String tipoProcessador;
    private int tamanhoMemoriaRAM;
    private int espacoArmazenamento;
    private boolean estaAtivo = false;

    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public int getTamanhoMemoriaRAM() {
        return tamanhoMemoriaRAM;
    }

    public int getEspacoArmazenamento() {
        return espacoArmazenamento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setTipoProcessador(String tipoProcessador) {
        if (tipoProcessador != null && !tipoProcessador.isEmpty()) {
            this.tipoProcessador = tipoProcessador;
        } else {
            throw new IllegalArgumentException("O tipo do processador não pode ser vazio.");
        }
    }

    public void setTamanhoMemoriaRAM(int tamanhoMemoriaRAM) {
        if (tamanhoMemoriaRAM > 0) {
            this.tamanhoMemoriaRAM = tamanhoMemoriaRAM;
        } else {
            throw new IllegalArgumentException("A memória RAM deve ser maior que zero.");
        }
    }

    public void setEspacoArmazenamento(int espacoArmazenamento) {
        if (espacoArmazenamento > 0) {
            this.espacoArmazenamento = espacoArmazenamento;
        } else {
            throw new IllegalArgumentException("O espaço de armazenamento deve ser maior que zero.");
        }
    }

    public void ligarSistema() {
        if (!estaAtivo) {
            estaAtivo = true;
            System.out.println("Computador ligado.");
        } else {
            System.out.println("Computador já está ligado.");
        }
    }

    public void desligarSistema() {
        if (estaAtivo) {
            estaAtivo = false;
            System.out.println("Computador desligado.");
        } else {
            System.out.println("Computador já está desligado.");
        }
    }
}
