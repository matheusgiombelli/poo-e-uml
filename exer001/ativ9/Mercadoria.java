package ativ9;

class Mercadoria {
    String descricaoProduto;
    double valorProduto;
    int quantidadeEmEstoque;

    void incrementarEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println("Estoque de " + descricaoProduto + " aumentado para " + quantidadeEmEstoque + " unidades.");
    }

    void decrementarEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println("Estoque de " + descricaoProduto + " diminuído para " + quantidadeEmEstoque + " unidades.");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }
}
