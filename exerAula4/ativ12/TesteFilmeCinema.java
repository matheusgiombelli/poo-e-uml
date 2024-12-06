package ativ12;

public class TesteFilmeCinema {
    public static void main(String[] args) {
        FilmeCinema filme = new FilmeCinema();

        filme.setTituloFilme("O Poderoso Chefão");
        filme.setNomeDiretor("Francis Ford Coppola");
        filme.setDuracaoFilme(175);

        filme.iniciarExibicao();
        filme.interromperExibicao();

        System.out.println("Título: " + filme.getTituloFilme());
        System.out.println("Diretor: " + filme.getNomeDiretor());
        System.out.println("Duração: " + filme.getDuracaoFilme() + " minutos");
        System.out.println("Está em exibição: " + filme.isEstaEmExibicao());
    }
}