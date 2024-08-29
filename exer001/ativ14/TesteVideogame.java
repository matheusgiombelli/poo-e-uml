package ativ14;

public class TesteVideogame {
    public static void main(String[] args) {
        Videogame meuJogo = new Videogame();
        meuJogo.nomeJogo = "FIFA 2024";
        meuJogo.tipoGenero = "Esporte";
        meuJogo.precoJogo = 199.99;
        meuJogo.iniciarJogo();
        meuJogo.pausarJogo();
    }
}
