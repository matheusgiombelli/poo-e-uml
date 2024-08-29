package ativ18;

public class TesteBicicletaMontanha {
    public static void main(String[] args) {
        BicicletaMontanha bike = new BicicletaMontanha();
        bike.fabricante = "Caloi";
        bike.modeloBicicleta = "Elite Carbon";
        bike.tamanhoRodas = 29;
        bike.pedalarBicicleta();
        bike.aplicarFreio();
    }
}
