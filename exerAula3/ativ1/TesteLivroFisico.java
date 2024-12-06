package ativ1;

public class TesteLivroFisico {
    public static void main(String[] args) {
        LivroFisico meuLivro = new LivroFisico();
        meuLivro.tituloObra = "Harry Potter";
        meuLivro.autorObra = "J.K Rowling";
        meuLivro.totalPaginas = 400;
        meuLivro.iniciarLeitura();
        meuLivro.avancarPagina();
    }
}