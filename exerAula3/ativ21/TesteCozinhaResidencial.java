package ativ21;

public class TesteCozinhaResidencial {
    public static void main(String[] args) {
        CozinhaResidencial minhaCozinha = new CozinhaResidencial();
        minhaCozinha.tipoAmbiente = "Americana";
        minhaCozinha.capacidadeMaximaPessoas = 6;
        minhaCozinha.tonalidade = "Bege";
        minhaCozinha.prepararAlimento();
        minhaCozinha.fazerLimpeza();
    }
}