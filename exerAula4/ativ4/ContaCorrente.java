package ativ4;

class ContaCorrente {
    private String numeroDaConta;
    private double valorDisponivel;

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getValorDisponivel() {
        return valorDisponivel;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        if (numeroDaConta != null && !numeroDaConta.isEmpty()) {
            this.numeroDaConta = numeroDaConta;
        } else {
            throw new IllegalArgumentException("O número da conta não pode ser vazio.");
        }
    }

    public void adicionarFundo(double quantia) {
        if (quantia > 0) {
            valorDisponivel += quantia;
            System.out.println("Depósito de R$ " + quantia + " realizado. Saldo atual: R$ " + valorDisponivel);
        } else {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
    }

    public void retirarFundo(double quantia) {
        if (quantia > 0) {
            if (quantia <= valorDisponivel) {
                valorDisponivel -= quantia;
                System.out.println("Saque de R$ " + quantia + " realizado. Saldo atual: R$ " + valorDisponivel);
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
    }
}
