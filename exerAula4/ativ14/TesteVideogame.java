package ativ14;

public class TesteVideogame {
    public static void main(String[] args) {
        Videogame meuJogo = new Videogame();

        meuJogo.setNomeJogo("FIFA 2024");
        meuJogo.setTipoGenero("Esporte");
        meuJogo.setPrecoJogo(199.99);

        meuJogo.iniciarJogo();
        meuJogo.pausarJogo();

        System.out.println("Jogo: " + meuJogo.getNomeJogo());
        System.out.println("Gênero: " + meuJogo.getTipoGenero());
        System.out.println("Preço: R$ " + meuJogo.getPrecoJogo());
        System.out.println("Em execução: " + meuJogo.isEmExecucao());
    }
}