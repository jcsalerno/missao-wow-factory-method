package missao;

public abstract class CriadorDeMissao {

    public abstract Missao criarMissao();

    public void anunciarNovaMissao() {
        System.out.println("Um novo pergaminho de missão apareceu!");
    }

}
