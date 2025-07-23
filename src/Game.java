import missao.CriadorDeMissao;
import missao.CriadorMissaoColeta;
import missao.CriadorMissaoCombate;
import missao.Missao;

public class Game {
    public static void main(String[] args) {

        // Imagine que o jogo precisa de uma missão de coleta agora.
        CriadorDeMissao criador = new CriadorMissaoColeta();
        Missao missaoAtual = criador.criarMissao();

        System.out.println("Nova missão recebida!");
        missaoAtual.iniciar(); // Saída: Colete 5 peles de lobo!

        // ... aqui o jogador realiza a missão ...

        System.out.println("\nMissão finalizada. Hora da recompensa!");
        missaoAtual.entregar(); // Saída: Ótimo! Aqui estão 50 moedas de ouro.

        System.out.println("--------------------");

        // Agora o jogo precisa de uma missão de combate.
        criador = new CriadorMissaoCombate();
        missaoAtual = criador.criarMissao();

        System.out.println("Nova missão recebida!");
        missaoAtual.iniciar(); // Saída: Elimine 10 inimigos!
        missaoAtual.entregar(); // Saída: Parabéns! Você ganhou 500 de experiência e uma espada.
    }


}


