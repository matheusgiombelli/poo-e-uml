package ativ14;

class Videogame {
    private String nomeJogo;
    private String tipoGenero;
    private double precoJogo;
    private boolean emExecucao = false;

    public String getNomeJogo() {
        return nomeJogo;
    }

    public String getTipoGenero() {
        return tipoGenero;
    }

    public double getPrecoJogo() {
        return precoJogo;
    }

    public boolean isEmExecucao() {
        return emExecucao;
    }

    public void setNomeJogo(String nomeJogo) {
        if (nomeJogo != null && !nomeJogo.isEmpty()) {
            this.nomeJogo = nomeJogo;
        } else {
            throw new IllegalArgumentException("O nome do jogo não pode ser vazio.");
        }
    }

    public void setTipoGenero(String tipoGenero) {
        if (tipoGenero != null && !tipoGenero.isEmpty()) {
            this.tipoGenero = tipoGenero;
        } else {
            throw new IllegalArgumentException("O gênero do jogo não pode ser vazio.");
        }
    }

    public void setPrecoJogo(double precoJogo) {
        if (precoJogo > 0) {
            this.precoJogo = precoJogo;
        } else {
            throw new IllegalArgumentException("O preço do jogo deve ser positivo.");
        }
    }

    public void iniciarJogo() {
        if (!emExecucao) {
            emExecucao = true;
            System.out.println("Iniciando o jogo " + nomeJogo + ".");
        } else {
            System.out.println("O jogo " + nomeJogo + " já está em andamento.");
        }
    }

    public void pausarJogo() {
        if (emExecucao) {
            emExecucao = false;
            System.out.println("Pausando o jogo " + nomeJogo + ".");
        } else {
            System.out.println("O jogo " + nomeJogo + " já está pausado.");
        }
    }
}
