package ativ15;

class Comercio {
    String nomeComercio;
    String localizacao;
    String telefoneContato;
    boolean operando = false;

    void abrirComercio() {
        if (!operando) {
            operando = true;
            System.out.println("O comércio " + nomeComercio + " está aberto.");
        } else {
            System.out.println("O comércio " + nomeComercio + " já está aberto.");
        }
    }

    void fecharComercio() {
        if (operando) {
            operando = false;
            System.out.println("O comércio " + nomeComercio + " está fechado.");
        } else {
            System.out.println("O comércio " + nomeComercio + " já está fechado.");
        }
    }
}

