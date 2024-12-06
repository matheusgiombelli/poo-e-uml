package ativ18;

public class TesteBicicletaMontanha {
    public static void main(String[] args) {
        BicicletaMontanha bike = new BicicletaMontanha();

        bike.setFabricante("Caloi");
        bike.setModeloBicicleta("Elite Carbon");
        bike.setTamanhoRodas(29);

        bike.pedalarBicicleta();
        bike.aplicarFreio();

        System.out.println("Fabricante: " + bike.getFabricante());
        System.out.println("Modelo: " + bike.getModeloBicicleta());
        System.out.println("Tamanho das rodas: " + bike.getTamanhoRodas() + " polegadas");
    }
}
