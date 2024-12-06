package ativ5;

class Canino {
    private String nomeAnimal;
    private String tipoRaca;
    private int idadeAnimal;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public String getTipoRaca() {
        return tipoRaca;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        if (nomeAnimal != null && !nomeAnimal.isEmpty()) {
            this.nomeAnimal = nomeAnimal;
        } else {
            throw new IllegalArgumentException("O nome do animal não pode ser vazio.");
        }
    }

    public void setTipoRaca(String tipoRaca) {
        if (tipoRaca != null && !tipoRaca.isEmpty()) {
            this.tipoRaca = tipoRaca;
        } else {
            throw new IllegalArgumentException("A raça do animal não pode ser vazia.");
        }
    }

    public void setIdadeAnimal(int idadeAnimal) {
        if (idadeAnimal >= 0) {
            this.idadeAnimal = idadeAnimal;
        } else {
            throw new IllegalArgumentException("A idade do animal deve ser um valor não negativo.");
        }
    }

    public void emitirSom() {
        System.out.println(nomeAnimal + " está latindo: Au au!");
    }

    public void movimentar() {
        System.out.println(nomeAnimal + " está correndo.");
    }
}
