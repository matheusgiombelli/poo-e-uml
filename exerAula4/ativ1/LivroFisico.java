package ativ1;

class LivroFisico {
    private String tituloObra;
    private String autorObra;
    private int totalPaginas;
    private int paginaAtual = 0;

    public String getTituloObra() {
        return tituloObra;
    }

    public String getAutorObra() {
        return autorObra;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setTituloObra(String tituloObra) {
        if (tituloObra != null && !tituloObra.isEmpty()) {
            this.tituloObra = tituloObra;
        } else {
            throw new IllegalArgumentException("O título não pode ser vazio.");
        }
    }

    public void setAutorObra(String autorObra) {
        if (autorObra != null && !autorObra.isEmpty()) {
            this.autorObra = autorObra;
        } else {
            throw new IllegalArgumentException("O autor não pode ser vazio.");
        }
    }

    public void setTotalPaginas(int totalPaginas) {
        if (totalPaginas > 0) {
            this.totalPaginas = totalPaginas;
        } else {
            throw new IllegalArgumentException("O total de páginas deve ser maior que zero.");
        }
    }

    public void iniciarLeitura() {
        System.out.println("Iniciando leitura do livro " + tituloObra);
    }

    public void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
            System.out.println("Lendo página " + paginaAtual);
        } else {
            System.out.println("Você já terminou de ler o livro.");
        }
    }
}
