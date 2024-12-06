package ativ3;

class Individuo {
    private String nomeCompleto;
    private int anosDeVida;
    private double estatura;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public int getAnosDeVida() {
        return anosDeVida;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if (nomeCompleto != null && !nomeCompleto.isEmpty()) {
            this.nomeCompleto = nomeCompleto;
        } else {
            throw new IllegalArgumentException("O nome completo não pode ser vazio.");
        }
    }

    public void setAnosDeVida(int anosDeVida) {
        if (anosDeVida >= 0) {
            this.anosDeVida = anosDeVida;
        } else {
            throw new IllegalArgumentException("A idade deve ser um valor positivo.");
        }
    }

    public void setEstatura(double estatura) {
        if (estatura > 0) {
            this.estatura = estatura;
        } else {
            throw new IllegalArgumentException("A altura deve ser maior que zero.");
        }
    }

    public void seApresentar() {
        System.out.println("Olá, meu nome é " + nomeCompleto + ", tenho " + anosDeVida + " anos e minha altura é " + estatura + " metros.");
    }
}
