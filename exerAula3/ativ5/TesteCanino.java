package ativ5;

public class TesteCanino {
    public static void main(String[] args) {
        Canino meuCachorro = new Canino();

        meuCachorro.setNomeAnimal("Bolt");
        meuCachorro.setTipoRaca("Labrador");
        meuCachorro.setIdadeAnimal(4);

        meuCachorro.emitirSom();
        meuCachorro.movimentar();

        System.out.println("Nome: " + meuCachorro.getNomeAnimal());
        System.out.println("Raça: " + meuCachorro.getTipoRaca());
        System.out.println("Idade: " + meuCachorro.getIdadeAnimal());
    }
}