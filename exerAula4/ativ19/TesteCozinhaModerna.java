package ativ19;

public class TesteCozinhaModerna {
    public static void main(String[] args) {
        CozinhaModerna minhaCozinha = new CozinhaModerna();

        minhaCozinha.setTipoAmbiente("Gourmet");
        minhaCozinha.setCapacidadePessoas(4);
        minhaCozinha.setCorPredominante("Branco");

        minhaCozinha.prepararRefeicao();
        minhaCozinha.higienizarAmbiente();

        System.out.println("Tipo de ambiente: " + minhaCozinha.getTipoAmbiente());
        System.out.println("Capacidade de pessoas: " + minhaCozinha.getCapacidadePessoas());
        System.out.println("Cor predominante: " + minhaCozinha.getCorPredominante());
    }
}