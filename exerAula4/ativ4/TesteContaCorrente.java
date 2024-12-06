package ativ4;

public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente();

        minhaConta.setNumeroDaConta("12345-6");
        minhaConta.adicionarFundo(1000.00);
        minhaConta.adicionarFundo(500.00);
        minhaConta.retirarFundo(200.00);

        System.out.println("Número da conta: " + minhaConta.getNumeroDaConta());
        System.out.println("Saldo final: R$ " + minhaConta.getValorDisponivel());
    }
}
