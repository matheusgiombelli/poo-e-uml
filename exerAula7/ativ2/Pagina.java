package ativ2;

class Pagina {
    private int numero;
    private String conteudo;

    public Pagina(int numero, String conteudo) {
        this.conteudo = conteudo;
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getConteudo() {
        return this.conteudo;
    }
}