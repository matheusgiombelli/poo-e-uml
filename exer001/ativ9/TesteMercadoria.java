package ativ9;

public class TesteMercadoria {
    public static void main(String[] args) {
        Mercadoria produto = new Mercadoria();
        produto.descricaoProduto = "Camisa Polo";
        produto.valorProduto = 79.99;
        produto.quantidadeEmEstoque = 50;
        produto.incrementarEstoque(20);
        produto.decrementarEstoque(10);
    }
}
