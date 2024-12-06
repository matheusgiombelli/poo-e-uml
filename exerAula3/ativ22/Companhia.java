package ativ22;

class Companhia {
    String nomeFantasia;
    String numeroCNPJ;
    int totalFuncionarios;

    void admitirFuncionario() {
        totalFuncionarios++;
        System.out.println("Contratando novo funcionário. Número total de funcionários: " + totalFuncionarios);
    }

    void dispensarFuncionario() {
        if (totalFuncionarios > 0) {
            totalFuncionarios--;
            System.out.println("Demitindo funcionário. Número total de funcionários: " + totalFuncionarios);
        } else {
            System.out.println("Nenhum funcionário disponível para demissão.");
        }
    }
}
