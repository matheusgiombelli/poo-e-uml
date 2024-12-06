package ativ11;

class Municipio {
    private String nomeMunicipio;
    private int totalPopulacao;
    private String nomeEstado;

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public int getTotalPopulacao() {
        return totalPopulacao;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeMunicipio(String nomeMunicipio) {
        if (nomeMunicipio != null && !nomeMunicipio.isEmpty()) {
            this.nomeMunicipio = nomeMunicipio;
        } else {
            throw new IllegalArgumentException("O nome do município não pode ser vazio.");
        }
    }

    public void setTotalPopulacao(int totalPopulacao) {
        if (totalPopulacao >= 0) {
            this.totalPopulacao = totalPopulacao;
        } else {
            throw new IllegalArgumentException("A população total não pode ser negativa.");
        }
    }

    public void setNomeEstado(String nomeEstado) {
        if (nomeEstado != null && !nomeEstado.isEmpty()) {
            this.nomeEstado = nomeEstado;
        } else {
            throw new IllegalArgumentException("O nome do estado não pode ser vazio.");
        }
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            totalPopulacao += quantidade;
            System.out.println("A população de " + nomeMunicipio + " aumentou para " + totalPopulacao + " habitantes.");
        } else {
            throw new IllegalArgumentException("A quantidade a aumentar deve ser positiva.");
        }
    }

    public void reduzirPopulacao(int quantidade) {
        if (quantidade > 0) {
            if (quantidade <= totalPopulacao) {
                totalPopulacao -= quantidade;
                System.out.println("A população de " + nomeMunicipio + " diminuiu para " + totalPopulacao + " habitantes.");
            } else {
                System.out.println("Quantidade maior que a população atual.");
            }
        } else {
            throw new IllegalArgumentException("A quantidade a reduzir deve ser positiva.");
        }
    }
}
