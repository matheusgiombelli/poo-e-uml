package ativ2;

public class TesteLivro {
    public static void main(String[] args) {
        Livro livro = new Livro("Meu Livro", "Autor Teste");

        livro.adicionarPagina("Conteúdo da Página 1");
        livro.adicionarPagina("Conteúdo da Página 2");
        livro.adicionarPagina("Conteúdo da Página 3");

        System.out.println("Título do Livro: " + livro.getTitulo());
        System.out.println("Autor do Livro: " + livro.getAutor());

        // Use List directly in the for-each loop
        for (Pagina pagina : livro.getPaginas()) {
            System.out.println("Número da Página: " + pagina.getNumero());
            System.out.println("Conteúdo da Página: " + pagina.getConteudo());
        }
    }
}