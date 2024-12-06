package ativ21;

class CozinhaResidencial {
    private String tipoAmbiente;
    private int capacidadeMaximaPessoas;
    private String tonalidade;

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public int getCapacidadeMaximaPessoas() {
        return capacidadeMaximaPessoas;
    }

    public String getTonalidade() {
        return tonalidade;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        if (tipoAmbiente != null && !tipoAmbiente.isEmpty()) {
            this.tipoAmbiente = tipoAmbiente;
        } else {
            throw new IllegalArgumentException("O tipo de ambiente não pode ser vazio.");
        }
    }

    public void setCapacidadeMaximaPessoas(int capacidadeMaximaPessoas) {
        if (capacidadeMaximaPessoas > 0) {
            this.capacidadeMaximaPessoas = capacidadeMaximaPessoas;
        } else {
            throw new IllegalArgumentException("A capacidade máxima de pessoas deve ser maior que zero.");
        }
    }

    public void setTonalidade(String tonalidade) {
        if (tonalidade != null && !tonalidade.isEmpty()) {
            this.tonalidade = tonalidade;
        } else {
            throw new IllegalArgumentException("A tonalidade não pode ser vazia.");
        }
    }

    public void prepararAlimento() {
        System.out.println("Preparando alimentos na cozinha de tipo " + tipoAmbiente + ".");
    }

    public void fazerLimpeza() {
        System.out.println("Limpando a cozinha.");
    }
}
