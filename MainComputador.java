public class MainComputador {
    public static void main(String[] args) throws Exception {
        
        Computador computador1 = new Computador();

        computador1.nome = "Ultra mega potente";
        computador1.placaVideo = "Nvidia gtx 2700";
        computador1.gbram = 16;
        computador1.processador = "i7";
        computador1.sistemaOperacional = "Windows";

        System.out.format("O computador %s possui a placa de video %s, com %dgb de ram, processador %s e SO %s\n",computador1.nome, computador1.placaVideo, computador1.gbram, computador1.processador, computador1.sistemaOperacional);

        Computador computador2 = new Computador();

        computador2.nome = "Ultra mega broxa";
        computador2.placaVideo = "Nvidia gtx 950";
        computador2.gbram = 5;
        computador2.processador = "i2";
        computador2.sistemaOperacional = "Windows";

        System.out.format("O computador %s possui a placa de video %s, com %dgb de ram, processador %s e SO %s",computador2.nome, computador2.placaVideo, computador2.gbram, computador2.processador, computador2.sistemaOperacional);

    }
}