package ativ8;

class Instrutor {
    private String nomeInstrutor;
    private String materia;
    private double valorSalario;

    public String getNomeInstrutor() {
        return nomeInstrutor;
    }

    public String getMateria() {
        return materia;
    }

    public double getValorSalario() {
        return valorSalario;
    }

    public void setNomeInstrutor(String nomeInstrutor) {
        if (nomeInstrutor != null && !nomeInstrutor.isEmpty()) {
            this.nomeInstrutor = nomeInstrutor;
        } else {
            throw new IllegalArgumentException("O nome do instrutor não pode ser vazio.");
        }
    }

    public void setMateria(String materia) {
        if (materia != null && !materia.isEmpty()) {
            this.materia = materia;
        } else {
            throw new IllegalArgumentException("A matéria não pode ser vazia.");
        }
    }

    public void setValorSalario(double valorSalario) {
        if (valorSalario > 0) {
            this.valorSalario = valorSalario;
        } else {
            throw new IllegalArgumentException("O valor do salário deve ser positivo.");
        }
    }

    public void ministrarAula() {
        System.out.println("Instrutor " + nomeInstrutor + " está dando aula de " + materia + ".");
    }

    public void avaliarProvas() {
        System.out.println("Instrutor " + nomeInstrutor + " está corrigindo provas.");
    }
}
