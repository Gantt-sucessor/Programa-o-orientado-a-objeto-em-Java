import java.util.Random;

public class Personagem {
    
    String player = "Misael";
    int nivel = 15;
    int forca = 35;
    String personagem = "Marcos";

    void Ola(String player, String personagem){

        System.out.format("Boa noite %s, bem vindo ao JOGO\n",player);
        System.out.format("%s é o nome do teu personagem!!\n",personagem);
        
    }

    void mostrarStatus(){

        System.out.format("%s de nivel %d tem %d de força\n",personagem, nivel, forca);

    }

    int calcularDano(){

        Random gerador = new Random();
        
        int dado20lados = 1 + gerador.nextInt(19);
        int dano = forca + dado20lados;
        return dano;

    }
    
    void atacar(String alvo, String habilidade){

        int danoCausado = calcularDano();

        if (habilidade.length() == 0){

            System.out.format("%s (lvl %d) atacou %s e causou %d de dano verdadeiro\n",personagem,nivel,alvo,danoCausado);

        }else {

            System.out.format("%s (lvl %d) usou '%s', atacou %s e causou %d de dano verdadeiro\n",personagem,nivel,habilidade,alvo,danoCausado);
        }

    }

   
}
