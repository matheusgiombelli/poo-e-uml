package ativ11;

public class TesteMunicipio {
    public static void main(String[] args) {
        Municipio cidade = new Municipio();

        cidade.setNomeMunicipio("São Paulo");
        cidade.setTotalPopulacao(12000000);
        cidade.setNomeEstado("SP");

        cidade.aumentarPopulacao(5000);
        cidade.reduzirPopulacao(2000);

        System.out.println("Município: " + cidade.getNomeMunicipio());
        System.out.println("Estado: " + cidade.getNomeEstado());
        System.out.println("População: " + cidade.getTotalPopulacao());
    }
}