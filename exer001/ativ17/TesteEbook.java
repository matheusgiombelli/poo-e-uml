package ativ17;

public class TesteEbook {
    public static void main(String[] args) {
        Ebook livroDigital = new Ebook();
        livroDigital.nomeTitulo = "1984";
        livroDigital.autorPrincipal = "George Orwell";
        livroDigital.tamanhoArquivoMB = 2.5;
        livroDigital.abrirLivro();
        livroDigital.fecharLivro();
    }
}
