package ativ15;

public class TesteComercio {
    public static void main(String[] args) {
        Comercio loja = new Comercio();

        loja.setNomeComercio("Mercado Bom Preço");
        loja.setLocalizacao("Rua das Flores, 123");
        loja.setTelefoneContato("(11) 99999-1234");

        loja.abrirComercio();
        loja.fecharComercio();

        System.out.println("Nome: " + loja.getNomeComercio());
        System.out.println("Localização: " + loja.getLocalizacao());
        System.out.println("Telefone: " + loja.getTelefoneContato());
        System.out.println("Operando: " + loja.isOperando());
    }
}