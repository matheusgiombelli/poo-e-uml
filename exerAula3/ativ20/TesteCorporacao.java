package ativ20;

public class TesteCorporacao {
    public static void main(String[] args) {
        Corporacao empresa = new Corporacao();
        empresa.razaoSocial = "Tech Solutions Ltda.";
        empresa.numeroCNPJ = "12.345.678/0001-99";
        empresa.quantidadeFuncionarios = 50;
        empresa.contratarFuncionario();
        empresa.demitirFuncionario();
    }
}
