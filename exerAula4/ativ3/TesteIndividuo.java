package ativ3;

public class TesteIndividuo {
    public static void main(String[] args) {
        Individuo pessoa1 = new Individuo();

        pessoa1.setNomeCompleto("Ana Silva");
        pessoa1.setAnosDeVida(30);
        pessoa1.setEstatura(1.68);

        pessoa1.seApresentar();

        System.out.println("Nome: " + pessoa1.getNomeCompleto());
        System.out.println("Idade: " + pessoa1.getAnosDeVida());
        System.out.println("Altura: " + pessoa1.getEstatura());
    }
}