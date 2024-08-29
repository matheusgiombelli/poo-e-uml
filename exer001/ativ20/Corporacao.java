package ativ20;

class Corporacao {
    String razaoSocial;
    String numeroCNPJ;
    int quantidadeFuncionarios;

    void contratarFuncionario() {
        quantidadeFuncionarios++;
        System.out.println("Contratando funcionário. Número de funcionários: " + quantidadeFuncionarios);
    }

    void demitirFuncionario() {
        if (quantidadeFuncionarios > 0) {
            quantidadeFuncionarios--;
            System.out.println("Demitindo funcionário. Número de funcionários: " + quantidadeFuncionarios);
        } else {
            System.out.println("Não há funcionários para demitir.");
        }
    }
}
