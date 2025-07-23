package missao;

public class MissaoDeCombate implements Missao {

    @Override
    public void iniciar() {
        System.out.println("Objetivo da Missão: Elimine 10 soldados da facção inimiga!");
    }

    @Override
    public void entregar() {
        System.out.println("Recompensa: Você ganhou 500 de experiência e uma Espada de Aço.");
    }
}