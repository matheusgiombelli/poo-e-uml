package ativ13;

public class TesteEquipeEsportiva {
    public static void main(String[] args) {
        EquipeEsportiva time = new EquipeEsportiva();

        time.setNomeEquipe("Dragões do Norte");
        time.setNomeTreinador("Carlos Mendes");
        time.setNumeroJogadores(11);

        time.adicionarJogador();
        time.removerJogador();

        System.out.println("Equipe: " + time.getNomeEquipe());
        System.out.println("Treinador: " + time.getNomeTreinador());
        System.out.println("Número de jogadores: " + time.getNumeroJogadores());
    }
}
