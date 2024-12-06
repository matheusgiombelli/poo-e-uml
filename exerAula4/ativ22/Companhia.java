package ativ22;

class Companhia {
    private String nomeFantasia;
    private String numeroCNPJ;
    private int totalFuncionarios;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public String getNumeroCNPJ() {
        return numeroCNPJ;
    }

    public int getTotalFuncionarios() {
        return totalFuncionarios;
    }

    public void setNomeFantasia(String nomeFantasia) {
        if (nomeFantasia != null && !nomeFantasia.isEmpty()) {
            this.nomeFantasia = nomeFantasia;
        } else {
            throw new IllegalArgumentException("O nome fantasia não pode ser vazio.");
        }
    }

    public void setNumeroCNPJ(String numeroCNPJ) {
        if (numeroCNPJ != null && !numeroCNPJ.isEmpty()) {
            this.numeroCNPJ = numeroCNPJ;
        } else {
            throw new IllegalArgumentException("O número do CNPJ não pode ser vazio.");
        }
    }

    public void setTotalFuncionarios(int totalFuncionarios) {
        if (totalFuncionarios >= 0) {
            this.totalFuncionarios = totalFuncionarios;
        } else {
            throw new IllegalArgumentException("O número de funcionários não pode ser negativo.");
        }
    }

    public void admitirFuncionario() {
        totalFuncionarios++;
        System.out.println("Contratando novo funcionário. Número total de funcionários: " + totalFuncionarios);
    }

    public void dispensarFuncionario() {
        if (totalFuncionarios > 0) {
            totalFuncionarios--;
            System.out.println("Demitindo funcionário. Número total de funcionários: " + totalFuncionarios);
        } else {
            System.out.println("Nenhum funcionário disponível para demissão.");
        }
    }
}
