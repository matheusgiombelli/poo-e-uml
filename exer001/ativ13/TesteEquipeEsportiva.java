package ativ13;

public class TesteEquipeEsportiva {
    public static void main(String[] args) {
        EquipeEsportiva time = new EquipeEsportiva();
        time.nomeEquipe = "Dragões do Norte";
        time.nomeTreinador = "Carlos Mendes";
        time.numeroJogadores = 11;
        time.adicionarJogador();
        time.removerJogador();
    }
}
