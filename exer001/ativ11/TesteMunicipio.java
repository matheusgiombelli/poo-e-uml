package ativ11;

public class TesteMunicipio {
    public static void main(String[] args) {
        Municipio cidade = new Municipio();
        cidade.nomeMunicipio = "São Paulo";
        cidade.totalPopulacao = 12000000;
        cidade.nomeEstado = "SP";
        cidade.aumentarPopulacao(5000);
        cidade.reduzirPopulacao(2000);
    }
}