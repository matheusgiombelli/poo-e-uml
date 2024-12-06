package ativ1;

public class Carro {
    private String modelo;
    private Motor motor;

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        this.motor.ligar();
    }

    public void desligarCarro() {
        this.motor.desligar();
    }

    public void turboBoost() {
        this.motor.aumentarPotencia(50);
    }

    public void reduzirPotenciaMotor() {
        this.motor.reduzirPotencia(30);
    }

    public void acionarFreio(int decrementoRpm) {
        this.motor.reduzirRpm(decrementoRpm);
    }

    public void acionarAcelerador(int incrementoRpm) {
        this.motor.acelerar(incrementoRpm);
    }

    public String getModelo() {
        return this.modelo;
    }

    public Motor getMotor() {
        return this.motor;
    }
}