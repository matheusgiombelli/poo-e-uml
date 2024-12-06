package ativ7;

class Estudante {
    private String nomeEstudante;
    private String codigoMatricula;
    private String cursoAcademico;
    private double[] notasSemestrais;

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public String getCursoAcademico() {
        return cursoAcademico;
    }

    public double[] getNotasSemestrais() {
        return notasSemestrais;
    }

    public void setNomeEstudante(String nomeEstudante) {
        if (nomeEstudante != null && !nomeEstudante.isEmpty()) {
            this.nomeEstudante = nomeEstudante;
        } else {
            throw new IllegalArgumentException("O nome do estudante não pode ser vazio.");
        }
    }

    public void setCodigoMatricula(String codigoMatricula) {
        if (codigoMatricula != null && !codigoMatricula.isEmpty()) {
            this.codigoMatricula = codigoMatricula;
        } else {
            throw new IllegalArgumentException("O código de matrícula não pode ser vazio.");
        }
    }

    public void setCursoAcademico(String cursoAcademico) {
        if (cursoAcademico != null && !cursoAcademico.isEmpty()) {
            this.cursoAcademico = cursoAcademico;
        } else {
            throw new IllegalArgumentException("O curso acadêmico não pode ser vazio.");
        }
    }

    public void setNotasSemestrais(double[] notasSemestrais) {
        if (notasSemestrais != null && notasSemestrais.length > 0) {
            this.notasSemestrais = notasSemestrais;
        } else {
            throw new IllegalArgumentException("As notas semestrais devem conter pelo menos uma nota.");
        }
    }

    public double calcularMediaAritmetica() {
        double soma = 0;
        for (double nota : notasSemestrais) {
            soma += nota;
        }
        return soma / notasSemestrais.length;
    }
}
