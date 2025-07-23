package missao;

public class CriadorMissaoColeta extends CriadorDeMissao {
    @Override
    public Missao criarMissao() {
        // Esta fábrica é especialista em missões de coleta.
        return new MissaoDeColeta();
    }
}
