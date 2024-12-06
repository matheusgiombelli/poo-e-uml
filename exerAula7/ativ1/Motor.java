package ativ1;

public class Motor {
    private String modelo;
    private int potencia;
    private TipoCombustivel tipoCombustivel;
    private int cilindradas;
    private boolean ligado;
    private int rpm;

    public Motor(String modelo, int potencia, TipoCombustivel tipoCombustivel, int cilindradas) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.cilindradas = cilindradas;
        this.ligado = false;
        this.rpm = 0;
    }

    public void ligar() {
        this.ligado = true;
        this.rpm = 1000;
    }

    public void desligar() {
        this.ligado = false;
        this.rpm = 0;
    }

    public void aumentarPotencia(int incremento) {
        this.potencia += incremento;
    }

    public void reduzirPotencia(int decremento) {
        this.potencia -= decremento;
    }

    public void acelerar(int incrementoRpm) {
        if (this.ligado) {
            this.rpm += incrementoRpm;
        }
    }

    public void reduzirRpm(int decrementoRpm) {
        if (this.ligado && this.rpm >= decrementoRpm) {
            this.rpm -= decrementoRpm;
        }
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public TipoCombustivel getTipoCombustivel() {
        return this.tipoCombustivel;
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public int getRpm() {
        return this.rpm;
    }
}