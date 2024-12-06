package ativ6;

public class TesteComputadorPessoal {
    public static void main(String[] args) {
        ComputadorPessoal meuPC = new ComputadorPessoal();
        meuPC.tipoProcessador = "Intel Core i7";
        meuPC.tamanhoMemoriaRAM = 16;
        meuPC.espacoArmazenamento = 512;
        meuPC.ligarSistema();
        meuPC.desligarSistema();
    }
}