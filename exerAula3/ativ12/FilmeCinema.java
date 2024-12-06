package ativ12;

class FilmeCinema {
    String tituloFilme;
    String nomeDiretor;
    int duracaoFilme;
    boolean estaEmExibicao = false;

    void iniciarExibicao() {
        if (!estaEmExibicao) {
            estaEmExibicao = true;
            System.out.println("Iniciando o filme " + tituloFilme + ".");
        } else {
            System.out.println("O filme " + tituloFilme + " já está em andamento.");
        }
    }

    void interromperExibicao() {
        if (estaEmExibicao) {
            estaEmExibicao = false;
            System.out.println("Parando o filme " + tituloFilme + ".");
        } else {
            System.out.println("O filme " + tituloFilme + " já está parado.");
        }
    }
}
