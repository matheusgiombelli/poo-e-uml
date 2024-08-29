package ativ11;

class Municipio {
    String nomeMunicipio;
    int totalPopulacao;
    String nomeEstado;

    void aumentarPopulacao(int quantidade) {
        totalPopulacao += quantidade;
        System.out.println("A população de " + nomeMunicipio + " aumentou para " + totalPopulacao + " habitantes.");
    }

    void reduzirPopulacao(int quantidade) {
        if (quantidade <= totalPopulacao) {
            totalPopulacao -= quantidade;
            System.out.println("A população de " + nomeMunicipio + " diminuiu para " + totalPopulacao + " habitantes.");
        } else {
            System.out.println("Quantidade maior que a população atual.");
        }
    }
}
