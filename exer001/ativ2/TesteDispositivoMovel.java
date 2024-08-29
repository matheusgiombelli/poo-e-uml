package ativ2;

public class TesteDispositivoMovel {
    public static void main(String[] args) {
        DispositivoMovel meuCelular = new DispositivoMovel();
        meuCelular.fabricante = "Samsung";
        meuCelular.modeloDispositivo = "Galaxy A54";
        meuCelular.capacidadeBateria = 4000;
        meuCelular.ativar();
        meuCelular.desativar();
    }
}