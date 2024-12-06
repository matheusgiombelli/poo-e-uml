package ativ22;

public class TesteCompanhia {
    public static void main(String[] args) {
        Companhia novaEmpresa = new Companhia();

        novaEmpresa.setNomeFantasia("BioparkTec");
        novaEmpresa.setNumeroCNPJ("98.765.432/0001-10");
        novaEmpresa.setTotalFuncionarios(15);

        novaEmpresa.admitirFuncionario();
        novaEmpresa.dispensarFuncionario();

        System.out.println("Nome fantasia: " + novaEmpresa.getNomeFantasia());
        System.out.println("CNPJ: " + novaEmpresa.getNumeroCNPJ());
        System.out.println("Total de funcionários: " + novaEmpresa.getTotalFuncionarios());
    }
}