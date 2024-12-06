package ativ17;

public class TesteEbook {
    public static void main(String[] args) {
        Ebook livroDigital = new Ebook();

        livroDigital.setNomeTitulo("1984");
        livroDigital.setAutorPrincipal("George Orwell");
        livroDigital.setTamanhoArquivoMB(2.5);

        livroDigital.abrirLivro();
        livroDigital.fecharLivro();

        System.out.println("Título: " + livroDigital.getNomeTitulo());
        System.out.println("Autor: " + livroDigital.getAutorPrincipal());
        System.out.println("Tamanho do arquivo: " + livroDigital.getTamanhoArquivoMB() + " MB");
    }
}
