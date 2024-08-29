package ativ14;

class Videogame {
    String nomeJogo;
    String tipoGenero;
    double precoJogo;
    boolean emExecucao = false;

    void iniciarJogo() {
        if (!emExecucao) {
            emExecucao = true;
            System.out.println("Iniciando o jogo " + nomeJogo + ".");
        } else {
            System.out.println("O jogo " + nomeJogo + " já está em andamento.");
        }
    }

    void pausarJogo() {
        if (emExecucao) {
            emExecucao = false;
            System.out.println("Pausando o jogo " + nomeJogo + ".");
        } else {
            System.out.println("O jogo " + nomeJogo + " já está pausado.");
        }
    }
}
