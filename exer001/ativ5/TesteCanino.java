package ativ5;

public class TesteCanino {
    public static void main(String[] args) {
        Canino meuCachorro = new Canino();
        meuCachorro.nomeAnimal = "Bolt";
        meuCachorro.tipoRaca = "Labrador";
        meuCachorro.idadeAnimal = 4;
        meuCachorro.emitirSom();
        meuCachorro.movimentar();
    }
}
