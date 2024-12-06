package ativ1;

public class TesteLivroFisico {
    public static void main(String[] args) {
        LivroFisico meuLivro = new LivroFisico();

        meuLivro.setTituloObra("Harry Potter");
        meuLivro.setAutorObra("J.K Rowling");
        meuLivro.setTotalPaginas(400);

        meuLivro.iniciarLeitura();
        meuLivro.avancarPagina();

        System.out.println("Título: " + meuLivro.getTituloObra());
        System.out.println("Autor: " + meuLivro.getAutorObra());
        System.out.println("Total de páginas: " + meuLivro.getTotalPaginas());
        System.out.println("Página atual: " + meuLivro.getPaginaAtual());
    }
}
