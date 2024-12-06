package ativ12;

class FilmeCinema {
    private String tituloFilme;
    private String nomeDiretor;
    private int duracaoFilme;
    private boolean estaEmExibicao = false;

    public String getTituloFilme() {
        return tituloFilme;
    }

    public String getNomeDiretor() {
        return nomeDiretor;
    }

    public int getDuracaoFilme() {
        return duracaoFilme;
    }

    public boolean isEstaEmExibicao() {
        return estaEmExibicao;
    }

    public void setTituloFilme(String tituloFilme) {
        if (tituloFilme != null && !tituloFilme.isEmpty()) {
            this.tituloFilme = tituloFilme;
        } else {
            throw new IllegalArgumentException("O título do filme não pode ser vazio.");
        }
    }

    public void setNomeDiretor(String nomeDiretor) {
        if (nomeDiretor != null && !nomeDiretor.isEmpty()) {
            this.nomeDiretor = nomeDiretor;
        } else {
            throw new IllegalArgumentException("O nome do diretor não pode ser vazio.");
        }
    }

    public void setDuracaoFilme(int duracaoFilme) {
        if (duracaoFilme > 0) {
            this.duracaoFilme = duracaoFilme;
        } else {
            throw new IllegalArgumentException("A duração do filme deve ser positiva.");
        }
    }

    public void iniciarExibicao() {
        if (!estaEmExibicao) {
            estaEmExibicao = true;
            System.out.println("Iniciando o filme " + tituloFilme + ".");
        } else {
            System.out.println("O filme " + tituloFilme + " já está em andamento.");
        }
    }

    public void interromperExibicao() {
        if (estaEmExibicao) {
            estaEmExibicao = false;
            System.out.println("Parando o filme " + tituloFilme + ".");
        } else {
            System.out.println("O filme " + tituloFilme + " já está parado.");
        }
    }
}
