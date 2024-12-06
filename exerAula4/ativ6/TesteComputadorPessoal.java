package ativ6;

public class TesteComputadorPessoal {
    public static void main(String[] args) {
        ComputadorPessoal meuPC = new ComputadorPessoal();

        meuPC.setTipoProcessador("Intel Core i7");
        meuPC.setTamanhoMemoriaRAM(16);
        meuPC.setEspacoArmazenamento(512);

        meuPC.ligarSistema();
        meuPC.desligarSistema();

        System.out.println("Processador: " + meuPC.getTipoProcessador());
        System.out.println("Memória RAM: " + meuPC.getTamanhoMemoriaRAM() + " GB");
        System.out.println("Armazenamento: " + meuPC.getEspacoArmazenamento() + " GB");
        System.out.println("Está ativo: " + meuPC.isEstaAtivo());
    }
}