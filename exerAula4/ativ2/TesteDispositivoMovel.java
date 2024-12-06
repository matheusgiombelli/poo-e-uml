package ativ2;

public class TesteDispositivoMovel {
    public static void main(String[] args) {
        DispositivoMovel meuCelular = new DispositivoMovel();

        meuCelular.setFabricante("Samsung");
        meuCelular.setModeloDispositivo("Galaxy A54");
        meuCelular.setCapacidadeBateria(4000);

        meuCelular.ativar();
        meuCelular.desativar();

        System.out.println("Fabricante: " + meuCelular.getFabricante());
        System.out.println("Modelo: " + meuCelular.getModeloDispositivo());
        System.out.println("Capacidade da bateria: " + meuCelular.getCapacidadeBateria());
        System.out.println("Está ligado: " + meuCelular.isEstaLigado());
    }
}