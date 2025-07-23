package missao;

public class CriadorMissaoEscolta extends CriadorDeMissao{

    @Override
    public Missao criarMissao() {
        // E esta, em missões de escolta.
        return new MissaoDeEscolta();
    }
}
