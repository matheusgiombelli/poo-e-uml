package ativ20;

public class TesteCorporacao {
    public static void main(String[] args) {
        Corporacao empresa = new Corporacao();

        empresa.setRazaoSocial("Tech Solutions Ltda.");
        empresa.setNumeroCNPJ("12.345.678/0001-99");
        empresa.setQuantidadeFuncionarios(50);

        empresa.contratarFuncionario();
        empresa.demitirFuncionario();

        System.out.println("Razão Social: " + empresa.getRazaoSocial());
        System.out.println("CNPJ: " + empresa.getNumeroCNPJ());
        System.out.println("Quantidade de funcionários: " + empresa.getQuantidadeFuncionarios());
    }
}