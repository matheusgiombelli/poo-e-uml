package ativ15;

class Comercio {
    private String nomeComercio;
    private String localizacao;
    private String telefoneContato;
    private boolean operando = false;

    public String getNomeComercio() {
        return nomeComercio;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public boolean isOperando() {
        return operando;
    }

    public void setNomeComercio(String nomeComercio) {
        if (nomeComercio != null && !nomeComercio.isEmpty()) {
            this.nomeComercio = nomeComercio;
        } else {
            throw new IllegalArgumentException("O nome do comércio não pode ser vazio.");
        }
    }

    public void setLocalizacao(String localizacao) {
        if (localizacao != null && !localizacao.isEmpty()) {
            this.localizacao = localizacao;
        } else {
            throw new IllegalArgumentException("A localização não pode ser vazia.");
        }
    }

    public void setTelefoneContato(String telefoneContato) {
        if (telefoneContato != null && !telefoneContato.isEmpty()) {
            this.telefoneContato = telefoneContato;
        } else {
            throw new IllegalArgumentException("O telefone de contato não pode ser vazio.");
        }
    }

    public void abrirComercio() {
        if (!operando) {
            operando = true;
            System.out.println("O comércio " + nomeComercio + " está aberto.");
        } else {
            System.out.println("O comércio " + nomeComercio + " já está aberto.");
        }
    }

    public void fecharComercio() {
        if (operando) {
            operando = false;
            System.out.println("O comércio " + nomeComercio + " está fechado.");
        } else {
            System.out.println("O comércio " + nomeComercio + " já está fechado.");
        }
    }
}
