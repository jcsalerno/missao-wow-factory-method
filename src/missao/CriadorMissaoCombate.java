package missao;

public class CriadorMissaoCombate extends CriadorDeMissao{

    @Override
    public Missao criarMissao() {
        // Esta fábrica só sabe criar missões de combate.
        return new MissaoDeCombate();
    }
}
