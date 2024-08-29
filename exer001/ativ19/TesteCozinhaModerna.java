package ativ19;

public class TesteCozinhaModerna {
    public static void main(String[] args) {
        CozinhaModerna minhaCozinha = new CozinhaModerna();
        minhaCozinha.tipoAmbiente = "Gourmet";
        minhaCozinha.capacidadePessoas = 4;
        minhaCozinha.corPredominante = "Branco";
        minhaCozinha.prepararRefeicao();
        minhaCozinha.higienizarAmbiente();
    }
}
