package ativ7;

class Estudante {
    String nomeEstudante;
    String codigoMatricula;
    String cursoAcademico;
    double[] notasSemestrais;

    double calcularMediaAritmetica() {
        double soma = 0;
        for (double nota : notasSemestrais) {
            soma += nota;
        }
        return soma / notasSemestrais.length;
    }
}