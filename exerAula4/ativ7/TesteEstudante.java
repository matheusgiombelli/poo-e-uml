package ativ7;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante aluno = new Estudante();

        aluno.setNomeEstudante("Pedro Oliveira");
        aluno.setCodigoMatricula("20230102");
        aluno.setCursoAcademico("Engenharia de Software");
        aluno.setNotasSemestrais(new double[]{8.5, 9.0, 7.5, 10.0});

        System.out.println("Média de " + aluno.getNomeEstudante() + ": " + aluno.calcularMediaAritmetica());
    }
}
