package ativ1;

class LivroFisico {
    String tituloObra;
    String autorObra;
    int totalPaginas;
    int paginaAtual = 0;

    void iniciarLeitura() {
        System.out.println("Iniciando leitura do livro " + tituloObra);
    }

    void avancarPagina() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
            System.out.println("Lendo página " + paginaAtual);
        } else {
            System.out.println("Você já terminou de ler o livro.");
        }
    }
}