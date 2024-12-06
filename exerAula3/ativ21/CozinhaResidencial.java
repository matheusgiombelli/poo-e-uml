package ativ21;

class CozinhaResidencial {
    String tipoAmbiente;
    int capacidadeMaximaPessoas;
    String tonalidade;

    void prepararAlimento() {
        System.out.println("Preparando alimentos na cozinha de tipo " + tipoAmbiente + ".");
    }

    void fazerLimpeza() {
        System.out.println("Limpando a cozinha.");
    }
}
