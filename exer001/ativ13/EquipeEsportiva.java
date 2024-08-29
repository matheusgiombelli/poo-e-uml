package ativ13;

class EquipeEsportiva {
    String nomeEquipe;
    String nomeTreinador;
    int numeroJogadores;

    void adicionarJogador() {
        numeroJogadores++;
        System.out.println("Jogador adicionado à equipe " + nomeEquipe + ". Número de jogadores: " + numeroJogadores);
    }

    void removerJogador() {
        if (numeroJogadores > 0) {
            numeroJogadores--;
            System.out.println("Jogador removido da equipe " + nomeEquipe + ". Número de jogadores: " + numeroJogadores);
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }
}
