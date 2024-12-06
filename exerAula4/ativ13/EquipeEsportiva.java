package ativ13;

class EquipeEsportiva {
    private String nomeEquipe;
    private String nomeTreinador;
    private int numeroJogadores;

    public String getNomeEquipe() {
        return nomeEquipe;
    }

    public String getNomeTreinador() {
        return nomeTreinador;
    }

    public int getNumeroJogadores() {
        return numeroJogadores;
    }

    public void setNomeEquipe(String nomeEquipe) {
        if (nomeEquipe != null && !nomeEquipe.isEmpty()) {
            this.nomeEquipe = nomeEquipe;
        } else {
            throw new IllegalArgumentException("O nome da equipe não pode ser vazio.");
        }
    }

    public void setNomeTreinador(String nomeTreinador) {
        if (nomeTreinador != null && !nomeTreinador.isEmpty()) {
            this.nomeTreinador = nomeTreinador;
        } else {
            throw new IllegalArgumentException("O nome do treinador não pode ser vazio.");
        }
    }

    public void setNumeroJogadores(int numeroJogadores) {
        if (numeroJogadores >= 0) {
            this.numeroJogadores = numeroJogadores;
        } else {
            throw new IllegalArgumentException("O número de jogadores não pode ser negativo.");
        }
    }

    public void adicionarJogador() {
        numeroJogadores++;
        System.out.println("Jogador adicionado à equipe " + nomeEquipe + ". Número de jogadores: " + numeroJogadores);
    }

    public void removerJogador() {
        if (numeroJogadores > 0) {
            numeroJogadores--;
            System.out.println("Jogador removido da equipe " + nomeEquipe + ". Número de jogadores: " + numeroJogadores);
        } else {
            System.out.println("Não há jogadores para remover.");
        }
    }
}
