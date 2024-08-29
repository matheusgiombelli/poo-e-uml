package ativ8;

class Instrutor {
    String nomeInstrutor;
    String materia;
    double valorSalario;

    void ministrarAula() {
        System.out.println("Instrutor " + nomeInstrutor + " está dando aula de " + materia + ".");
    }

    void avaliarProvas() {
        System.out.println("Instrutor " + nomeInstrutor + " está corrigindo provas.");
    }
}
