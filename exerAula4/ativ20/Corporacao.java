package ativ20;

class Corporacao {
    private String razaoSocial;
    private String numeroCNPJ;
    private int quantidadeFuncionarios;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getNumeroCNPJ() {
        return numeroCNPJ;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setRazaoSocial(String razaoSocial) {
        if (razaoSocial != null && !razaoSocial.isEmpty()) {
            this.razaoSocial = razaoSocial;
        } else {
            throw new IllegalArgumentException("A razão social não pode ser vazia.");
        }
    }

    public void setNumeroCNPJ(String numeroCNPJ) {
        if (numeroCNPJ != null && !numeroCNPJ.isEmpty()) {
            this.numeroCNPJ = numeroCNPJ;
        } else {
            throw new IllegalArgumentException("O número do CNPJ não pode ser vazio.");
        }
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        if (quantidadeFuncionarios >= 0) {
            this.quantidadeFuncionarios = quantidadeFuncionarios;
        } else {
            throw new IllegalArgumentException("A quantidade de funcionários não pode ser negativa.");
        }
    }

    public void contratarFuncionario() {
        quantidadeFuncionarios++;
        System.out.println("Contratando funcionário. Número de funcionários: " + quantidadeFuncionarios);
    }

    public void demitirFuncionario() {
        if (quantidadeFuncionarios > 0) {
            quantidadeFuncionarios--;
            System.out.println("Demitindo funcionário. Número de funcionários: " + quantidadeFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}
