package ativ8;

public class TesteInstrutor {
    public static void main(String[] args) {
        Instrutor professor = new Instrutor();
        professor.nomeInstrutor = "Mariana Almeida";
        professor.materia = "Matemática";
        professor.valorSalario = 3000.00;
        professor.ministrarAula();
        professor.avaliarProvas();
    }
}
