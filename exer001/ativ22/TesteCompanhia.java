package ativ22;

public class TesteCompanhia {
    public static void main(String[] args) {
        Companhia novaEmpresa = new Companhia();
        novaEmpresa.nomeFantasia = "BioparkTec";
        novaEmpresa.numeroCNPJ = "98.765.432/0001-10";
        novaEmpresa.totalFuncionarios = 15;
        novaEmpresa.admitirFuncionario();
        novaEmpresa.dispensarFuncionario();
    }
}
