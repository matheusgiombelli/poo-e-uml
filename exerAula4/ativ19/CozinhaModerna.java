package ativ19;

class CozinhaModerna {
    private String tipoAmbiente;
    private int capacidadePessoas;
    private String corPredominante;

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        if (tipoAmbiente != null && !tipoAmbiente.isEmpty()) {
            this.tipoAmbiente = tipoAmbiente;
        } else {
            throw new IllegalArgumentException("O tipo de ambiente não pode ser vazio.");
        }
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        if (capacidadePessoas > 0) {
            this.capacidadePessoas = capacidadePessoas;
        } else {
            throw new IllegalArgumentException("A capacidade de pessoas deve ser maior que zero.");
        }
    }

    public void setCorPredominante(String corPredominante) {
        if (corPredominante != null && !corPredominante.isEmpty()) {
            this.corPredominante = corPredominante;
        } else {
            throw new IllegalArgumentException("A cor predominante não pode ser vazia.");
        }
    }

    public void prepararRefeicao() {
        System.out.println("Cozinhando na cozinha de tipo " + tipoAmbiente + ".");
    }

    public void higienizarAmbiente() {
        System.out.println("Limpando a cozinha.");
    }
}
