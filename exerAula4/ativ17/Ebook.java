package ativ17;

class Ebook {
    private String nomeTitulo;
    private String autorPrincipal;
    private double tamanhoArquivoMB;
    private boolean emUso = false;

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public double getTamanhoArquivoMB() {
        return tamanhoArquivoMB;
    }

    public boolean isEmUso() {
        return emUso;
    }

    public void setNomeTitulo(String nomeTitulo) {
        if (nomeTitulo != null && !nomeTitulo.isEmpty()) {
            this.nomeTitulo = nomeTitulo;
        } else {
            throw new IllegalArgumentException("O nome do título não pode ser vazio.");
        }
    }

    public void setAutorPrincipal(String autorPrincipal) {
        if (autorPrincipal != null && !autorPrincipal.isEmpty()) {
            this.autorPrincipal = autorPrincipal;
        } else {
            throw new IllegalArgumentException("O autor principal não pode ser vazio.");
        }
    }

    public void setTamanhoArquivoMB(double tamanhoArquivoMB) {
        if (tamanhoArquivoMB > 0) {
            this.tamanhoArquivoMB = tamanhoArquivoMB;
        } else {
            throw new IllegalArgumentException("O tamanho do arquivo deve ser maior que zero.");
        }
    }

    public void abrirLivro() {
        if (!emUso) {
            emUso = true;
            System.out.println("Abrindo o ebook " + nomeTitulo + ".");
        } else {
            System.out.println("O ebook " + nomeTitulo + " já está aberto.");
        }
    }

    public void fecharLivro() {
        if (emUso) {
            emUso = false;
            System.out.println("Fechando o ebook " + nomeTitulo + ".");
        } else {
            System.out.println("O ebook " + nomeTitulo + " já está fechado.");
        }
    }
}
