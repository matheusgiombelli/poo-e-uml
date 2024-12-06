package ativ15;

public class TesteComercio {
    public static void main(String[] args) {
        Comercio loja = new Comercio();
        loja.nomeComercio = "Mercado Bom Preço";
        loja.localizacao = "Rua das Flores, 123";
        loja.telefoneContato = "(11) 99999-1234";
        loja.abrirComercio();
        loja.fecharComercio();
    }
}
