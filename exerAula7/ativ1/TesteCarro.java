package ativ1;

public class TesteCarro {
    public static void main(String[] args) {
        Motor motorMustang = new Motor("V8", 400, TipoCombustivel.GASOLINA, 5000);
        Carro carro1 = new Carro("Mustang", motorMustang);

        Motor motorF150 = new Motor("V6", 300, TipoCombustivel.DIESEL, 3000);
        Carro carro2 = new Carro("F-150", motorF150);

        Motor motorTesla = new Motor("Elétrico", 450, TipoCombustivel.ELETRICO, 0);
        Carro carro3 = new Carro("Tesla Model S", motorTesla);

        carro1.ligarCarro();
        carro1.acionarAcelerador(500);
        carro1.turboBoost();
        carro1.acionarFreio(200);
        carro1.desligarCarro();

        carro2.ligarCarro();
        carro2.acionarAcelerador(300);
        carro2.reduzirPotenciaMotor();
        carro2.acionarFreio(150);
        carro2.desligarCarro();

        carro3.ligarCarro();
        carro3.acionarAcelerador(400);
        carro3.turboBoost();
        carro3.acionarFreio(100);
        carro3.desligarCarro();

        System.out.println("Carro 1: " + carro1.getModelo() + ", Motor: " + carro1.getMotor().getModelo() + ", Tipo de Combustível: " + carro1.getMotor().getTipoCombustivel());
        System.out.println("Carro 2: " + carro2.getModelo() + ", Motor: " + carro2.getMotor().getModelo() + ", Tipo de Combustível: " + carro2.getMotor().getTipoCombustivel());
        System.out.println("Carro 3: " + carro3.getModelo() + ", Motor: " + carro3.getMotor().getModelo() + ", Tipo de Combustível: " + carro3.getMotor().getTipoCombustivel());
    }
}