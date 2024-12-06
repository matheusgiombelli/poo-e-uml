package ativ8;

public class TesteInstrutor {
    public static void main(String[] args) {
        Instrutor professor = new Instrutor();

        professor.setNomeInstrutor("Mariana Almeida");
        professor.setMateria("Matemática");
        professor.setValorSalario(3000.00);

        professor.ministrarAula();
        professor.avaliarProvas();

        System.out.println("Nome: " + professor.getNomeInstrutor());
        System.out.println("Matéria: " + professor.getMateria());
        System.out.println("Salário: R$ " + professor.getValorSalario());
    }
}