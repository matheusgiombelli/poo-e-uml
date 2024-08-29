package ativ12;

public class TesteFilmeCinema {
    public static void main(String[] args) {
        FilmeCinema filme = new FilmeCinema();
        filme.tituloFilme = "O Poderoso Chefão";
        filme.nomeDiretor = "Francis Ford Coppola";
        filme.duracaoFilme = 175;
        filme.iniciarExibicao();
        filme.interromperExibicao();
    }
}
