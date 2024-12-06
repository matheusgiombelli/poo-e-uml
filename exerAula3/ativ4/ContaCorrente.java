package ativ4;

class ContaCorrente {
    String numeroDaConta;
    double valorDisponivel;

    void adicionarFundo(double quantia) {
        valorDisponivel += quantia;
        System.out.println("Depósito de R$ " + quantia + " realizado. Saldo atual: R$ " + valorDisponivel);
    }

    void retirarFundo(double quantia) {
        if (quantia <= valorDisponivel) {
            valorDisponivel -= quantia;
            System.out.println("Saque de R$ " + quantia + " realizado. Saldo atual: R$ " + valorDisponivel);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}