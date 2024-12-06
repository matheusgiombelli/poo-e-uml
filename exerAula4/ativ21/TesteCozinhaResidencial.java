package ativ21;

public class TesteCozinhaResidencial {
    public static void main(String[] args) {
        CozinhaResidencial minhaCozinha = new CozinhaResidencial();

        minhaCozinha.setTipoAmbiente("Americana");
        minhaCozinha.setCapacidadeMaximaPessoas(6);
        minhaCozinha.setTonalidade("Bege");

        minhaCozinha.prepararAlimento();
        minhaCozinha.fazerLimpeza();

        System.out.println("Tipo de ambiente: " + minhaCozinha.getTipoAmbiente());
        System.out.println("Capacidade máxima de pessoas: " + minhaCozinha.getCapacidadeMaximaPessoas());
        System.out.println("Tonalidade: " + minhaCozinha.getTonalidade());
    }
}
