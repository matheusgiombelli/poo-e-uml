package ativ16;

class Fauna {
    private String especieAnimal;
    private int idadeAnimal;
    private double massaCorporal;

    public String getEspecieAnimal() {
        return especieAnimal;
    }

    public int getIdadeAnimal() {
        return idadeAnimal;
    }

    public double getMassaCorporal() {
        return massaCorporal;
    }

    public void setEspecieAnimal(String especieAnimal) {
        if (especieAnimal != null && !especieAnimal.isEmpty()) {
            this.especieAnimal = especieAnimal;
        } else {
            throw new IllegalArgumentException("A espécie do animal não pode ser vazia.");
        }
    }

    public void setIdadeAnimal(int idadeAnimal) {
        if (idadeAnimal >= 0) {
            this.idadeAnimal = idadeAnimal;
        } else {
            throw new IllegalArgumentException("A idade do animal deve ser maior ou igual a zero.");
        }
    }

    public void setMassaCorporal(double massaCorporal) {
        if (massaCorporal > 0) {
            this.massaCorporal = massaCorporal;
        } else {
            throw new IllegalArgumentException("A massa corporal do animal deve ser maior que zero.");
        }
    }

    public void alimentarAnimal() {
        System.out.println("O animal " + especieAnimal + " está sendo alimentado.");
    }

    public void repousarAnimal() {
        System.out.println("O animal " + especieAnimal + " está repousando.");
    }
}
