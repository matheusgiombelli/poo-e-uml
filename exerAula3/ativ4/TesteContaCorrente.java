package ativ4;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();
        minhaConta.numeroDaConta = "12345-6";
        minhaConta.valorDisponivel = 1000.00;
        minhaConta.adicionarFundo(500.00);
        minhaConta.retirarFundo(200.00);
    }
}
