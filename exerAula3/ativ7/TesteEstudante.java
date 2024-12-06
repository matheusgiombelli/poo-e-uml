package ativ7;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nomeEstudante = "Pedro Oliveira";
        aluno.codigoMatricula = "20230102";
        aluno.cursoAcademico = "Engenharia de Software";
        aluno.notasSemestrais = new double[]{8.5, 9.0, 7.5, 10.0};
        System.out.println("Média de " + aluno.nomeEstudante + ": " + aluno.calcularMediaAritmetica());
    }
}