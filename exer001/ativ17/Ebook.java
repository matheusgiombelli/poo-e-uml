package ativ17;

class Ebook{
    String nomeTitulo;
    String autorPrincipal;
    double tamanhoArquivoMB;
    boolean emUso = false;

    void abrirLivro() {
        if (!emUso) {
            emUso = true;
            System.out.println("Abrindo o ebook " + nomeTitulo + ".");
        } else {
            System.out.println("O ebook " + nomeTitulo + " já está aberto.");
        }
    }

    void fecharLivro() {
        if (emUso) {
            emUso = false;
            System.out.println("Fechando o ebook " + nomeTitulo + ".");
        } else {
            System.out.println("O ebook " + nomeTitulo + " já está fechado.");
        }
    }
}
